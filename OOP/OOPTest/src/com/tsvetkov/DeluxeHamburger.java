package com.tsvetkov;

public class DeluxeHamburger extends Hamburger {
    private boolean chips;
    private boolean drinks;
    private String priceString;

    public DeluxeHamburger(String breadRollType, String meat) {
        super(breadRollType, meat);
        this.chips = true;
        this.drinks = true;
        setPrice(1.99 + 0.99 + 0.99);
    }

    @Override
    public void printPrice() {
        System.out.printf("1.99 base price + 0.99 for chips + 0.99 for drinks" +
                " = %.2f in total.", getPrice());
    }
}
