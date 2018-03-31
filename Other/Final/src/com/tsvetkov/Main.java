package com.tsvetkov;

public class Main {

    public static void main(String[] args) {
//        SomeClass one = new SomeClass("one");
//        SomeClass two = new SomeClass("two");
//        SomeClass three = new SomeClass("three");
//
//        System.out.println(one.getInstanceNumber());
//        System.out.println(two.getInstanceNumber());
//        System.out.println(three.getInstanceNumber());
//
////        one.instanceNumber = 4; error
//
//        System.out.println(Math.PI);
////        Math m = new Math(); Math has a private constructor so nobody is allowed to instantiate it
//
//        int pw = 777;
//        Password myPassword = new ExtendedPassword(pw);
//        myPassword.storePassword();
//
//        myPassword.letMeIn(2323);
//        myPassword.letMeIn(1);
//        myPassword.letMeIn(666);
//        myPassword.letMeIn(69);
//        myPassword.letMeIn(777);
        System.out.println("Main method called");
        SIBTest test = new SIBTest();
        test.someMethod();
        System.out.println("Owner is " + SIBTest.owner);

    }
}
