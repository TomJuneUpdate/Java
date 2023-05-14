package com.patterns.adapter;

public class RoundHole {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public RoundHole(int radius) {
        this.radius = radius;
    }

    public boolean fits(RoundPeg peg) {
        return this.radius >= peg.getRadius();
    }
}
