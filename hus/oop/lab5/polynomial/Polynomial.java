package hus.oop.lab5.polynomial;

public class Polynomial {

    private double[] coeffs;

    public Polynomial(double[] coeffs) {
        this.coeffs = coeffs;
    }

    public double getCoeff(int i) {
        return coeffs[i];
    }

    public void setCoeff(int i, double coeff) {
        coeffs[i] = coeff;
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = getDegree(); i >= 0; i--) {
            if (i == 0) {
                str.append(coeffs[i] + "");
                continue;
            }
            if (i == 1) {
                str.append(coeffs[i] + "x + ");
                continue;
            }
            str.append(coeffs[i] + "x^" + i + " + ");
        }
        return str.toString();
    }

    public double evaluate(double x) {
        double sum = 0;
        double term = 1;
        for (double coeff : coeffs) {
            sum += coeff * term;
            term *= x;
        }
        return sum;
    }

    public Polynomial add(Polynomial another) {
        if (another == null) {
            throw new NullPointerException();
        }

        int maxDeg = Math.max(getDegree(), another.getDegree());
        double[] result = new double[maxDeg + 1];

        int minDeg = Math.min(getDegree(), another.getDegree());
        for (int i = 0; i <= minDeg; i++) {
            result[i] = coeffs[i] + another.getCoeff(i);
        }

        for (int i = minDeg + 1; i <= maxDeg; i++) {
            try {
                result[i] = coeffs[i];
            } catch (ArrayIndexOutOfBoundsException e) {
                result[i] = another.getCoeff(i);
            }
        }

        coeffs = result;
        return this;
    }

    public Polynomial multiply(Polynomial another) {
        if (another == null) {
            throw new NullPointerException();
        }

        int maxDeg = getDegree() + another.getDegree();
        double[] result = new double[maxDeg + 1];
        for (int i = 0; i <= maxDeg; i++) {
            result[i] = 0;
        }

        for (int i = 0; i <= getDegree(); i++) {
            for (int j = 0; j <= another.getDegree(); j++) {
                result[i + j] += getCoeff(i) * another.getCoeff(j);
            }
        }

        coeffs = result;
        return this;
    }
}