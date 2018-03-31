package com.tsvetkov;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Nikola", 777.69);
        Customer anotherCustomer = customer;
        anotherCustomer.setBalance(12.18);
        System.out.println("Balance for customer " + anotherCustomer.getName() +
                " is " + anotherCustomer.getBalance());

        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(23);
        intList.add(777);
        intList.add(999);

        for(int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }

        intList.add(1, 2);

        System.out.println();
        for(int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }
    }
}
