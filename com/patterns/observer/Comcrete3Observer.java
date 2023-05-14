package com.patterns.observer;

public class Comcrete3Observer implements MyObserver {
    private int state;


    @Override
    public void update(int state) {
        this.state = state;
        System.out.println("Observer3Observer state updated: " + state);
    }
}
