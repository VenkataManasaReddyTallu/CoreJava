package com.jdbc.examples;

import java.sql.*;

public class OrderManagement {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/ecommerce_db";
        String user = "root";
        String password = "root"; // Update with your MySQL password

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {

            // Insert a new order
            String insertQuery = "INSERT INTO orders (customer_name, product, amount) VALUES ('John Doe', 'Laptop', 750.50)";
            stmt.executeUpdate(insertQuery);

            // Fetch orders
            String selectQuery = "SELECT * FROM orders";
            ResultSet rs = stmt.executeQuery(selectQuery);

            System.out.println("Orders List:");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("order_id") + ", Customer: " + rs.getString("customer_name") +
                        ", Product: " + rs.getString("product") + ", Amount: $" + rs.getDouble("amount"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
