package pattern.example.observer;

public class Bidder implements Observer {
    private String name;

    public Bidder(String name) {
        this.name = name;
    }

    @Override
    public void update(String itemName, double currentBid) {
        System.out.println(name + " received update: Current bid for " + itemName + " is $" + currentBid);
        // Xử lý các hành động khi nhận được thông báo thay đổi giá đấu
    }
}