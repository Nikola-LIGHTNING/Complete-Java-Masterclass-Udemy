package com.tsvetkov;

public class Penguin extends Bird {

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("I'm not very good that.. can I swim instead?");
    }
}
