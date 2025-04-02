import java.util.*;
public class ATMWithdrawal {
    public static void atmWithdrawal(int amount) {
        if (amount % 100 != 0) {
            System.out.println("Enter amount in multiples of 100");
            return;
        }
        System.out.println("Dispensing: " + amount);
    }
    public static void main(String[] args) {
        atmWithdrawal(500);
    }
}
