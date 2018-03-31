package com.tsvetkov;

public class MobilePhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Started mobile phone..");
    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn) {
            System.out.println("Calling " + phoneNumber + " from mobile phone");
        } else {
            System.out.println("Your phone is switched off!");
        }
    }

    @Override
    public void answer() {
        if(isRinging) {
            System.out.println("Hello, who is there? (Answering mobile phone)");
            isRinging = false;
        } else {
            System.out.println("No one is calling :( (or phone is not on)");
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if((phoneNumber == myNumber) && isOn) {
            isRinging = true;
            System.out.println("Ring, ring, it's your consciousness calling ");
        } else {
            isRinging = false;
            System.out.println("Mobile phone not on or number different");
        }

        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return this.isRinging;
    }

}
