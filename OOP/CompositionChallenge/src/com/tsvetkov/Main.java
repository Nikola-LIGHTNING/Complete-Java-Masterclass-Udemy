package com.tsvetkov;

public class Main {

    public static void main(String[] args) {
	    Dimensions bedDimensions = new Dimensions(200, 200, 40);

	    Bed bed = new Bed("Tsvetkov", "King Sized", "white", bedDimensions);
	    Wardrobe wardrobe = new Wardrobe(3, "Zlatkovski", "wood", new Dimensions(300, 60, 200));

	    Bedroom myBedroom = new Bedroom(2, 18, wardrobe, bed);

	    myBedroom.cleanBedroom("blue");
	    myBedroom.getBed().changeSheets("purple");

    }
}
