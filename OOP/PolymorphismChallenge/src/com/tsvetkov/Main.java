package com.tsvetkov;

class Tesla extends Car {

    public Tesla() {
        super("Model S", 4);
    }

    @Override
    public void startEngine() {
        System.out.println("Tesla.startEngine(): Tesla engine started");
    }

    @Override
    public void brake(int rate) {
        setSpeed(getSpeed()/(3*rate));
        System.out.println("Tesla.brake(): new Speed = " + getSpeed());
    }

    @Override
    public void accelerate(int rate) {
        setSpeed(getSpeed() + 3*rate);
        System.out.println("Tesla.accelerate(): new Speed = " + getSpeed());
    }
}

class Alpha extends Car {

    public Alpha() {
        super("Alpha Romeo", 2);
    }

    @Override
    public void startEngine() {
        System.out.println("Alpha.startEngine(): Alpha engine started");
    }

    @Override
    public void brake(int rate) {
        setSpeed(getSpeed()/(2*rate));
        System.out.println("Alpha.brake(): new Speed = " + getSpeed());
    }

    @Override
    public void accelerate(int rate) {
        setSpeed(getSpeed() + 2*rate);
        System.out.println("Alpha.accelerate(): new Speed = " + getSpeed());
    }
}

class VW extends Car {

    public VW() {
        super("Golf 2", 6);
    }

    @Override
    public void startEngine() {
        System.out.println("Golf.startEngine(): Golf engine started");
    }

    @Override
    public void brake(int rate) {
        setSpeed(getSpeed()/rate);
        System.out.println("Golf.brake(): new Speed = " + getSpeed());
    }

    @Override
    public void accelerate(int rate) {
        setSpeed(getSpeed() + 5*rate);
        System.out.println("Golf.accelerate(): new Speed = " + getSpeed());
    }
}

class Unknown extends Car {

    public Unknown() {
        super("Unnamed", 10);
    }
}

public class Main {

    public static void main(String[] args) {
        Car car;

        for(int i = 0; i < 10; i++) {
            int randomNumber = (int) (Math.random() * 4 + 1);
            car = randomCar(randomNumber);
            System.out.println(car.getName());
            car.startEngine();
            car.accelerate(20);
            car.brake(10);
            System.out.println();
        }
    }

    public static Car randomCar(int randomNumber) {
        switch(randomNumber) {
            case 1:
                return new Tesla();
            case 2:
                return new Alpha();
            case 3:
                return new VW();
            case 4:
                return new Unknown();
            default:
                return null;
        }
    }
}

