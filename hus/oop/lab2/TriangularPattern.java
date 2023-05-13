package hus.oop.lab2;

public class TriangularPattern {
//    public static void printTriangular(int size){
//        int count = 1 ;
//        for (int i = 0; i < size; i++) {
//            for (int j = 0; j < count; j++) {
//                System.out.print("# ");
//            }
//            count++;
//            System.out.println();
//        }
//    }
    public static void printTringularC(int size){
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (col < row) {
                    System.out.print("  ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }
    public static void printTriangularA(int size){
        for (int row = 1; row <= size; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
    public static void printTriangularB(int size){
        int count = size ;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < count; j++) {
                System.out.print("# ");
            }
            count--;
            System.out.println();
        }
    }
    public static void printTriangularandom(int size){
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row + col < size + 1) {
                    System.out.print("  ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
          printTriangularA(5);
        System.out.println();
          printTriangularB(5);
        System.out.println();
          printTringularC(5);
        System.out.println();
          printTriangularandom(5);
    }
}
