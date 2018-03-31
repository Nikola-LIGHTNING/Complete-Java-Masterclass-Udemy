package com.tsvetkov;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customerList;

    public Branch(String name) {
        this.name = name;
        this.customerList = new ArrayList<Customer>();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printCustomerList() {
        if(customerList.isEmpty()) {
            System.out.println("There are no customers in branch " + this.name + "(it probably sucks)");
        } else {
            for(int i = 0; i < this.customerList.size(); i++) {
                Customer customer = this.customerList.get(i);
                System.out.println((i+1) + ". " + customer.getName());
            }
        }
    }

    public void printCustomerTransactions(String name) {
        Customer customer = findCustomer(name);
        if(customer != null) {
            System.out.println("Transactions for customer " + name + " in branch " + this.name);
            customer.printTransactions();
        } else {
            System.out.println("No customer with name " + name + " in branch " + this.name + "!");
        }
    }


    public void addCustomer(String customerName, double initialTransaction) {
        Customer customer = findCustomer(customerName);
        if(customer != null) {
            System.out.println("A customer with the name " + customerName + " already exists in this branch.");
        } else {
            Customer newCustomer = new Customer(customerName);
            newCustomer.addTransaction(initialTransaction);
            customerList.add(newCustomer);
            System.out.println("Customer with name " + customerName + " and initial transaction "
                    + initialTransaction + " has been added to branch " + this.name + "!");
        }
    }

    public void addTransactionsToCustomer(String customerName, double transactionAmount) {
        Customer customer = findCustomer(customerName);
        if(customer != null) {
            customer.addTransaction(Double.valueOf(transactionAmount));
            System.out.println("Added " + transactionAmount + " to customer " + customerName);
        } else {
            System.out.println("There is no customer with name " + customerName + " in branch " + this.name + "!");
        }
    }

    private Customer findCustomer(String currentName) {

        for(int i = 0; i < customerList.size(); i++) {
            Customer customer = customerList.get(i);
            if(customer.getName().equals(currentName)) {
                return customer;
            }
        }

        return null;
    }

}
