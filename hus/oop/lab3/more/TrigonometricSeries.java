package hus.oop.lab3.more;

import java.util.Scanner;

public class TrigonometricSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numTerm = sc.nextInt();
        System.out.println(sin(Math.PI/5,numTerm));
    }
    // x in radians
    public static double sin(double x, int numTerms) {
        double sum = x;
        double term = x;
        for (int n = 3; n < numTerms; n += 2) {
            term *= -(x * x) / (n * (n - 1));
            sum += term;
        }
        return sum;
    }

    public static double cos(double x, int numTerms) {
        double sum = 1;
        double term = 1;
        for (int n = 2; n < numTerms; n += 2) {
            term *= -(x * x) / (n * (n - 1));
            sum += term;
        }
        return sum;
    }
}
