package com.tsvetkov;

public class Bird extends Animal implements CanFly {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating..");
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " is breathing and is as fine as it gets!");
    }

    public void fly() {
        System.out.println(getName() + " is flying");
    }
}
