package dcc.impl;

import dcc.IFruit;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<IFruit> fruits;

    public ShoppingCart() {}

    public void addItem(IFruit fruit) {
        if (fruits == null) {
            fruits = new ArrayList<IFruit>();
        }

        fruits.add(fruit);
    }

    public List<IFruit> getItems() {
        return fruits;
    }
}
