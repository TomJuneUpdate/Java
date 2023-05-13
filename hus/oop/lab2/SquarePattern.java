package hus.oop.lab2;

import java.util.Scanner;

public class SquarePattern {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = Integer.parseInt(input.next());
        input.nextLine();
        printSquareUsingFor(size);
        System.out.println("Below is the result using nested while-do loop.");
        printSquareUsingWhile(size);

    }

    public static void printSquareUsingFor(int size) {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (col == size - 1) {
                    System.out.print("#");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }

    public static void printSquareUsingWhile(int size) {
        int row = 0;
        while (row < size) {
            int col = 0;
            while (col < size) {
                if (col == size - 1) {
                    System.out.print("#");
                } else {
                    System.out.print("# ");
                }
                col++;
            }
            System.out.println();
            row++;
        }
    }
}