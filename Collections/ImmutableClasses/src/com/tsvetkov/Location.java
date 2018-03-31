package com.tsvetkov;

import java.util.HashMap;
import java.util.Map;

public class Location {
    private final String description;
    private final int locationID;
    private final Map<String, Integer> exits;

    public Location(int locationID, String description, Map<String, Integer> exits) {
        this.description = description;
        this.locationID = locationID;
        if(exits != null) {
            this.exits = new HashMap<String, Integer>(exits);
        } else {
            this.exits = new HashMap<String, Integer>();
        }
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

//    public void addExit(String direction, int location) {
//        this.exits.put(direction, location);
//    }
}
