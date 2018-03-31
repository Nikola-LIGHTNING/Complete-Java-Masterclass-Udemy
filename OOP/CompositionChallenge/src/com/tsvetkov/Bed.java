package com.tsvetkov;

public class Bed {
    private String model;
    private String size;
    private String sheets;
    private Dimensions dimensions;

    public Bed(String model, String size, String sheets, Dimensions dimensions) {
        this.model = model;
        this.size = size;
        this.sheets = sheets;
        this.dimensions = dimensions;
    }

    public void changeSheets(String color) {
        System.out.println("Changing the old sheets with " + this.sheets + " color to new sheets with " + color + " color.");
        this.sheets = color;
    }

    public String getModel() {
        return model;
    }

    public String getSize() {
        return size;
    }

    public String getSheets() {
        return sheets;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
