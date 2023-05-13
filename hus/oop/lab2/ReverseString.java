package hus.oop.lab2;

import java.util.Scanner;

public class ReverseString {
    public static void reverseString(String myStr){
        System.out.print("The reverse of the String \"" + myStr + "\" is \"");
        for (int index = myStr.length() - 1; index >= 0; index--) {
            System.out.print(myStr.charAt(index));
        }
        System.out.println("\".");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String myStr = input.nextLine();
        input.close();
        reverseString(myStr);
    }
}
