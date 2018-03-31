package com.tsvetkov;

public class BinarySearchTree implements NodeList {
    private ListItem root = null;


    public BinarySearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if(root == null) {
            root = newItem;
            return true;
        }

        ListItem currentItem = root;
        while(currentItem != null) {
            int comparison = currentItem.compareTo(newItem);
            if(comparison < 0) {
                if(currentItem.next() == null) {
                    currentItem.setNext(newItem);
                    return true;
                } else {
                    currentItem = currentItem.next();
                }
            } else if(comparison > 0) {
                if(currentItem.previous() == null) {
                    currentItem.setPrevious(newItem);
                    return true;
                } else {
                    currentItem = currentItem.previous();
                }
            } else {
                System.out.println(newItem.getValue() + " is already present in the list! Not added.");
                return false;
            }
        }

        return false; // we shouldn't get here anyway
    }

    @Override
    public boolean removeItem(ListItem item) {
        if(item != null) {
            System.out.println("Deleting " + item.getValue());
        }

        ListItem currentItem = this.root;
        ListItem parentItem = currentItem;

        while(currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if(comparison < 0) {
                parentItem = currentItem;
                currentItem = currentItem.next();
            } else if(comparison > 0) {
                parentItem = currentItem;
                currentItem = currentItem.previous();
            } else {
                // equal: we've found the item to remove
                performRemoval(currentItem, parentItem);
                return true;
            }
        }

        return false;
    }

    private void performRemoval(ListItem item, ListItem parent) {
        //remove item from tree
        if(item.next() == null) {
            if(parent.next() == item) {
                parent.setNext(item.previous());
            } else if(parent.previous() == item) {
                parent.setPrevious(item.previous());
            } else {
                // parent must be item, which means we are looking at the root of the tree
                this.root = item.previous();
            }
        } else if(item.previous() == null) {
            if(parent.next() == item) {
                parent.setNext(item.next());
            } else if(parent.previous() == item) {
                parent.setPrevious(item.next());
            } else {
                this.root = item.next();
            }
        } else {
            // neither left nor right are null
            // from the right sub-tree find the smallest value
            ListItem current = item.next();
            ListItem leftmostParent = item;
            while(current.previous() != null) {
                leftmostParent = current;
                current = current.previous();
            }

            // now we put the smallest value in our node to be deleted
            item.setValue(leftmostParent);

            if(leftmostParent == item) {
                item.setNext(current.next());
            } else {
                leftmostParent.setPrevious(current.next());
            }
        }
    }

    @Override
    public void traverse(ListItem root) {
        // recursive method
        if(root != null) {
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());
        }
    }


}
