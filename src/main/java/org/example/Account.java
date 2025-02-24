/*Implement the Account class in Account.java.
The Account class must include the following methods and member variables:
A double member variable to hold the current account balance.
public Account() {...}: The default constructor should initialize the balance to 0.0.
public void deposit(double amount) {...}: A deposit method to add money to the account.
public double withdraw(double amount) {...}: A withdraw method that withdraws the given amount from the account. If the amount given can be withdrawn, it should return that amount. If not, it should return 0.0.
public double getBalance() {...}: A method to get the current balance in the account.*/
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

