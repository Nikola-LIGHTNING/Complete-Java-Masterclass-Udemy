package com.tsvetkov;

public class Moon extends HeavenlyBody {

    public Moon(String name, double orbitalTime) {
        super(name, orbitalTime, BodyTypes.MOON);
    }
}
