package com.tsvetkov;

public class MyLinkedList implements NodeList {
    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if(this.root == null) {
            this.root = newItem; // empty list and the newItem becomes the head
            return true;
        }

        ListItem currentItem = this.root;
        while(currentItem != null) {
            int comparison = currentItem.compareTo(newItem);
            if (comparison < 0) {
               if(currentItem.next() != null) {
                   currentItem = currentItem.next();
               } else {
                   // we are at the right end of the list
                   currentItem.setNext(newItem);
                   newItem.setPrevious(currentItem);
                   return true;
               }
            } else if(comparison > 0){
                if(currentItem == root) {
                    // we are at the begging of the list
                    this.root.setPrevious(newItem);
                    newItem.setNext(this.root);
                    this.root = newItem;
                } else {
                    // in between two elements in the list
                    ListItem temp = currentItem.previous();
                    currentItem.setPrevious(newItem);
                    newItem.setNext(currentItem);
                    newItem.setPrevious(temp);
                    temp.setNext(newItem);
                }
                return true;
            } else {
                System.out.println("New item " + newItem.getValue() + " is already present in the list, not added!");
                return false;
            }
        }

        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if(item != null) {
            System.out.println("Deleting item: " + item.getValue());
        }

        ListItem currentItem = root;

        while(currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if(comparison == 0) {
                // found the item to delete
                if(currentItem == this.root) {
                    this.root = currentItem.next();
                } else {
                    currentItem.previous().setNext(currentItem.next());
                    if(currentItem.next() != null) {
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            } else if(comparison < 0){
                currentItem = currentItem.next();
            } else {
                // we are at an item greater than that to be deleted
                // so the item is not on the list
                return false;
            }

        }

        // we have reached the end the list without finding the item to be deleted
        return false;

    }

    @Override
    public void traverse(ListItem root) {
        if(root == null) {
            System.out.println("The list is empty!");
        } else {
            while(root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }
//        if(root != null) {
//            System.out.println(root.getValue());
//            traverse(root.next());
//        }
    }

}
