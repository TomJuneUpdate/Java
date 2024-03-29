package hus.oop.lab9.collections.polynomials;

public class ArrayPoly extends AbstractPoly {
    private double[] coefficients;

    public ArrayPoly(double[] coefficients) {
        this.coefficients = coefficients;
        super.degree = coefficients.length - 1;
    }

    public ArrayPoly plus(ArrayPoly other) {
        reduce();
        int maxDegree = Math.max(super.degree, other.degree());
        double[] newCoefficients = new double[maxDegree + 1];

        for (int i = 0; i < maxDegree; i++) {
            newCoefficients[i] = this.coefficients[i] + other.coefficient(i);
        }

        return new ArrayPoly(newCoefficients);
    }

    public ArrayPoly minus(ArrayPoly other) {
        reduce();
        int maxDegree = Math.max(super.degree, other.degree());
        double[] newCoefficients = new double[maxDegree + 1];

        for (int i = 0; i < maxDegree; i++) {
            newCoefficients[i] = this.coefficients[i] - other.coefficient(i);
        }

        return new ArrayPoly(newCoefficients);
    }

    public ArrayPoly times(ArrayPoly other) {
        reduce();
        int maxDegree = Math.max(super.degree, other.degree());
        double[] newCoefficients = new double[maxDegree + 1];

        for (int i = 0; i < maxDegree; i++) {
            newCoefficients[i] = this.coefficients[i] * other.coefficient(i);
        }

        return new ArrayPoly(newCoefficients);
    }

    private void reduce() {
        if (super.degree == 0) {
            return;
        }
        for (int i = degree(); i >= 0; i--) {
            if (this.coefficients[i] == 0) {
                super.degree--;
            } else {
                break;
            }
        }
    }

    @Override
    public Poly derivative() {
        reduce();

        double[] newCoefficients;

        if (degree == 0) {
            newCoefficients = new double[1];
        } else {
            newCoefficients = new double[degree];
        }

        for (int i = 1; i <= degree; i++) {
            newCoefficients[i - 1] = i * this.coefficient(i);
        }

        return new ArrayPoly(newCoefficients);
    }

    @Override
    public double coefficient(int i) {
        return super.coefficient(i);
    }

    @Override
    public double[] coefficients() {
        reduce();
        return this.coefficients;
    }

    public String type() {
        return "Array Poly";
    }
}