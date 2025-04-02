import java.util.*;
//Payment System using Method Overloading
class Payment {
    void makePayment(int amount) {
        System.out.println("Payment of Rs." + amount + " made using cash.");
    }

    void makePayment(int amount, String cardNumber) {
        System.out.println("Payment of Rs." + amount + " made using card ending " + cardNumber);
    }

    void makePayment(int amount, String upi, boolean isUPI) {
        System.out.println("Payment of Rs." + amount + " made using UPI: " + upi);
    }

    public static void main(String[] args) {
        Payment pay = new Payment();
        pay.makePayment(1000);
        pay.makePayment(2000, "1234-5678-9012-3456");
        pay.makePayment(500, "user@upi", true);
    }
}
