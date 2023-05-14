package com.patterns.decorator;

public class ChocolateIceCream implements IceCream{
    private String description;
    private int price;

    public ChocolateIceCream(String description, int price) {
        this.description = "ChocolateIceCream";
        this.price = 3;
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
