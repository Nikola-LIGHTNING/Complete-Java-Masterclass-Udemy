package com.tsvetkov;

public class Main {

    public static void main(String[] args) {
        Hamburger basic = new Hamburger("Healthy bread", "Chicken");
        basic.setName("Bill");

        basic.printPrice();
        basic.setLettuce(true);
        basic.setTomato(true);
        basic.setCarrot(false);
        basic.setCheese(true);
        basic.printPrice();

        HealthyBurger healthyBurger = new HealthyBurger("Pork");

        healthyBurger.printPrice();
        healthyBurger.setCabbage(true);
        healthyBurger.setCucumber(false);
        healthyBurger.setCheese(true);
        healthyBurger.printPrice();

        DeluxeHamburger deluxeHamburger = new DeluxeHamburger("White bread", "Lamb");

        deluxeHamburger.printPrice();
        deluxeHamburger.setCarrot(true);
    }
}
