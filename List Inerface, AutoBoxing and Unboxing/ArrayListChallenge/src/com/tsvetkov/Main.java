package com.tsvetkov;

import java.util.Scanner;

public class Main {
    private static MobilePhone phone = new MobilePhone("Tesla");
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;
        System.out.println("Phone: " + phone.getModel());
        printInstructions();

        while(!quit) {
            System.out.print("Enter input: ");
            choice = scanner.nextInt();

            switch(choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    modifyContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printInstructions();
                    break;
            }
        }

    }

    public static void printInstructions() {
        System.out.println("Press ");
        System.out.println("\t 0 - To Quit");
        System.out.println("\t 1 - To Print Contact");
        System.out.println("\t 2 - To Add a Contact");
        System.out.println("\t 3 - To Modify a Contact");
        System.out.println("\t 4 - To Remove a Contact");
        System.out.println("\t 5 - To Query a Contact");
        System.out.println("\t 6 - To Print Instructions");
    }

    public static void printContacts() {
        phone.printContacts();
    }

    public static void addContact() {
        System.out.print("Input a name to be added: ");
        scanner.nextLine();
        String name = scanner.nextLine();

        System.out.print("Input a phone number to be added: ");
        String phoneNumber = scanner.nextLine();

        phone.storeContact(name, phoneNumber);
    }

    public static void modifyContact() {
        System.out.print("Input the current name to be replaced: ");
        scanner.nextLine();
        String currentName = scanner.nextLine();

        System.out.print("Input a new name to replace the current name: ");
        String newName = scanner.nextLine();

        phone.modifyContact(currentName, newName);
    }

    public static void removeContact() {
        System.out.print("Input the name to be removed: ");
        scanner.nextLine();
        String name = scanner.nextLine();

        phone.removeContact(name);
    }

    public static void queryContact() {
        System.out.print("Input the name you want to check for: ");
        scanner.nextLine();
        String name = scanner.nextLine();

        Contact contact = phone.queryContact(name);
        if(contact != null) {
            System.out.println(contact.getName() + ", phone number " + contact.getPhoneNumber());
        }
    }

}

