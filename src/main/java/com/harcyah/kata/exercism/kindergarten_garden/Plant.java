package com.harcyah.kata.exercism.kindergarten_garden;

public enum Plant {

    VIOLETS,
    RADISHES,
    CLOVER,
    GRASS;

    public static Plant getPlant(char plantCode) {
        switch (plantCode) {
            case 'G':
                return GRASS;
            case 'C':
                return CLOVER;
            case 'R':
                return RADISHES;
            case 'V':
                return VIOLETS;
            default:
                throw new IllegalArgumentException();
        }
    }

}
