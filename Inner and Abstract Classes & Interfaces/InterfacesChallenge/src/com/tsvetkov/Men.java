package com.tsvetkov;

import java.util.ArrayList;

public class Men implements ISaveable {
    private ArrayList<String> menFields;
    private String name;
    private String metabolism;
    private int weight;
    private double height;

    public Men(String name, String metabolism, int weight, double height) {
        this.name = name;
        this.metabolism = metabolism;
        this.weight = weight;
        this.height = height;
        this.menFields = new ArrayList<String>();
    }

    public Men() {
        this.menFields = new ArrayList<String>();
    }

    public String getName() {
        return this.name;
    }

    public String getMetabolism() {
        return this.metabolism;
    }

    @Override
    public ArrayList<String> getFields() {
        return this.menFields;
    }

    @Override
    public void populateFields(ArrayList<String> arrayList) {
        this.name = arrayList.get(0);
        this.metabolism = arrayList.get(1);
        this.weight = Integer.parseInt(arrayList.get(2));
        this.height = Double.parseDouble(arrayList.get(3));
    }

    @Override
    public String toString() {
        return ("A man with name " + this.name +
                " has a " + this.metabolism + " metabolism.\n" +
                "Height: " + this.height + " cm, Weight: " + this.weight + " kg");
    }
}
