package com.tsvetkov;

public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount("123", 3000,
                "kolio@sap.com", "Kolio", "0877 you wish");
        BankAccount defaultAccount = new BankAccount();

//        account.setAccountNumber("123");
//        account.setBalance(3000);
//        account.setCustomerEmail("kolio@sap.com");
//        account.setCustomerName("Kolio");
//        account.setCustomerPhone("0877 you wish");

        System.out.println("Balance: " + account.getBalance());
        System.out.println("Account number: " + account.getAccountNumber());
        System.out.println("Customer e-mail: " + account.getCustomerEmail());
        System.out.println("Customer name: " + account.getCustomerName());
        System.out.println("Customer phone: " + account.getCustomerPhone());

        System.out.println("*****************");

        System.out.println("Balance: " + defaultAccount.getBalance());
        System.out.println("Account number: " + defaultAccount.getAccountNumber());
        System.out.println("Customer e-mail: " + defaultAccount.getCustomerEmail());
        System.out.println("Customer name: " + defaultAccount.getCustomerName());
        System.out.println("Customer phone: " + defaultAccount.getCustomerPhone());

        System.out.println("*****************");

        account.deposit(4000);
        account.withdrawal(3000);
        account.withdrawal(4000);
        account.withdrawal(200);

        System.out.println("*****************");

        BankAccount kolioAccount = new BankAccount("Nikola", "nikola@sap.bg", "0877737342");

        System.out.println(kolioAccount.getAccountNumber());
        System.out.println(kolioAccount.getBalance());
        System.out.println(kolioAccount.getCustomerName());
        System.out.println(kolioAccount.getCustomerEmail());
        System.out.println(kolioAccount.getCustomerPhone());

        System.out.println("*****************");

        VipCustomer gery = new VipCustomer("Gergana", 1000, "geryty@abv.bg");

        System.out.println(gery.getName());
        System.out.println(gery.getCreditLimit());
        System.out.println(gery.getEmail());

        System.out.println("*****************");

        VipCustomer koko = new VipCustomer("Nikola", 1000);

        System.out.println(koko.getName());
        System.out.println(koko.getCreditLimit());
        System.out.println(koko.getEmail());

        System.out.println("*****************");

        VipCustomer adam = new VipCustomer();

        System.out.println(adam.getName());
        System.out.println(adam.getCreditLimit());
        System.out.println(adam.getEmail());

    }
}
