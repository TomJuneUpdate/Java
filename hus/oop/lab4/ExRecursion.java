package hus.oop.lab4;

public class ExRecursion {
    public static void main(String[] args) {
        int a = 6;
        int b = 5;
        // find gcd
        System.out.println(gcdUsingRecursion(a, b));
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else return n * factorial(n - 1);
    }

    public static int fibonancci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonancci(n - 1) + fibonancci(n - 2);
        }
    }

    public static int lengthNumberSequence(int n) {
        int count = 0;
        for (int i = 0; i <= n; i++) {
            count += numOfDigits(i);
        }
        return count;
    }

    public static int lengthOfNumberSequence(int n) {
        if (n == 1) {
            return 1;
        }
        return lengthNumberSequence(n - 1) + numOfDigits(n);
    }

    public static int numOfDigits(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        return count;
    }

    public static int gcdUsingRecursion(int bigger, int smaller) {
        if (bigger == 0) return bigger;
        if (bigger % smaller == 0) return smaller;
        return gcdUsingRecursion(smaller, bigger % smaller);
    }

}
