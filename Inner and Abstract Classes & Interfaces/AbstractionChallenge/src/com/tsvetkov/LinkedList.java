package com.tsvetkov;

public class LinkedList {
    private ListItem head;
    private ListItem currentItem;
    private int elementCount = 0;

    public void add(Item newItem) {

        this.elementCount++;
        if(head == null) {
            head = newItem;
            currentItem = head;
            return;
        }

        currentItem = head;
        int comparison = currentItem.compareTo(newItem);
        while((currentItem.getNext() != null) && (comparison < 0)) {
            comparison = currentItem.compareTo(newItem);
            if(comparison == 0) {
                return;
            } else if(comparison < 0) {
                currentItem = currentItem.getNext();
            } else {
                break;
            }
        }

        if(comparison < 0) {
            head.setNext(newItem);
            ListItem temp = currentItem; // debatable
            currentItem = head.getNext();
            head.setPrevious(temp); // along with this
        } else if(comparison > 0) {
            if(currentItem != head) {
                ListItem temp = currentItem.getPrevious();
                currentItem.getPrevious().setNext(newItem);
                temp.getNext().setNext(currentItem);
            } else {
                head.setPrevious(newItem);
                head = head.getPrevious();
                head.setNext(currentItem); // along with this
            }
        }

    }

    public void printList() {
        ListItem iterator;
        iterator = head;

        int i = 0;
        while(i < this.elementCount) {
            System.out.println("Element " + i + ": " + iterator.getValue());
            iterator = iterator.getNext();
            i++;
        }
    }


}
