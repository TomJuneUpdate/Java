package pattern.example.observer;

import java.util.ArrayList;
import java.util.List;

public class Auction implements Subject {
    private String itemName;
    private double currentBid;
    private List<Observer> observers = new ArrayList<>();

    public Auction(String itemName) {
        this.itemName = itemName;
    }

    public void placeBid(double bid) {
        if (bid > currentBid) {
            currentBid = bid;
            notifyObservers(itemName, currentBid);
        } else {
            System.out.println("Bid not high enough");
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String itemName, double currentBid) {
        for (Observer observer : observers) {
            observer.update(itemName, currentBid);
        }
    }
}

