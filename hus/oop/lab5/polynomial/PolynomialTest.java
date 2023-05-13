package hus.oop.lab5.polynomial;

class PolynomialTest {

    public static void main(String[] args) {
        Polynomial polynomial = new Polynomial(new double[]{1, 2, 3, 4});
        Polynomial polynomial2 = new Polynomial(new double[]{1, 2, 3});
        System.out.println(polynomial);
        System.out.println(polynomial.add(polynomial2));
        System.out.println(polynomial.multiply(polynomial2));
    }
}
