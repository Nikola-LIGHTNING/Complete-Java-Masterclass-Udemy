package com.tsvetkov;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> items = new ArrayList<>();

        items.add(1);
        items.add(2);
        items.add(3);
//        items.add("Kolio");
        items.add(4);
        items.add(5);
        items.add(6);

        printDoubled(items);

    }

    private static void printDoubled(ArrayList<Integer> arrayList) {
        for(int element : arrayList) {
            System.out.println("Doubled value: " + element * 2);
        }
    }
}
