package hus.oop.lab3;

import java.util.Random;

public class Print {
    public static void main(String[] args) {
        Random random = new Random();

        int numElements = random.nextInt(9) + 2;
        int[] emptyArray = {};
        int[] oneElementArray = {random.nextInt(10)};
        int[] array = new int[numElements];
        for (int i = 0; i < numElements; i++) {
            array[i] = random.nextInt(10);
        }

        print(emptyArray);
        print(oneElementArray);
        print(array);

    }

    public static void print(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println("]");
    }
}
