import java.util.*;
//Constructor Chaining in a Banking System
class Bank {
    Bank() {
        System.out.println("Banking System Initialized.");
    }
}

class Account extends Bank {
    Account() {
        super();
        System.out.println("Account Created.");
    }

    public static void main(String[] args) {
        new Account();
    }
}