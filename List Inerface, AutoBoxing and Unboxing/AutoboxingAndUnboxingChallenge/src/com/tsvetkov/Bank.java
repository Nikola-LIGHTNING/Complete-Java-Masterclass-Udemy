package com.tsvetkov;

import java.util.*;

public class Bank {
    private String name;
    private ArrayList<Branch> branchesList;

    public Bank(String name) {
        this.name = name;
        this.branchesList = new ArrayList<Branch>();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printBranches() {
        if(branchesList.isEmpty()) {
            System.out.println("There are no branches in bank " + this.name + "!");
        } else {
            System.out.println();
            System.out.println("Branches: ");
            for(int i = 0; i < branchesList.size(); i++) {
                Branch branch = branchesList.get(i);
                System.out.println((i + 1) + ". " + branch.getName());
            }
        }
    }

    public void addBranch(String name) {
        if(findBranch(name) == null) {
            branchesList.add(new Branch(name));
            System.out.println("Added a branch with name " + name + "!");
        } else {
            System.out.println("A branch with name " + name + " already exists!");
        }
    }

    public void printCustomersInBranch(String branchName) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            System.out.println("Customer list for branch " + branchName);
            branch.printCustomerList();
        } else {
            System.out.println("There is no branch with name " + branchName);
        }
    }

    public void printCustomerTransactionInBranch(String customerName, String branchName) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            branch.printCustomerTransactions(customerName);
        } else {
            System.out.println("There is no branch with name " + branchName);
        }
    }

    public void addCustomerToBranch(String branchName, String newCustomerName, double initialTransaction) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            branch.addCustomer(newCustomerName, initialTransaction);
        } else {
            System.out.println("There is no branch with name " + branchName + " in bank " + this.name + "!");
        }
    }

    public void addTransactionCustomerInBranch(String branchName, String customerName, double transactionAmount) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            branch.addTransactionsToCustomer(customerName, transactionAmount);
        } else {
            System.out.println("There is no customer with name " + customerName + " in branch " + branch.getName() + "!");
        }
    }

    private Branch findBranch(String name) {
        for(int i = 0; i < branchesList.size(); i++) {
            Branch branch = branchesList.get(i);
            if(branch.getName().equals(name)) {
                return branch;
            }
        }

        return null;
    }
}
