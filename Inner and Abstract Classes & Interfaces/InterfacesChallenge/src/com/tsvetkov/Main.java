package com.tsvetkov;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Men man1 = new Men();
    private static Women woman1 = new Women();
    public static void main(String[] args) {

        readValues();
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
                case 2:
                    saveTo(man1, values);
                    index = 0;
                    break;
                case 3:
                    saveTo(woman1, values);
                    index = 0;
                    break;
                case 4:
                    System.out.println(man1.toString());
                    break;
                case 5:
                    System.out.println(woman1.toString());
                    break;
                case 6:
                    printInstructions();
                    break;
            }
        }
        return values;
    }

    public static void printInstructions() {
        System.out.println("Choose\n" +
                "\t 1 - to enter a string\n" +
                "\t 0 - to quit\n" +
                "\t 2 - to populate man fields\n" +
                "\t 3 - to populate woman fields\n" +
                "\t 4 - to print man fields\n" +
                "\t 5 - to print woman fields\n" +
                "\t 6 - to print instructions\n");
    }

    public static void saveTo(ISaveable person, ArrayList<String> values) {
        person.populateFields(values);
    }

}
