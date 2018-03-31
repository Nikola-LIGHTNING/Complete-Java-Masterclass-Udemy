package com.tsvetkov;

import java.util.Map;

public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("cake", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("car", 12.50, 2);
        stockList.addStock(temp);

        temp = new StockItem("chair", 62.0, 10);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.5, 200);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.45, 7);
        stockList.addStock(temp);

        temp = new StockItem("door", 72.95, 4);
        stockList.addStock(temp);

        temp = new StockItem("juice", 2.5, 36);
        stockList.addStock(temp);

        temp = new StockItem("phone", 96.99, 35);
        stockList.addStock(temp);

        temp = new StockItem("towel", 2.40, 80);
        stockList.addStock(temp);

        temp = new StockItem("vase", 8.76, 40);
        stockList.addStock(temp);

        System.out.println(stockList);

        for(String s : stockList.Items().keySet()) {
            System.out.println(s);
        }

        Basket koliosBasket = new Basket("Kolio");
        reserveItem(koliosBasket, "car", 1);
        System.out.println(koliosBasket);

        reserveItem(koliosBasket, "car", 1);
        System.out.println(koliosBasket);

        reserveItem(koliosBasket, "car", 1);
        reserveItem(koliosBasket, "spanner", 5);
        System.out.println(koliosBasket);

        reserveItem(koliosBasket, "juice", 4);
        reserveItem(koliosBasket, "cup", 12);
        reserveItem(koliosBasket, "bread", 1);
        System.out.println(koliosBasket);
        System.out.println(stockList);

//        temp = new StockItem("pen", 1.12);
//        stockList.Items().put(temp.getName(), temp);
//        Collection
//        stockList.Items().get("car").adjustStock(250);
//        stockList.get("car").adjustStock(-100);
        System.out.println(koliosBasket);
        unreserveItem(koliosBasket, "car");
        unreserveItem(koliosBasket, "car");
        System.out.println(koliosBasket);
        checkOut(koliosBasket);
        System.out.println(stockList);
        System.out.println(koliosBasket);


//        for(Map.Entry<String, Double> price : stockList.priceList().entrySet()) {
//            System.out.println(price.getKey() + " costs " + price.getValue());
//        }

    }

    public static int sellItem(Basket basket, String item, int quantity) {
        // retrieve the item from stock list
        StockItem stockItem = stockList.get(item);
        if(stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }

        if(stockList.sellStock(item, quantity) != 0) {
            basket.addToBasket(stockItem, quantity);
            return quantity;
        }

        return 0;
    }

    public static int reserveItem(Basket basket, String item, int quantity) {
        StockItem stockItem = stockList.get(item);
        if(stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }

        if(stockList.reserveStock(item, quantity) != 0) {
            basket.addToBasket(stockItem, quantity);
            return quantity;
        }

        return 0;
    }

    public static void unreserveItem(Basket basket, String item) {
        StockItem stockItem = stockList.get(item);

        if(stockItem == null) {
            System.out.println("We don't sell " + item);
        }

        basket.removeFromBasket(stockItem);
        if(stockList.unreserveStock(stockItem) != 0) {
            System.out.println(stockItem.getName() + " has been unreserved");
        }


    }


    public static void checkOut(Basket basket) {
        for(Map.Entry<StockItem, Integer> item : basket.Items().entrySet()) {
            stockList.sellStock(item.getKey().getName(), item.getValue());
        }

        basket.emptyBasket();
    }
}
