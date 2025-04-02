import java.util.*;
import java.io.*;
//Multi-Catch Block: E-Commerce System
class ECommerce {
    public static void processOrder(String item, int quantity) {
        try {
            if (item == null) throw new NullPointerException("Item cannot be null");
            if (quantity <= 0) throw new IllegalArgumentException("Quantity must be positive");
            System.out.println("Order placed for " + quantity + " " + item);
        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        processOrder(null, 2);
        processOrder("Laptop", -1);
    }
}