package hus.oop.lab3;

import java.util.Scanner;

public class GradesStatistics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberStudent = Integer.parseInt(sc.nextLine());
        int[] scores = inputScores(numberStudent, sc);
        outputScores(scores);
        System.out.printf("The average is: %d\n", getSumScore(scores));
        System.out.printf("The minimum: %d\n", getMinScore(scores));
        System.out.printf("The minimum: %d\n", getMinScore(scores));

    }

    public static int getSumScore(int[] scores) {
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        return sum;
    }

    public static void outputScores(int[] scores) {
        System.out.printf("Enter the number of student: %d\n", scores.length);
        int i = 1;
        for (int element : scores) {
            System.out.printf("Enter the grade for student %d: %d\n", i, element);
            i++;
        }
    }

    public static int getMaxScore(int[] scores) {
        if (scores.length == 0) {
            return -1;
        }
        int max = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
        }
        return max;
    }

    public static int getMinScore(int[] scores) {
        if (scores.length == 0) {
            return -1;
        }
        int min = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < min) {
                min = scores[i];
            }
        }
        return min;
    }

    public static int[] inputScores(int numberStudent, Scanner sc) {
        int[] scores = new int[numberStudent];
        for (int i = 0; i < numberStudent; i++) {
            scores[i] = Integer.parseInt(sc.nextLine());
        }
        return scores;
    }
}
