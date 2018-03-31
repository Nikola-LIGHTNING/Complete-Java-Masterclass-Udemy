package com.tsvetkov;

public class Planet extends HeavenlyBody {

    public Planet(String name, double orbitalTime) {
        super(name, orbitalTime, BodyTypes.PLANET);
    }

    @Override
    public boolean addSattelite(HeavenlyBody body) {
        if(body.getKey().getBodyType() != BodyTypes.MOON) {
            System.out.println("You cannnot add " + body.getKey().getBodyType() + "s as sattelites to a planet!");
            return false;
        } else {
            return super.addSattelite(body);
        }

    }
}
