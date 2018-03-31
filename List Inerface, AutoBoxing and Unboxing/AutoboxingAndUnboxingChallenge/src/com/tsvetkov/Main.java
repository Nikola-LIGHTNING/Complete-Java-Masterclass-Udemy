package com.tsvetkov;

import java.util.Scanner;

public class Main {
    private static Bank bank = new Bank("Bulgarian National Bank");
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;
        boolean quit = false;

        printInstructions();

        while(!quit) {
            System.out.print("Enter input: ");
            choice = scanner.nextInt();

            switch(choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    printBranches();
                    break;
                case 2:
                    addBranch();
                    break;
                case 3:
                    printCustomersInBranch();
                    break;
                case 4:
                    addNewCustomerInBranch();
                    break;
                case 5:
                    addCustomerTransaction();
                    break;
                case 6:
                    printCustomerTransactionsInBranch();
                    break;
                case 7:
                    printInstructions();
                    break;
            }
        }

    }

    public static void printInstructions() {
        System.out.println("Press");
        System.out.println("\t 0 - To Quit");
        System.out.println("\t 1 - To Print the Branches");
        System.out.println("\t 2 - To Add a Branch");
        System.out.println("\t 3 - To Print Customers in a Branch");
        System.out.println("\t 4 - To Add a new Customer to a Branch");
        System.out.println("\t 5 - To Add a transaction to a Customer in a Branch");
        System.out.println("\t 6 - To Print a Customer Transactions list in a Branch");
        System.out.println("\t 7 - To Print the Instructions");
    }

    public static void printBranches() {
        bank.printBranches();
    }

    public static void addBranch() {
        System.out.print("Enter a branch name: ");
        scanner.nextLine(); // clears buffer
        String name = scanner.nextLine();

        bank.addBranch(name);
    }

    public static void printCustomersInBranch() {
        System.out.print("Enter a branch name: ");
        scanner.nextLine();
        String branchName = scanner.nextLine();

        bank.printCustomersInBranch(branchName);
    }

    public static void addNewCustomerInBranch() {
        System.out.print("Enter a branch name: ");
        scanner.nextLine();
        String branchName = scanner.nextLine();

        System.out.print("Enter a customer name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter an initial transaction value: ");
        Double doubleValue = scanner.nextDouble();

        bank.addCustomerToBranch(branchName, customerName, doubleValue.doubleValue());
    }

    public static void addCustomerTransaction() {
        System.out.print("Enter a branch name: ");
        scanner.nextLine();
        String branchName = scanner.nextLine();

        System.out.print("Enter a customer name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter the transaction value: ");
        Double doubleValue = scanner.nextDouble();

        bank.addTransactionCustomerInBranch(branchName, customerName, doubleValue.doubleValue());
    }

    public static void printCustomerTransactionsInBranch() {
        System.out.print("Enter a branch name: ");
        scanner.nextLine();
        String branchName = scanner.nextLine();

        System.out.print("Enter a customer name: ");
        String customerName = scanner.nextLine();

        bank.printCustomerTransactionInBranch(customerName, branchName);
    }

}
