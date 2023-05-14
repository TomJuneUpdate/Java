package com.patterns.strategies.sort;

import java.util.Arrays;

public class DataSet {
    private int[] data;
    private int[] backupData;
    private Sorter strategy;

    public DataSet() {
        this.data = new int[]{3,4,3,2,3,1,5,3,3};
        this.backupData = Arrays.copyOf(data, data.length);
    }

    public void setStrategy(Sorter strategy) {
        this.strategy = strategy;
    }

    public void sort(){
        this.strategy.sort(data);
    }
    public void reset() {
        System.arraycopy(backupData, 0, data, 0, backupData.length); // Sao chép các phần tử từ backupData vào data
    }
    public void print(){
        System.out.println(Arrays.toString(this.data));;
    }
}
