package com.tsvetkov;

public class Car extends Vehicle{
    private String steer;
    private String model;
    private int gear;
    private int electric;


    public Car(String model, int electric) {
        this.model = model;
        this.electric = electric;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void changeGear(int gear) {
        if(gear >= 0 && gear < 6) {
            this.gear = gear;
        } else {
            System.out.println("Invalid gear");
        }
    }

    public int getGear() {
        return this.gear;
    }

    public void steer(String steer) {
        steer = steer.toLowerCase();
        if(steer.equals("left")) {
            this.steer = "left";
        } else if(steer.equals("right")) {
            this.steer = "right";
        } else {
            System.out.println("You can only steer left or right");
        }
    }

    public String getSteer() {
        return this.steer;
    }

}
