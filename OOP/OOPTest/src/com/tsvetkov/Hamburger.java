package com.tsvetkov;

public class Hamburger {
    private String breadRollType;
    private String meat;
    private String name;

    private double price;
    private String priceString;

    private boolean lettuce;
    private boolean tomato;
    private boolean carrot;
    private boolean cheese;

    public Hamburger(String breadRollType, String meat) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = 1.99;
    }

    public void printPrice() {
        priceString = price + " base price";
        if(lettuce) {
            price += 0.20;
            priceString += " + 0.20 for Lettuce";
        }

        if(tomato) {
            price += 0.15;
            priceString += " + 0.15 for Tomato";
        }

        if(carrot) {
            price += 0.10;
            priceString += " + 0.10 for Carrot";
        }

        if(cheese) {
            price += 0.50;
            priceString += " + 0.50 for Cheese";
        }

        priceString += " = " + price + " in total.";
        System.out.println(priceString);
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPriceString(String priceString) {
        this.priceString = priceString;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isLettuce() {
        return this.lettuce;
    }

    public void setLettuce(boolean lettuce) {
        this.lettuce = lettuce;
    }

    public boolean isTomato() {
        return tomato;
    }

    public void setTomato(boolean tomato) {
        this.tomato = tomato;
    }

    public boolean isCarrot() {
        return carrot;
    }

    public void setCarrot(boolean carrot) {
        this.carrot = carrot;
    }

    public boolean isCheese() {
        return cheese;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }
}
