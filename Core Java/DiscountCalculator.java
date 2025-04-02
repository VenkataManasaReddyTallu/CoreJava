import java.util.*;
public class DiscountCalculator {
    public static double calculateDiscount(double amount) {
        return (amount > 500) ? amount * 0.9 : amount * 0.95;
    }
    public static void main(String[] args) {
        System.out.println(calculateDiscount(600));
    }
}