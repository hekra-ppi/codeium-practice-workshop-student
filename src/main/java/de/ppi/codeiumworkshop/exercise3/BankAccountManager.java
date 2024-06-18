package de.ppi.codeiumworkshop.exercise3;

public class BankAccountManager {
    private String accountHolder;
    private double balance;

    public BankAccountManager(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }


    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String name) {
        this.accountHolder = name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance > amount) {
            System.out.println("Insufficient funds for withdrawal");
        } else {
            balance -= amount;
        }
    }

}
