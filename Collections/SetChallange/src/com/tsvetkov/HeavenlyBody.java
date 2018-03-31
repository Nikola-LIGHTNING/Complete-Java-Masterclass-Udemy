package com.tsvetkov;

import java.util.HashSet;
import java.util.Set;

public class HeavenlyBody {
    private final String name;
    private final double orbitalTime;
    private final Set<HeavenlyBody> sattelites;
    private final String bodyType;

    public HeavenlyBody(String name, double orbitalTime, String bodyType) {
        this.name = name;
        this.orbitalTime = orbitalTime;
        this.sattelites = new HashSet<HeavenlyBody>();
        this.bodyType = bodyType;
    }

    public String getName() {
        return this.name;
    }

    public double getOrbitalTime() {
        return this.orbitalTime;
    }

    public Set<HeavenlyBody> getSattelites() {
        return new HashSet<HeavenlyBody>(sattelites);
    }

    public String getBodyType() {
        return this.bodyType;
    }

    public boolean addSattelite(HeavenlyBody body) {
        if(this.bodyType.equals("PLANET") && !body.getBodyType().equals("MOON")) {
            System.out.println("You cannnot add " + body.getBodyType().toLowerCase() +
                    "s as sattelites to a planet!");
            return false;
        }

        return this.sattelites.add(body); // creating a HashSet
        // with the current content of the sattelites HashSet
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }

        System.out.println("obj.getClass() is " + obj.getClass());
        System.out.println("this.getClass() is " + this.getClass());
        if((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }

        String objName = ((HeavenlyBody) obj).getName();
        if(this.name.equals(objName)) {
            String objBodyType = ((HeavenlyBody) obj).getBodyType();
            return this.bodyType.equals(objBodyType);
        } else {
            return false;
        }

    }

    @Override
    public int hashCode() {
        System.out.println("hashCode() called");
        return this.name.hashCode() + 69;
    }

}
