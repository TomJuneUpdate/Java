package hus.oop.lab3;

public class Exponent {
    public static void main(String[] args) {
        int base = 5;
        int exp =3;
        System.out.printf("Enter the base: %d\n", base);
        System.out.printf("Enter the base: %d\n", exp);
        System.out.printf("%d raises to the power of %d is: %d", base, exp, getExpUsingFor(base, exp));
    }

    public static int getExpUsingFor(int base, int exp) {
        int product = 1;
        for (int i = 0; i < exp; i++) {
            product *= base;
        }
        return product;
    }
}
