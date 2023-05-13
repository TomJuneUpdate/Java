package hus.oop.lab2;

import java.util.Scanner;

public class HillPattern {
    public static void hillPatternA(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col < size * 2; col++) {
                if (col + row > size && col - row < size) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void hillPatternB(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col < size * 2; col++) {
                if (col >= row && col + row <= size * 2) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void hillPaternB(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col < size * 2; col++) {
                if (col >= row && col + row <= size * 2) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void hillPatternC(int size) {
        for (int row = 1; row < size * 2; row++) {
            for (int col = 1; col < size * 2; col++) {
                if (col + row > size && col - row < size && col - row > -size && col + row < size * 3) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void hillPatternD(int size) {
        for (int row = 1; row < size * 2; row++) {
            for (int col = 1; col < size * 2; col++) {
                if (col + row > size + 1
                        && col - row < size - 1
                        && col - row > -size + 1
                        && col + row < size * 3 - 1) {
                    System.out.print("  ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = Integer.parseInt(input.next());
        input.nextLine();
        hillPatternA(size);
        System.out.println("_________________________________");
        hillPaternB(size);
        System.out.println("_________________________________");
        hillPatternC(size);
        System.out.println("_________________________________");
        hillPatternD(size);


    }
}
