package hus.oop.lab2;

import java.util.Scanner;

public class DecipherCaesarCode {
    public static void  decipherCaesarCode(String myStr){
        for (int index = 0; index < myStr.length(); index++) {
            if ("DEFGHIJKLMNOPQRSTUVWXYZ".indexOf(myStr.charAt(index)) != -1) {
                System.out.print((char) (myStr.charAt(index) - 3));
            } else if ("ABC".indexOf(myStr.charAt(index)) != -1) {
                System.out.print((char) (myStr.charAt(index) + 23));
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a ciphertext string: ");
        String myStr = input.nextLine().toUpperCase();
        input.close();

        System.out.print("The plaintext string is: ");
        decipherCaesarCode(myStr);
    }
}
