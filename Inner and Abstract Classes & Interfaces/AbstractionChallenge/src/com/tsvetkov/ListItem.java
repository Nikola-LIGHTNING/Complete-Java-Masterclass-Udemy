package com.tsvetkov;

public abstract class ListItem {
    private ListItem next;
    private ListItem previous;
    private String value;

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ListItem getNext() {
        return this.next;
    }

    public void setNext(ListItem item) {
        this.next = item;
    }

    public ListItem getPrevious() {
        return this.previous;
    }

    public void setPrevious(ListItem previous) {
        this.previous = previous;
    }

    public int compareTo(ListItem item) {
        int comparison = this.value.compareTo(item.getValue());
        if(comparison == 0) {
            return 0;
        } else if(comparison > 0) {
            return 1;
        } else {
            return -1;
        }


    }



}
