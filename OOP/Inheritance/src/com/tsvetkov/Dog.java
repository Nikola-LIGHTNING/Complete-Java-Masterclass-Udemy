package com.tsvetkov;

public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog.chew() invoked");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() invoked");
        chew();
        super.eat();
    }

    public void walk() {
        System.out.println("Dog.walk() is called. A dog is walking");
        super.move(3);
    }

    public void run() {
        System.out.println("Dog.run() is called. A dog is running");
        move(7);
    }

    private void moveLegs(int speed) {
        System.out.println("Dog.moveLegs(int speed) is called");
    }


    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }

}
