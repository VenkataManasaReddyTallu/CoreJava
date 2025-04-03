import java.util.*;

public class ProductCatalog {
    static class Product {
        String name;
        double price;

        Product(String name, double price) {
            this.name = name;
            this.price = price;
        }
    }

    public static void main(String[] args) {
        TreeMap<String, Product> productCatalog = new TreeMap<>();
        productCatalog.put("P001", new Product("Laptop", 1200.99));
        productCatalog.put("P002", new Product("Smartphone", 799.49));

        HashSet<Product> productSet = new HashSet<>();
        productSet.add(new Product("Tablet", 499.99));

        productCatalog.values().forEach(product -> System.out.println(product.name + " - " + product.price));
    }
}
