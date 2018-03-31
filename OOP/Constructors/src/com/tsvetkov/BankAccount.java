package com.tsvetkov;

public class BankAccount {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public BankAccount() {
        this("00000", 0.00, "Default name",
                "Default E-mail", "Default phone");
        System.out.println("Empty constructor called");
    }

    public BankAccount(String customerName, String customerEmail, String customerPhone) {
        this("0000", 100, customerName, customerEmail, customerPhone);
    }

    public BankAccount(String number, double balance, String customerName, String customerEmail, String customerPhone) {
        System.out.println("Account constructor with parameters called");

        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }

    public void setAccountNumber(String number) {
        this.number = number;
    }

    public String getAccountNumber() {
        return this.number;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerEmail() {
        return this.customerEmail;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerPhone() {
        return this.customerPhone;
    }

    public void deposit(double sum) {
        System.out.println("Balance before deposit: " + sum);
        this.balance += sum;
        System.out.println("Balance amount after deposit: " + this.balance);
    }

    public void withdrawal(double amount) {
        if(amount <= this.balance) {
            System.out.println("Amount before withdraw: " + this.balance);
            this.balance -= amount;
            System.out.println("Amount after withdraw: " + this.balance);
        } else {
            System.out.println("Not enough money to withdraw. Current balance: " + this.balance);
        }
    }



}
