package com.github.vamsiampolu;

public class SavingsAccount {
    private int balance;
    public void deposit(int amount) {
        balance = balance + amount;
    }

    public int balance() {
        return balance;
    }

    public void withdraw(int amount) {
        balance = balance - amount;
    }
}
