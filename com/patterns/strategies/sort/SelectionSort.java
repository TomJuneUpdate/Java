package com.patterns.strategies.sort;

public class SelectionSort implements Sorter {
    @Override
    public void sort(int[] data) {
        int n = data.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (data[j] < data[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = data[min_idx];
            data[min_idx] = data[i];
            data[i] = temp;
        }
    }
}
