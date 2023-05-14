package com.patterns.observer.observerpatterndemo;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        BinaryObserver binaryObserver = new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("=======================");
        // xoa binary ra khoi observer
        subject.remove(binaryObserver);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}