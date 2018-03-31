package com.tsvetkov;

public class Main {

    public static void main(String[] args) {
        Tesla nikola = new Tesla("Model S", 1, 100);

        nikola.setSpeed(100);
        System.out.println(nikola.getSpeed());

        nikola.park();
        nikola.chargeBattery();
        nikola.steer("LEFT");
        System.out.println(nikola.getSteer());
    }
}
