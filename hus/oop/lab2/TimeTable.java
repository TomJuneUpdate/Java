package hus.oop.lab2;

import java.util.Scanner;

public class TimeTable {
    public static void main(String[] args) {
        int size = input();
        timeTable(size);
    }

    public static int input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = Integer.parseInt(sc.next());
        return size;
    }
    public static void timeTable(int size) {
        String gachthang = " | ";
        String gachngang = "-----";
        for (int row = 0; row <= size; row++) {
            if (row == 0) {
                System.out.printf("%4s ", "*");
                System.out.printf("%4s", gachthang);
                for (int col = 1; col <= size; col++) {
                    System.out.printf("%4d", col);
                }
                System.out.println("");
                for (int count = 0; count <= size; count++) {
                    System.out.printf("%4s", gachngang);
                }
                System.out.println("");
            } else {
                System.out.printf("%4d", row);
                System.out.printf("%4s", gachthang);
                for (int col = 1; col <= size; col++) {
                    System.out.printf("%4d", col * row);
                }
                System.out.println("");
            }
        }
    }
}