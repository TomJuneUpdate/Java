package com.patterns.decorator;

public class StrawberryIceCream implements IceCream {
    private String description;
    private int price;

    public StrawberryIceCream(String description, int price) {
        this.description = "StrawberryIceCream";
        this.price = 2;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public int cost() {
        return this.price;
    }
}
