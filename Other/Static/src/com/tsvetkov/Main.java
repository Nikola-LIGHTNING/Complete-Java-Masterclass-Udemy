package com.tsvetkov;

public class Main {
    public static int multiplier = 7;

    public static void main(String[] args) {
//        StaticTest first = new StaticTest("First Instance");
//        System.out.println(first.getName() + " is instace " + StaticTest.getNumInstances());
//
//        StaticTest second = new StaticTest("Second Instance");
//        System.out.println(second.getName() + " is instace " + StaticTest.getNumInstances());
//
//        StaticTest third = new StaticTest("Third Instance");
//        System.out.println(third.getName() + " is instace " + StaticTest.getNumInstances());

        int answer = multiply(6);
        System.out.println("The answer is " + answer);
        System.out.println("Multiplier is " + multiplier);

    }

    public static int multiply(int number) {
        return number * multiplier;
    }
}
