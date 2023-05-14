package com.patterns.decorator;

public class VanillaIceCream implements IceCream {
    private String description;
    private int price;

    public VanillaIceCream(String description, int price) {
        this.description = "VanillaIceCream";
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
