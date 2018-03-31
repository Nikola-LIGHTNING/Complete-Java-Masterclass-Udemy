package com.tsvetkov;

public class Printer {
    private int tonerLevel = 10;
    private int pagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        if(tonerLevel >= 0 && tonerLevel  <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.pagesPrinted = 0;
        this.isDuplex = isDuplex;
    }

    public int fillToner(int amount) {
        if(amount > 0 && amount <= 100) {
            if(amount + this.tonerLevel > 100) {
                int extraAmount = (amount + this.tonerLevel) - 100;
                System.out.println("The toner is full so " + extraAmount + " is returned");
                return extraAmount;
            } else {
                System.out.println("The toner is filled to " + (this.tonerLevel + amount) + "%");
                this.tonerLevel += amount;
            }
        } else {
            System.out.println("Invalid amount");
        }

        return 0;
    }

    public void print(int pages, boolean isDuplex) {
        if(isDuplex && tonerLevel >= (pages / 2 + pages % 2) && this.isDuplex) {

            this.pagesPrinted += (pages / 2 + pages % 2);
            System.out.println("Duplex printer: " + (pages / 2 + pages % 2) + " pages printed");

            this.tonerLevel -= (pages / 2 + pages % 2);
            System.out.println("New toner level: " + getTonerLevel() + "%");

        } else if(!isDuplex && tonerLevel >= pages) {

            this.pagesPrinted += pages;
            System.out.println("Not a duplex printer: " + pages + " pages printed");

            this.tonerLevel -= pages;
            System.out.println("New toner level: " + getTonerLevel() + "%");
        } else {
            System.out.println("Not enough toner to print or invalid print settings." +
                    " Toner level: " + getTonerLevel() + "%");
        }
    }

    public int getTonerLevel() {
        return this.tonerLevel;
    }

    public int getPagesPrinted() {
        return this.pagesPrinted;
    }

    public boolean isDuplex() {
        return this.isDuplex;
    }
}
