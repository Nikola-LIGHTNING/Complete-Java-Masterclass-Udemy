package com.tsvetkov;

public class Vehicle {
    private int speed;

    public void setSpeed(int speed) {
        if(speed >= 0) {
            this.speed = speed;
        } else {
            System.out.println("You can't have negative speed");
        }
    }

    public int getSpeed() {
        return this.speed;
    }
}
