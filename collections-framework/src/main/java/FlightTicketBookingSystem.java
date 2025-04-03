import java.util.*;

public class FlightTicketBookingSystem {
    static class Flight {
        String flightNumber;
        int priority;

        Flight(String flightNumber, int priority) {
            this.flightNumber = flightNumber;
            this.priority = priority;
        }

        @Override
        public String toString() {
            return "Flight{" + "flightNumber='" + flightNumber + '\'' + ", priority=" + priority + '}';
        }
    }

    public static void main(String[] args) {
        Queue<Flight> flightQueue = new LinkedList<>();
        flightQueue.add(new Flight("AB123", 1));
        flightQueue.add(new Flight("CD456", 2));

        // PriorityQueue with Comparator
        PriorityQueue<Flight> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(f -> f.priority));
        priorityQueue.add(new Flight("XY789", 3));
        priorityQueue.add(new Flight("MN456", 1));

        System.out.println("Flight Queue: " + flightQueue);
        System.out.println("Priority Flight Queue: " + priorityQueue);
    }
}
