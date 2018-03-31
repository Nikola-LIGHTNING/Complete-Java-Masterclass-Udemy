package com.tsvetkov;

public class Fish extends Animal {
    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest() {

    }

    private void moveMuscles() {
        System.out.println("Fish.moveMuscles() called. It's flexing :O");
    }

    private void moveBackFins() {
        System.out.println("Fish.moveBackFins() called. Look at those curves, mmMM!");
    }

    public void swim(int speed) {
        System.out.println("Fish.swim() called. It's swimming m8");
        moveMuscles();
        moveBackFins();
        super.move(speed);
    }
}
