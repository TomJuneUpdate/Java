package hus.oop.lab3;

import java.util.Scanner;

public class PrintArrayInStars {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printStar(inputArr(sc));

    }

    public static void printStar(int[] items) {
        for (int i = 0; i < items.length; i++) {
            System.out.print(i + ":");
            for (int j = 0; j < items[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static int[] inputArr(Scanner sc) {

        System.out.print("Enter the number of items :");
        int number = Integer.parseInt(sc.nextLine());
        System.out.print("Enter the value of all items :");
        int[] items = new int[number];
        for (int i = 0; i < number; i++) {
            items[i] = Integer.parseInt(sc.next());
        }
        return items;
    }
}
