package hus.oop.lab2;

import java.util.Scanner;

public class CheckerPattern {
    public static void printChecker(int size){
        for (int row = 0; row < size; row++) {
            if (row % 2 == 0) {
                for (int col = 0; col < size; col++) {
                    System.out.print("# ");
                }
            } else {
                for (int col = 0; col < size; col++) {
                    System.out.print(" #");
                }
            }
            if (row <= size -2) {
                System.out.println();
            }

        }
    }
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = Integer.parseInt(input.next());
        printChecker(n);
    }
}
