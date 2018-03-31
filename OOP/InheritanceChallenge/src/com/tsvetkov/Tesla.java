package com.tsvetkov;

public class Tesla extends Car {
    private int battery;

    public Tesla(String model, int electric, int battery) {
        super(model, electric);
        this.battery = battery;
    }


    public void chargeBattery() {
        if(battery < 100) {
            battery = 100;
        } else {
            System.out.println("Battery is fully charged");
        }
    }

    public void park() {
        System.out.println("A tesla " + getModel() + " is parking without human help");
    }

}
