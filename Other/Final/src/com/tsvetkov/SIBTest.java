package com.tsvetkov;

public class SIBTest {
    public static final String owner;

    static {
        owner = "Nikola";
        System.out.println("Static Initialization block called");
    }

    public SIBTest() {
        System.out.println("SIB constructor called");
    }

    static {
        System.out.println("2nd Initialization block called");
    }

    public void someMethod() {
        System.out.println("someMethod called");
    }
}
