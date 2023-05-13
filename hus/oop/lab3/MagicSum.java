package hus.oop.lab3;

import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(getMagicSum(sc));

    }

    public static boolean hasEight(int number) {
        String str = Integer.toString(number);
        return str.contains("8");
    }

    public static int getMagicSum(Scanner sc) {
        int sum = 0;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a positive integer (or -1 to end): ");
            int number = input.nextInt();
            if (number == -1) {
                break;
            }

            if (hasEight(number)) {
                sum += number;
            }
        }
        input.close();
        return sum;

    }


}
