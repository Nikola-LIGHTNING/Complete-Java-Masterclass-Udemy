package com.tsvetkov;

public class Main {

    public static void main(String[] args) {
        Car tesla = new Car();
        Car audi = new Car();

        System.out.println("Model is " + tesla.getModel());
        tesla.setModel("Model S");
        System.out.println("Model is " + tesla.getModel());
    }
}
