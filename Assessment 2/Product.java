import java.util.*;
class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void comparePrice(Product other) {
        if (this.price < other.price) {
            System.out.println(this.name + " is cheaper than " + other.name);
        } else if (this.price > other.price) {
            System.out.println(this.name + " is costlier than " + other.name);
        } else {
            System.out.println(this.name + " and " + other.name + " have the same price.");
        }
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 50000);
        Product p2 = new Product("Tablet", 30000);
        p1.comparePrice(p2);
    }
}
