package hus.oop.lab2;

import java.util.Scanner;

public class BoxPattern {
    public static void boxPatternA(int size) {
        for (int row = 1; row <= size; row++) {
            System.out.print("# ");
            if (row == 1 || row == size)
                for (int col = 2; col <= size - 1; col++)
                System.out.print("# ");
            else
                for (int col = 2; col <= size - 1; col++)
                System.out.print("  ");
            System.out.println("#");
        }
    }

    public static void boxPatternB(int size) {
        for (int col = 1; col < size; col++)
            System.out.print("# ");
        System.out.println("#");
        for (int row = 2; row < size; row++) {
            for (int col = 1; col < row; col++)
                System.out.print("  ");
            System.out.println("#");
        }
        for (int col = 1; col < size; col++)
            System.out.print("# ");
        System.out.println("#");
    }

    public static void boxPatternC(int size) {
        for (int col = 1; col < size; col++)
            System.out.print("# ");
        System.out.println("#");
        for (int row = 2; row < size; row++) {
            for (int col = 1; row + col < size + 1; col++)
                System.out.print("  ");
            System.out.println("#");
        }
        for (int col = 1; col < size; col++)
            System.out.print("# ");
        System.out.println("#");
    }

    public static void boxPatternD(int size) {
        for (int col = 1; col < size; col++) {
            System.out.print("# ");
        }
        System.out.println("#");

        for (int row = 2; row < size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == col || row + col == size + 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for (int col = 1; col < size; col++) {
            System.out.print("# ");
        }
        System.out.println("#");

    }
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = Integer.parseInt(input.next());
        boxPatternA(n);
        System.out.println("-----------------");
        boxPatternB(n);
        System.out.println("-----------------");
        boxPatternC(n);
        System.out.println("-----------------");
        boxPatternD(n);
    }
}
