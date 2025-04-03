package com.jdbc.examples;

import java.sql.*;

public class BatchProcessing {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/ecommerce_db";
        String user = "root";
        String password = "root"; // Update with your MySQL password

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement("INSERT INTO orders (customer_name, product, amount) VALUES (?, ?, ?)")) {

            conn.setAutoCommit(false); // Disable auto-commit

            pstmt.setString(1, "Mark");
            pstmt.setString(2, "Phone");
            pstmt.setDouble(3, 500.00);
            pstmt.addBatch();

            pstmt.setString(1, "Sophia");
            pstmt.setString(2, "Tablet");
            pstmt.setDouble(3, 300.00);
            pstmt.addBatch();

            pstmt.setString(1, "David");
            pstmt.setString(2, "Headphones");
            pstmt.setDouble(3, 120.00);
            pstmt.addBatch();

            int[] results = pstmt.executeBatch();
            conn.commit(); // Commit transaction

            System.out.println("Batch Inserted: " + results.length + " records");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
