package com.tsvetkov;

import java.util.ArrayList;

public class Women implements ISaveable {
    private ArrayList<String> womenFields;
    private String name;
    private String dream;
    private int weight;
    private double height;

    public Women(String name, String dream, int weight, double height) {
        this.name = name;
        this.dream = dream;
        this.weight = weight;
        this.height = height;
        this.womenFields = new ArrayList<String>();
    }

    public Women() {
        this.womenFields = new ArrayList<String>();
    }

    public String getName() {
        return this.name;
    }

    public String getDream() {
        return this.dream;
    }

    @Override
    public ArrayList<String> getFields() {
        return this.womenFields;
    }

    @Override
    public void populateFields(ArrayList<String> arrayList) {
        this.name = arrayList.get(0);
        this.dream = arrayList.get(1);
        this.weight = Integer.parseInt(arrayList.get(2));
        this.height = Double.parseDouble(arrayList.get(3));
    }

    @Override
    public String toString() {
        return ("A woman with name " + this.name +
                " dreams of " + this.dream + ".\n" +
                "Height: " + this.height + " cm, Weight: " + this.weight + " kg");
    }
}
