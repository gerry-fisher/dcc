package dcc.impl;

import java.io.Serializable;

public class Apple extends Fruit implements Serializable {

    private static final String name = "Apple";

    public Apple(Double price) throws Exception {
        super(name, price);
    }
}