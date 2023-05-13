package hus.oop.lab9.collections.polynomials;

public class AbstractPoly implements Poly {
    protected int degree;

    public AbstractPoly(){
    }

    double[] differentiate() {
        double[] newCoefficients = new double[degree + 1];
        for (int i = 1; i <= degree; i++) {
            newCoefficients[i - 1] = i * coefficients()[i];
        }
        return newCoefficients;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (this.degree != ((Poly)obj).degree()) {
            return false;
        }

        for (int i = 0; i < degree; i++) {
            if (this.coefficient(i) != ((Poly) obj).coefficient(i)) {
                return false;
            }
        }

        return true;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();

        str.append("Poly[");

        if (degree == 0) {
            str.append(coefficient(0)).append(']');
            return str.toString();
        }

        str.append(coefficient(0)).append(" + ");

        if (degree == 1) {
            str.append(coefficient(1)).append("x]");
            return str.toString();
        }

        for (int i = 1; i < degree; i++) {
            if (i == 1) {
                str.append(coefficient(i)).append("x + ");
            } else {
                str.append(coefficient(i)).append("x^").append(i).append(" + ");
            }
        }

        str.append(coefficient(degree)).append("x^").append(degree);
        str.append(']');

        return str.toString();
    }

    @Override
    public double coefficient(int i) {
        return this.coefficients()[i];
    }

    @Override
    public double[] coefficients() {
        return new double[degree];
    }

    @Override
    public int degree() {
        return this.degree;
    }

    @Override
    public Poly derivative() {
        return null;
    }

    @Override
    public double evaluate(double x) {

        double evaluate = this.coefficient(0);
        double t = 1;

        for (int i = 1; i <= this.degree; i++) {
            t *= x;
            evaluate += this.coefficient(i) * t;
        }

        return evaluate;
    }
}