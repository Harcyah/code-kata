package com.harcyah.kata.misc.poker.suits;

public enum Suit {

    C,
    D,
    H,
    S;

    public static Suit parse(String letter) throws IllegalSuitException {
        try {
            return Suit.valueOf(letter);
        } catch (Exception e) {
            throw new IllegalSuitException("Letter " + letter + " is not valid suits");
        }
    }

}
