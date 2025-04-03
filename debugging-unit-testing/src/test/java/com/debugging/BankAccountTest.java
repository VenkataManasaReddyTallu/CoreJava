package com.debugging;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class BankAccountTest {

    @Test
    void testDeposit() {
        BankAccount account = new BankAccount(1000);
        account.deposit(500);
        assertEquals(1500, account.getBalance());
    }

    @Test
    void testWithdraw() {
        BankAccount account = new BankAccount(1000);
        account.withdraw(400);
        assertEquals(600, account.getBalance());
    }

    @Test
    void testWithdrawInsufficientFunds() {
        BankAccount account = new BankAccount(500);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(600);
        });
        assertEquals("Insufficient funds", exception.getMessage());
    }

    @ParameterizedTest
    @ValueSource(doubles = {100.0, 200.0, 300.0})
    void testParameterizedDeposit(double amount) {
        BankAccount account = new BankAccount(500);
        account.deposit(amount);
        assertEquals(500 + amount, account.getBalance());
    }
}
