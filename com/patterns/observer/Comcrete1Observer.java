package com.patterns.observer;

public class Comcrete1Observer implements MyObserver {
    private int state;


    @Override
    public void update(int state) {
        this.state = state;
        System.out.println("Observer10server state updated: " + state);
    }
}
