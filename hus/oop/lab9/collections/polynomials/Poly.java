package hus.oop.lab9.collections.polynomials;

public interface Poly {
    double coefficient(int degree);

    double[] coefficients();

    int degree();

    Poly derivative();

    double evaluate(double x);
}
