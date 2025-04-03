package com.jdbc.examples;

import java.sql.*;

public class EmployeeDatabase {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/ecommerce_db";
        String user = "root";
        String password = "root"; // Update with your MySQL password

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement("INSERT INTO employees (name, department, salary) VALUES (?, ?, ?)")) {

            // Insert Employee
            pstmt.setString(1, "Alice");
            pstmt.setString(2, "HR");
            pstmt.setDouble(3, 55000);
            pstmt.executeUpdate();

            // Fetch Employees
            String selectQuery = "SELECT * FROM employees";
            try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(selectQuery)) {
                System.out.println("Employee List:");
                while (rs.next()) {
                    System.out.println("ID: " + rs.getInt("emp_id") + ", Name: " + rs.getString("name") +
                            ", Dept: " + rs.getString("department") + ", Salary: $" + rs.getDouble("salary"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
