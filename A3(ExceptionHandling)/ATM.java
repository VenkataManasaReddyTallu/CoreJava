import java.util.*;
import java.io.*;
class ATM {
    public static void withdraw(double balance, double amount) {
        try {
            try {
                if (amount > balance) {
                    throw new ArithmeticException("Insufficient funds");
                }
                System.out.println("Withdrawal successful: " + amount);
            } catch (ArithmeticException e) {
                System.out.println("Inner Catch: " + e.getMessage());
                throw e;
            }
        } catch (Exception e) {
            System.out.println("Outer Catch: Handling exception gracefully.");
        }
    }
    public static void main(String[] args) {
        withdraw(1000, 1500);
    }
}
