package com.tsvetkov;

public class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;
    private int speed;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.speed = 0;
    }

    public void startEngine() {
        System.out.println("Car.startEngine(): engine started");
    }

    public void accelerate(int rate) {
        this.speed += rate;
        System.out.println("Car.accelerate(): new Speed = " + this.speed);
    }

    public void brake(int rate) {
        this.speed /= rate;
        System.out.println("Car.brake(): new Speed = " + this.speed);
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
