package hus.oop.lab2;

import java.util.Scanner;

public class CountVowelsDigits {
    //diff
    public static void countVowels(String myChar){
        final String VOWELS = "aeiuo";
        int numVowels = 0;
        int numDigits = 0;
        for (int index = 0; index < myChar.length(); index++) {
            if (VOWELS.indexOf(myChar.charAt(index)) != -1) {
                numVowels++;
            } else if (Character.isDigit(myChar.charAt(index))) {
                numDigits++;
            }
        }

        System.out.printf(
                "Number of vowels: %d (%.2f%%)%n", numVowels, (double) numVowels / myChar.length() * 100);
        System.out.printf(
                "Number of digits: %d (%.2f%%)%n", numDigits, (double) numDigits / myChar.length() * 100);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String myChar = input.nextLine().toLowerCase();
        countVowels(myChar);
        input.close();

    }
}
