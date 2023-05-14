package pattern.example.observer;

public class Client {
    public static void main(String[] args) {
        Auction auction = new Auction("Painting");

        Observer bidder1 = new Bidder("Bidder 1");
        Observer bidder2 = new Bidder("Bidder 2");

        auction.registerObserver(bidder1);
        auction.registerObserver(bidder2);

        auction.placeBid(100);
        auction.placeBid(150);
        auction.placeBid(200);

        auction.removeObserver(bidder2);

        auction.placeBid(250);
    }
}

