package hus.oop.lab3.more;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Enter matrix
        int[][] matrix1=enterMatrix(input);
        int[][] matrix2=enterMatrix(input);
        // Print matrix
        print(matrix1);


    }
    public static int[][] enterMatrix(Scanner input){
        System.out.print("Enter row and col matrix: ");
        int row = Integer.parseInt(input.next());
        int col = Integer.parseInt(input.next());
        int[][] intMatrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                intMatrix[i][j] = Integer.parseInt(input.next());
            }
        }
        return intMatrix;
    }
    /** Prints matrices. */
    public static void print(int[][] matrix) {
        if (matrix == null) {
            throw new NullPointerException();
        }

        for (int i=0;i<matrix.length;i++) {
            for (int j=0;j<matrix[0].length;j++) {
                System.out.printf("%3d ", matrix[i][j]);
            }
            System.out.println();
        }
    }
    /**
     * Checks if 2 matrices have the same dimension.
     */
    public static boolean haveSameDimension(int[][] matrix1, int[][] matrix2) {
        return matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length;
    }

    public static boolean haveSameDimension(double[][] matrix1, double[][] matrix2) {
        return matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length;
    }

    /**
     * Adds 2 matrices.
     */
    public static int[][] add(int[][] matrix1, int[][] matrix2) {
        if (!Matrix.haveSameDimension(matrix1, matrix2)) {
            return null;
        }

        int numRows = matrix1.length;
        int numCols = matrix1[0].length;
        int[][] sumMatrix = new int[numRows][numCols];

        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                sumMatrix[row][col] = matrix1[row][col] + matrix2[row][col];
            }
        }
        return sumMatrix;
    }

    public static double[][] add(double[][] matrix1, double[][] matrix2) {
        if (!Matrix.haveSameDimension(matrix1, matrix2)) {
            return null;
        }

        int numRows = matrix1.length;
        int numCols = matrix1[0].length;
        double[][] sumMatrix = new double[numRows][numCols];

        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                sumMatrix[row][col] = matrix1[row][col] + matrix2[row][col];
            }
        }
        return sumMatrix;
    }

    /**
     * Subtracts 2 matrices.
     */
    public static int[][] subtract(int[][] matrix1, int[][] matrix2) {
        if (!Matrix.haveSameDimension(matrix1, matrix2)) {
            return null;
        }

        int numRows = matrix1.length;
        int numCols = matrix1[0].length;
        int[][] sumMatrix = new int[numRows][numCols];

        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                sumMatrix[row][col] = matrix1[row][col] - matrix2[row][col];
            }
        }
        return sumMatrix;
    }

    public static double[][] subtract(double[][] matrix1, double[][] matrix2) {
        if (!Matrix.haveSameDimension(matrix1, matrix2)) {
            return null;
        }

        int numRows = matrix1.length;
        int numCols = matrix1[0].length;
        double[][] sumMatrix = new double[numRows][numCols];

        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                sumMatrix[row][col] = matrix1[row][col] - matrix2[row][col];
            }
        }
        return sumMatrix;
    }

    /**
     * Multiplies 2 matrices.
     */
    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        if (!(matrix1[0].length == matrix2.length)) {
            return null;
        }

        int numRows = matrix1.length;
        int numCols = matrix2[0].length;
        int[][] productMatrix = new int[numRows][numCols];

        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                productMatrix[row][col] = 0;
                for (int i = 0; i < matrix2.length; i++) {
                    productMatrix[row][col] += matrix1[row][i] * matrix2[i][col];
                }
            }
        }
        return productMatrix;
    }

    public static double[][] multiply(double[][] matrix1, double[][] matrix2) {
        if (!(matrix1[0].length == matrix2.length)) {
            return null;
        }

        int numRows = matrix1.length;
        int numCols = matrix2[0].length;
        double[][] productMatrix = new double[numRows][numCols];

        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                productMatrix[row][col] = 0;
                for (int i = 0; i < matrix2.length; i++) {
                    productMatrix[row][col] += matrix1[row][i] * matrix2[i][col];
                }
            }
        }
        return productMatrix;
    }
}

