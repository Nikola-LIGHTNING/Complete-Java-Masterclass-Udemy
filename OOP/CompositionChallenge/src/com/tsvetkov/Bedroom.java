package com.tsvetkov;

public class Bedroom {
    private int doors;
    private int squareSize;

    private Wardrobe wardrobe;
    private Bed bed;

    public Bedroom(int doors, int squareSize, Wardrobe wardrobe, Bed bed) {
        this.doors = doors;
        this.squareSize = squareSize;
        this.wardrobe = wardrobe;
        this.bed = bed;
    }

    public void cleanBedroom(String color) {
        bed.changeSheets(color);
        wardrobe.open();
        vacuumClean();
        System.out.println("Cleaning bedroom..");
    }

    private void vacuumClean() {
        System.out.println("Vacuum cleaning..");
    }

    public int getDoors() {
        return doors;
    }

    public int getSquareSize() {
        return squareSize;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    public Bed getBed() {
        return bed;
    }
}
