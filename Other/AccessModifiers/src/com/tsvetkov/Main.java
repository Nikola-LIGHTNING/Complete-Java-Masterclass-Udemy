package com.tsvetkov;

public class Main {

    public static void main(String[] args) {
        Account kokoAccount = new Account("Tim");
        kokoAccount.deposit(200);
        kokoAccount.withdraw(100);
        kokoAccount.withdraw(-25);
        kokoAccount.deposit(-20);
        kokoAccount.calculateBalance();
        kokoAccount.balance = 5000;
        System.out.println("Balance on account is " + kokoAccount.balance);

        kokoAccount.transactions.add(4900);
        kokoAccount.calculateBalance();
        System.out.println("Balance on account is " + kokoAccount.balance);

    }
}
