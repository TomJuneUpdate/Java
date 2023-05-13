package hus.oop.lab3;

import java.util.Scanner;

public class Hex2Bin {
    public static void main(String[] args) {
        final String[] HEX_BITS = {
                "0000", "0001", "0010", "0011",
                "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011",
                "1100", "1101", "1110", "1111"
        };
        outHex(HEX_BITS);


    }

    public static void outHex(String[] hex_bits) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal string: ");
        String inStr = input.nextLine();
        input.close();

        System.out.print("The equivalent binary for hexadecimal \"" + inStr + "\" is:");
        for (int index = 0; index < inStr.length(); index++) {
            if (Character.isDigit(inStr.charAt(index))) {
                System.out.print(" " + hex_bits[inStr.charAt(index) - '0']);
            } else {
                switch (inStr.toUpperCase().charAt(index)) {
                    case 'A':
                        System.out.print(" " + hex_bits[10]);
                        break;
                    case 'B':
                        System.out.print(" " + hex_bits[11]);
                        break;
                    case 'C':
                        System.out.print(" " + hex_bits[12]);
                        break;
                    case 'D':
                        System.out.print(" " + hex_bits[13]);
                        break;
                    case 'E':
                        System.out.print(" " + hex_bits[14]);
                        break;
                    case 'F':
                        System.out.print(" " + hex_bits[15]);
                        break;
                }
            }
        }
        System.out.println();
    }
}
