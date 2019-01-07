package dcc.impl;

import dcc.IFruit;

import java.util.List;

public class CheckoutCart {

    private static String[] items = {"Apple", "Apple", "Orange", "Apple"};

    public static void main(String[] args) throws Exception {

        Apple apple = new Apple(0.50);
        Orange orange = new Orange(0.60);

        if (items.length > 0) {
            ShoppingCart cart = new ShoppingCart();

            for (String item : items) {
                if (item.equalsIgnoreCase("Apple")) {
                    cart.addItem(apple);
                } else if (item.equalsIgnoreCase("Orange")) {
                    cart.addItem(orange);
                }
            }

            outputTotalCost(cart.getItems());
        }
    }

    private static void outputTotalCost(List<IFruit> fruits) {

        Double totalPrice = 0.0;
        for (IFruit fruit: fruits) {
            totalPrice += fruit.getPrice();
        }
        System.out.println("Total cost" + totalPrice);
    }
}
