import java.util.*;

public class OnlineAuctionSystem {
    static class Bid implements Comparable<Bid> {
        String bidderName;
        int bidAmount;

        Bid(String bidderName, int bidAmount) {
            this.bidderName = bidderName;
            this.bidAmount = bidAmount;
        }

        @Override
        public int compareTo(Bid other) {
            return Integer.compare(other.bidAmount, this.bidAmount); // descending order of bid
        }
    }

    public static void main(String[] args) {
        Queue<Bid> bidQueue = new PriorityQueue<>();
        bidQueue.add(new Bid("Alice", 500));
        bidQueue.add(new Bid("Bob", 700));

        while (!bidQueue.isEmpty()) {
            System.out.println("Bidder: " + bidQueue.poll().bidderName);
        }
    }
}
