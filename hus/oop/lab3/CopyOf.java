package hus.oop.lab3;

import java.util.Arrays;
import java.util.Random;

public class CopyOf {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = creatArr(random);
        System.out.println("The array is: " + Arrays.toString(arr));

        int newLength = random.nextInt(18) + 2;
        System.out.println("The new length is: " + newLength);

        System.out.println("The exact copy is: " + Arrays.toString(copyOf(arr)));
        System.out.println("The copy with new length: " + Arrays.toString(copyOf(arr, newLength)));

    }

    public static int[] creatArr(Random random) {
        int numElements = random.nextInt(9) + 2;
        int[] array = new int[numElements];
        for (int i = 0; i < numElements; i++) {
            array[i] = random.nextInt(10);
        }
        return array;
    }

    public static int[] copyOf(int[] array) {
        int[] result = new int[array.length];
        System.arraycopy(array, 0, result, 0, array.length);
        return result;
    }

    public static int[] copyOf(int[] array, int newLength) {
        int[] result = new int[newLength];
        for (int i = 0; i < newLength; i++) {
            try {
                result[i] = array[i];
            } catch (ArrayIndexOutOfBoundsException e) {
                result[i] = 0;
            }
        }
        return result;
    }
}
