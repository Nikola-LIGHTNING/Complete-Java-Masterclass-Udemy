package com.tsvetkov;

import java.util.Collections;
import java.util.*;
import java.util.Map;

public class Basket {
    private final String name;
    private final Map<StockItem, Integer> list;

    public Basket(String name) {
        this.name = name;
        this.list = new TreeMap<>();
    }

    public int addToBasket(StockItem item, int quantity) {
        if((item != null) && (quantity > 0)) {
            int inBasket = list.getOrDefault(item, 0);
            list.put(item, inBasket + quantity);
            return inBasket;
        }

        return 0;
    }

    public boolean removeFromBasket(StockItem item) {
        if(list.remove(item) != null) {
            return true;
        } else {
            System.out.println("There is no " + item.getName() + " in basket");
            return false;
        }
    }

    public void emptyBasket() {
        this.list.clear();
    }

    public Map<StockItem, Integer> Items() {
        return Collections.unmodifiableMap(this.list);
    }

    @Override
    public String toString() {
        String s = "\nShopping basket " + name + " contains " + list.size() + ((list.size() == 1) ? " item" : " items") + ".\n";
        double totalCost = 0.0;
        for(Map.Entry<StockItem, Integer> item : list.entrySet()) {
            s = s + item.getKey() + ", " + item.getValue() + " reserved.\n";
            totalCost += item.getKey().getPrice() * item.getValue();
        }

        return s + "Total cost " + String.format("%.2f", totalCost);
    }
}
