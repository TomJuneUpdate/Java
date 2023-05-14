package com.patterns.observer;


import java.util.ArrayList;
import java.util.List;

public class SubjectObserver implements Subject {
    List<MyObserver> observersList = new ArrayList<>();
    private int stateMain;
    public void setState(int state) {
        this.stateMain = state;
        notifyObservers();
    }

    @Override
    public void registerObserver(MyObserver observer) {
        observersList.add(observer);
    }

    @Override
    public void removeObserver(MyObserver observer) {
        observersList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (MyObserver element : observersList ) {
            element.update(stateMain);
        }
    }
}
