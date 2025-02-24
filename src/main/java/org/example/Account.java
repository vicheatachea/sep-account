package org.example;

public class Account {
    int balance;

    public Account () {
        balance = 0;
    }

    public void deposit (double amount) {
        balance += amount;
    }

    public double withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return amount;
        } else {
            return 0.0;
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main (String [] args) {
        Account account = new Account();
        account.deposit(100);
        System.out.println(account.getBalance());
        System.out.println(account.withdraw(50));
        System.out.println(account.getBalance());

    }
}

