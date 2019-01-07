package dcc.impl;

import dcc.impl.Fruit;

import java.io.Serializable;

public class Orange extends Fruit implements Serializable {

    public Orange(Double price) throws Exception {
        super("Orange", price);
    }
}
