package com.tsvetkov;

import java.util.*;

public class Location {
    private final String description;
    private final int locationID;
    private final Map<String, Integer> exits;

    public Location(int locationID, String description) {
        this.description = description;
        this.locationID = locationID;
        this.exits = new HashMap<String, Integer>();
        this.exits.put("Q", 0);
    }

    public String getDescription() {
        return this.description;
    }

    public int getLocationID() {
        return this.locationID;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<String, Integer>(exits);
    }

    public void addExit(String direction, int location) {
        this.exits.put(direction, location);
    }
}
