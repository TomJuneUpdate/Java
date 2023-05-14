package com.patterns.strategies.sort;

public class StrategySortDrive {
    public static void main(String[] args) {
        DataSet dataSet = new DataSet();
        dataSet.setStrategy(new BubbleSort());
        dataSet.sort();
        dataSet.print();
        dataSet.reset();
        dataSet.print();

    }
}
