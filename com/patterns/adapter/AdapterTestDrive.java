package com.patterns.adapter;

public class AdapterTestDrive {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(6);
        RoundPeg roundPeg = new RoundPeg(6);
        System.out.println(hole.fits(roundPeg));

        SquarePeg squarePeg = new SquarePeg(5);
        SquarePegAdapter squarePegAdapter = new SquarePegAdapter(squarePeg);
        System.out.println(hole.fits(squarePegAdapter));
    }
}
