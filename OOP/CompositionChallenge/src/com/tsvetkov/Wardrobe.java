package com.tsvetkov;

public class Wardrobe {
    private int doors;
    private String model;
    private String material;
    private Dimensions dimensions;

    public Wardrobe(int doors, String model, String material, Dimensions dimensions) {
        this.doors = doors;
        this.model = model;
        this.material = material;
        this.dimensions = dimensions;
    }

    public void open() {
        System.out.println("Wardrobe is being opened..");
    }

    public String getModel() {
        return model;
    }

    public int getDoors() {
        return doors;
    }

    public String getMaterial() {
        return material;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
