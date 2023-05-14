package com.patterns.observer;

public class Comcrete2Observer implements MyObserver{
    private int state;


    @Override
    public void update(int state) {
        this.state = state;
        System.out.println("Observer2Oserver state updated: " + state);
    }
}
