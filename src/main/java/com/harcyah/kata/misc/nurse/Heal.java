package com.harcyah.kata.misc.nurse;

public enum Heal {

    DEUBLE_TOILETTE(45, 2090),
    TOILETTE(30, 1045),
    PANS_SIMPLE(15, 880),
    PANS_DIFF(30, 1500),
    SOUS_CUT(10, 700),
    PRISE_SANG(10, 780);

    private int duration;
    private int cost;

    private Heal(int duration, int cost) {
        this.duration = duration;
        this.cost = cost;
    }

    public int getDuration() {
        return duration;
    }

    public int getCost() {
        return cost;
    }

}
