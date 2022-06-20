package org.aarouf;

public class BankAccount {
    private double balance;
    private double minimumBalance;
    private boolean isActive = true;

    private String holder;



    public BankAccount(double balance, double minimumBalance) {
        this.balance = balance;
        this.minimumBalance = minimumBalance;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    public double withdraw(double amount){
        if (balance - amount > minimumBalance){
            balance -= amount;
            return amount;
        }else {
            throw  new RuntimeException();
        }
    }

    public double deposit(double amount){
        return balance+=amount;
    }
}
