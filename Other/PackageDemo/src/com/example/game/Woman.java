package com.example.game;

import java.util.ArrayList;
import java.util.List;

public class Woman implements ISaveable {
    private String name;
    private String dream;
    private int weight;
    private double height;

    public Woman(String name, String dream, int weight, double height) {
        this.name = name;
        this.dream = dream;
        this.weight = weight;
        this.height = height;
    }

    public Woman() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDream() {
        return dream;
    }

    public void setDream(String dream) {
        this.dream = dream;
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
        values.add(1, this.dream);
        values.add(2, "" + this.weight);
        values.add(3, "" + this.height);

        return values;
    }

    @Override
    public void read(List<String> arrayList) {
       if((arrayList != null) && (arrayList.size() > 0)) {
           this.name = arrayList.get(0);
           this.dream = arrayList.get(1);
           this.weight = Integer.parseInt(arrayList.get(2));
           this.height = Double.parseDouble(arrayList.get(3));
       } else {
           System.out.println("Nothing to read into objects(woman)!");
       }
    }

    @Override
    public String toString() {
        return ("A woman with name " + this.name +
                " dreams of " + this.dream + ".\n" +
                "Height: " + this.height + " cm, Weight: " + this.weight + " kg");
    }
}
