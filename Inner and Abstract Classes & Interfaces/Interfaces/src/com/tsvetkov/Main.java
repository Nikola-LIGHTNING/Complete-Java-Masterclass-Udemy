package com.tsvetkov;

public class Main {

    public static void main(String[] args) {
        ITelephone koliosPhone;
        koliosPhone = new DeskPhone(340069);

        koliosPhone.powerOn();
        koliosPhone.callPhone(340069);
        koliosPhone.answer();


        koliosPhone = new MobilePhone(777);
        koliosPhone.powerOn();
        koliosPhone.callPhone(777);
        koliosPhone.answer();
    }
}
