package com.tsvetkov;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name) {
        this.name = name;
        transactions = new ArrayList<Double>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addTransaction(double amount) {
        transactions.add(Double.valueOf(amount));
    }

    public void printTransactions() {
        for(int i = 0; i < transactions.size(); i++) {
            System.out.println("Transaction " + (i + 1) + ": " + transactions.get(i));
        }
    }
}
