package com.tsvetkov;

public class Main {

    public static void main(String[] args) {
        Item item1 = new Item("Zar");
        Item item2 = new Item("Qgoda");
        Item item3 = new Item("Salfetka");
        Item item4 = new Item("Telefon");

        LinkedList myList = new LinkedList();

        myList.add(item1);
        myList.add(item2);
        myList.add(item3);
        myList.printList();

        myList.add(item4);
        myList.printList();

    }
}
