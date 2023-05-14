package com.patterns.observer;

public class Text {
    public static void main(String[] args) {
        Comcrete1Observer observer1 = new Comcrete1Observer();
        Comcrete2Observer observer2 = new Comcrete2Observer();
        Comcrete3Observer observer3 = new Comcrete3Observer();
        SubjectObserver subjectObserver = new SubjectObserver();

        subjectObserver.registerObserver(observer1);
        subjectObserver.registerObserver(observer2);
        subjectObserver.registerObserver(observer3);

        subjectObserver.setState(2034);

    }
}
