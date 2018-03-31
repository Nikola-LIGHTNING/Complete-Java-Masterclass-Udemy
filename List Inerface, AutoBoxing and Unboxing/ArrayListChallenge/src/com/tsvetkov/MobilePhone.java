package com.tsvetkov;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> contactList;
    private String model;

    public MobilePhone(String model) {
        this.model = model;
        this.contactList = new ArrayList<Contact>();
    }

    public String getModel() {
        return model;
    }

    public void storeContact(String name, String phoneNumber) {
        if(indexOfName(name) < 0) {
            contactList.add(new Contact(name, phoneNumber));
            System.out.println("Contact with name " + name +
                    " and phone number " + phoneNumber + " has been added.");
        } else {
            System.out.println("A contact with the name" + name + "already exists!");
        }
    }

    public void modifyContact(String currentName, String newName) {
        int position = indexOfName(currentName);
        if(position >= 0) {
            if(indexOfName(newName) == -1) {
                contactList.get(position).setName(newName);
                System.out.println("Contact new name " + newName);
            } else {
                System.out.println("Contact with name " + newName + " is already in contacts!");
            }
        } else {
            System.out.println("No contact with name" + currentName);
        }
    }

    public void removeContact(String name) {
        int position = indexOfName(name);
        if(position >= 0) {
            contactList.remove(position);
            System.out.println("Contact with name " + name + " has been removed!");
        } else {
            System.out.println("There is no contact with this name: " + name);
        }
    }

    public Contact queryContact(String searchName) {
        int position = indexOfName(searchName);
        if(position >= 0) {
            System.out.println("Contact with name " + searchName + " is in Contacts " +
                    "at position " + (position + 1));
            return contactList.get(position);
        } else {
            System.out.println("There is no contact with name: " + searchName);
            return null;
        }
    }

    private int indexOfName(String searchName) {
        int indexOfName = -1;
        for(int i = 0; i < contactList.size(); i++) {
            Contact contact = contactList.get(i);
            if(contact.getName().equals(searchName)) {
                indexOfName = i;
            }
        }

        return indexOfName;
    }

    public void printContacts() {
        System.out.println("Contact: ");
        for(int i = 0; i < contactList.size(); i++) {
            Contact contact = contactList.get(i);
            System.out.println((i + 1) + ". Name: " + contact.getName() +
                    " Phone Number: " + contact.getPhoneNumber());
        }
        System.out.println();
    }

}
