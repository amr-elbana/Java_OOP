package com.company;

public class Account {

    private String id;
    private String name;
    private int balance = 0;


    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }



    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int credit(int amount) {
        balance += amount;
        return balance;
    }


    public int debit(int amount) {

        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    public int transferTo(Account to, int amount) {
        if (amount <= balance) {
            to.balance += amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return to.balance;
    }
}




