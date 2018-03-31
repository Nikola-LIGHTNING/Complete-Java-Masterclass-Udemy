package com.tsvetkov;

public class StockItem implements Comparable<StockItem> {
    private final String name;
    private double price;
    private int quantityStock; // can be initialized here
    private int reservedStock;


    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantityStock = 0; // or here (but you wouldn't normally do both)
        this.reservedStock = 0;
    }

    public StockItem(String name, double price, int quantityStock) {
        this.name = name;
        this.price = price;
        this.quantityStock = quantityStock;
        this.reservedStock = 0;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int quantityInStock() {
        return quantityStock;
    }

    public int reservedStock() {
        return this.reservedStock;
    }

    public void setPrice(double price) {
        if(price > 0.0) {
            this.price = price;
        }
    }

    public void adjustStock(int quantity) {
        int newQuantity = this.quantityStock + quantity;
        if(newQuantity >= 0) {
            this.quantityStock = newQuantity;
        }
    }

    public void adjustReservedStock(int quantity) {
        int newReservedStock = this.reservedStock + quantity;
        if(newReservedStock >= 0) {
            this.reservedStock = newReservedStock;
        }
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("StockItem.equals() has been invoked");
        if(this == obj) {
             return true;
         }

         if(obj instanceof StockItem) {
             StockItem theObject = (StockItem) obj;
             return this.name.equals(theObject.getName());
         }

         return false;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + 19;
    }

    @Override
    public int compareTo(StockItem item) {
        System.out.println("Entering StockItem.compareTo()");
        if(this == item) {
            return 0;
        }

        if(item != null) {
            return this.name.compareTo(item.getName());
        }

        throw new NullPointerException();
    }

    @Override
    public String toString() {
        return this.name + ", price: " + this.price;
    }

}
