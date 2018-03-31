package com.tsvetkov;

public class Main {

    public static void main(String[] args) {
        MyLinkedList link = new MyLinkedList(null);

        BinarySearchTree tree = new BinarySearchTree(null);
        tree.traverse(tree.getRoot());

        String stringData = "1 3 5 0 2 4 1 8 7";

        String[] data = stringData.split(" ");
        for(String str : data) {
            tree.addItem(new Node(str));
        }

        tree.removeItem(new Node("0"));

        tree.traverse(tree.getRoot());

    }
}
