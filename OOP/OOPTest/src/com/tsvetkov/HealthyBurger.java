package com.tsvetkov;

public class HealthyBurger extends Hamburger {
    private boolean cucumber;
    private boolean cabbage;
    private String priceString;
    public HealthyBurger(String meat) {
        super("brown rye", meat);
    }

    @Override
    public void printPrice() {
        priceString = getPrice() + " base price";
        if(isLettuce()) {
            setPrice(getPrice() + 0.20);
            priceString += " + 0.20 for Lettuce";
        }

        if(isTomato()) {
            setPrice(getPrice() + 0.15);
            priceString += " + 0.15 for Tomato";
        }

        if(isCarrot()) {
            setPrice(getPrice() + 0.10);
            priceString += " + 0.10 for Carrot";
        }

        if(isCheese()) {
            setPrice(getPrice() + 0.50);
            priceString += " + 0.50 for Cheese";
        }

        if(cucumber) {
            priceString += " + 0.20 for Cucumber";
            setPrice(getPrice() + 0.20);
        }

        if(cabbage) {
            priceString += " + 0.30 for Cabbage";
            setPrice(getPrice() + 0.30);
        }

        priceString += " = " + getPrice() + " in total.";
        System.out.println(priceString);
    }

    public boolean isCucumber() {
        return this.cucumber;
    }

    public void setCucumber(boolean cucumber) {
        this.cucumber = cucumber;
    }

    public boolean isCabbage() {
        return this.cabbage;
    }

    public void setCabbage(boolean cabbage) {
        this.cabbage = cabbage;
    }

}
