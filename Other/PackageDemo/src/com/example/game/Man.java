package com.example.game;

import java.util.ArrayList;
import java.util.List;

public class Man implements ISaveable {
    private String name;
    private String metabolism;
    private int weight;
    private double height;

    public Man(String name, String metabolism, int weight, double height) {
        this.name = name;
        this.metabolism = metabolism;
        this.weight = weight;
        this.height = height;
    }

    public Man() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMetabolism() {
        return metabolism;
    }

    public void setMetabolism(String metabolism) {
        this.metabolism = metabolism;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<String>();
        values.add(0, this.name);
        values.add(1, this.metabolism);
        values.add(2, "" + this.weight);
        values.add(3, "" + this.height);

        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if((savedValues != null) && (savedValues.size() > 0)) {
            this.name = savedValues.get(0);
            this.metabolism = savedValues.get(1);
            this.weight = Integer.parseInt(savedValues.get(2));
            this.height = Double.parseDouble(savedValues.get(3));
        } else {
            System.out.println("There is nothing to read into object(man)!");
        }

    }

    @Override
    public String toString() {
        return ("A man with name " + this.name +
                " has a " + this.metabolism + " metabolism.\n" +
                "Height: " + this.height + " cm, Weight: " + this.weight + " kg");
    }
}
