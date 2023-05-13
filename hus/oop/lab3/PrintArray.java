package hus.oop.lab3;

import java.util.Scanner;

public class PrintArray {

    public static void main(String[] args) {
        final int NUM_ITEMS;
        Scanner sc = new Scanner(System.in);
        NUM_ITEMS = Integer.parseInt(sc.nextLine());
        int[] items;
        items = inputArr(sc, NUM_ITEMS);
        getArr(items);

    }

    public static void getArr(int[] items) {
        System.out.print("The values are: [");

        for (int i = 0; i < items.length; i++) {
            if (i < items.length - 1)
                System.out.print(items[i] + ", ");
            else System.out.print(items[i - 1]);
        }

        System.out.println("]");
    }

    public static int[] inputArr(Scanner sc, int number) {
        System.out.println("Enter the number of items: " + number);
        System.out.print("Enter the value of all items(separated by space) :");
        int[] items = new int[number];
        for (int i = 0; i < number; i++) {
            items[i] = Integer.parseInt(sc.next());
            // next lấy 1 phần tử
            // nextline lấy cả dòng
        }
        return items;
    }
}
