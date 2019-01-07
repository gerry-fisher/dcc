package dcc.impl;

import dcc.IFruit;

import java.util.Objects;

abstract public class Fruit implements IFruit {

    public static final long serialVersionUID = 345678L;

    private String name;
    private double price;

    public Fruit(String name, Double price) throws Exception {
        if (name == null || name.equals("")) {
            throw new Exception("Name cannot be blank");
        } else {
            this.name = name;
        }

        if (price == null || price <= 0.0) {
            throw new Exception("Price must be greater than 0.0");
        } else {
            this.price = price;
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fruit)) return false;
        Fruit fruit = (Fruit) o;
        return Double.compare(fruit.getPrice(), getPrice()) == 0 &&
                getName().equals(fruit.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPrice());
    }
}
