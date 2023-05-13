package hus.oop.lab9.collections.polynomials;

import java.util.ArrayList;
import java.util.List;

public class ListPoly extends AbstractPoly {
    private List<Double> coefficients;

    public ListPoly(double[] coefficients) {
        this.coefficients = new ArrayList<>();
        for (double coefficient : coefficients) {
            this.coefficients.add(coefficient);
        }
        super.degree = coefficients.length - 1;
    }

    public ListPoly plus(ListPoly other) {
        reduce();
        int maxDegree = Math.max(super.degree, other.degree());
        double[] newCoefficients = new double[maxDegree + 1];

        for (int i = 0; i < maxDegree; i++) {
            newCoefficients[i] = this.coefficients.get(i) + other.coefficient(i);
        }

        return new ListPoly(newCoefficients);
    }

    public ListPoly minus(ListPoly other) {
        reduce();
        int maxDegree = Math.max(super.degree, other.degree());
        double[] newCoefficients = new double[maxDegree + 1];

        for (int i = 0; i < maxDegree; i++) {
            newCoefficients[i] = this.coefficients.get(i) - other.coefficient(i);
        }

        return new ListPoly(newCoefficients);
    }

    public ListPoly times(ListPoly other) {
        reduce();
        int maxDegree = Math.max(super.degree, other.degree());
        double[] newCoefficients = new double[maxDegree + 1];

        for (int i = 0; i < maxDegree; i++) {
            newCoefficients[i] = this.coefficients.get(i) * other.coefficient(i);
        }

        return new ListPoly(newCoefficients);
    }

    private void reduce() {
        if (super.degree == 0) {
            return;
        }
        for (int i = degree; i >= 0; i--) {
            if (this.coefficients.get(i) == 0) {
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

        return new ListPoly(newCoefficients);
    }

    @Override
    public double coefficient(int degree) {
        reduce();
        return this.coefficients.get(degree);
    }

    @Override
    public double[] coefficients() {
        reduce();
        double[] arrayCoefficients = new double[super.degree + 1];
        for (int i = 0; i < super.degree; i++) {
            arrayCoefficients[i] = this.coefficient(i);
        }
        return arrayCoefficients;
    }

    public String type() {
        return "List Poly";
    }
}