package hus.oop.lab4;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 8};
        System.out.println(binarySearchUsingIterater(arr, 0, 6, 4));
        System.out.println(binarySearchUsingRecursion(arr, 0, 6, 4));
    }

    public static int binarySearchUsingRecursion(int arr[], int left, int right, int key) {
        if (right >= left) {
            int mid = left + (right - left) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == key)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > key)
                return binarySearchUsingRecursion(arr, left, mid - 1, key);

            // Else the element can only be present
            // in right subarray
            return binarySearchUsingRecursion(arr, mid + 1, right, key);
        }

        // We reach here when element is not present
        // in array
        return -1;
    }

    public static int binarySearchUsingIterater(int[] arr, int left, int right, int key) {

        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] > key) {
                left = mid - 1;
            } else {
                right = mid + 1;
            }
        }
        return -1;
    }
}
