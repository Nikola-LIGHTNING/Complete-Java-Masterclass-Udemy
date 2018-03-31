package com.tsvetkov;

import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return this.myValue;
    }
}

public class Main {

    public static void main(String[] args) {

        ArrayList<IntClass> myIntClassArrayList = new ArrayList<IntClass>();
        myIntClassArrayList.add(new IntClass(32323));

        Integer integer = new Integer(2323);
        Double doubleValue = new Double(23.69);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for(int i = 0; i <= 10; i++) {
            intArrayList.add(Integer.valueOf(i));
        }

        for(int i = 0; i <= 10; i++) {
            System.out.println(i + " ---> " + intArrayList.get(i).intValue());
        }

        Integer myIntValue = 56;  // Integer.valueOf(56) at compile time
        int myValue = myIntValue; // myValue = myIntValue.intValue();

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();

        for(double dbl = 0.0; dbl <= 10.0; dbl += 0.5) {
            myDoubleValues.add(dbl);
        }

        for(int i = 0; i < myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i);
            System.out.println(i + " ---> " + value);
        }

    }
}
