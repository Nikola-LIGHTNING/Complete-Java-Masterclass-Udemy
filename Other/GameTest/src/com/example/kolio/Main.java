package com.example.kolio;

import com.example.game.ISaveable;
import com.example.game.Man;
import com.example.game.Woman;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Man man1 = new Man();
    private static Woman woman1 = new Woman();
    public static void main(String[] args) {

        Man kolio = new Man("Kolio", "Mesomorphic", 72, 185);
        System.out.println(kolio); // equivalent to System.out.println(kolio.toString());
        saveObject(kolio);

        kolio.setWeight(70);
        System.out.println(kolio);

        kolio.setHeight(185.2);
        saveObject(kolio);
        //loadObject(kolio);
        System.out.println(kolio);

        ISaveable gery = new Woman("Gerka-Perka", "Hapiness 4 all", 55, 163);
        System.out.println(gery); // equivalent to System.out.println(gery.toString());
        saveObject(gery);

        ((Woman) gery).setHeight(165); // or declare gery Woman gery = new Woman(...); and then gery.setHeight();
        System.out.println(gery);

        loadObject(gery);



        //Man adam = new Man("Adam", "Mesomorphic", 68, 184.99);
        //System.out.println(adam.toString());
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;

        printInstructions();

        while(!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
//                case 2:
//                    saveTo(man1, values);
//                    index = 0;
//                    break;
//                case 3:
//                    saveTo(woman1, values);
//                    index = 0;
//                    break;
//                case 4:
//                    System.out.println(man1.toString());
//                    break;
//                case 5:
//                    System.out.println(woman1.toString());
//                    break;
//                case 6:
//                    printInstructions();
//                    break;
            }
        }
        return values;
    }

    public static void printInstructions() {
        System.out.println("Choose\n" +
                "\t 1 - to enter a string\n" +
                "\t 0 - to quit\n");
//        +       "\t 2 - to populate man fields\n" +
//                "\t 3 - to populate woman fields\n" +
//                "\t 4 - to print man fields\n" +
//                "\t 5 - to print woman fields\n" +
//                "\t 6 - to print instructions\n");
    }

    public static void saveObject(ISaveable person) {
        for(int i = 0; i < person.write().size(); i++) {
            System.out.println("Saving " + person.write().get(i) + " to storage device");
        }
    }

    public static void loadObject(ISaveable person) {
        ArrayList<String> values = readValues();
        person.read(values);
    }

}
