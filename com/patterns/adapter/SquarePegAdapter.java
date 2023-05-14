package com.patterns.adapter;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg adaptes;

    public SquarePegAdapter(SquarePeg adaptes) {
        super(0);
        this.adaptes = adaptes;
    }

    @Override
    public int getRadius() {
        return (int)(adaptes.getWidth()*(Math.sqrt(2)/2));
    }
}
