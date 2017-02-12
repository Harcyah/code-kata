package com.harcyah.kata.misc.poker;

import com.google.common.base.Preconditions;

public class PokerCard implements Comparable<PokerCard> {

    private final Value value;
    private final Suit suit;

    public enum Value {
        _2,
        _3,
        _4,
        _5,
        _6,
        _7,
        _8,
        _9,
        _T,
        _J,
        _Q,
        _K,
        _A;

        @Override
        public String toString() {
            return this.name().substring(1, 2);
        }
    }

    public enum Suit {
        C,
        D,
        H,
        S
    }

    public PokerCard(String value) throws IllegalValueException, IllegalSuitException {
        Preconditions.checkArgument(value.length() == 2);
        this.value = parseValue(value.substring(0, 1));
        this.suit = parseSuit(value.substring(1, 2));
    }

    @Override
    public int compareTo(PokerCard that) {
        return Integer.compare(this.value.ordinal(), that.value.ordinal());
    }

    private Value parseValue(String letter) throws IllegalValueException {
        try {
            return Value.valueOf("_" + letter);
        } catch (Exception e) {
            throw new IllegalValueException();
        }
    }

    private Suit parseSuit(String letter) throws IllegalSuitException {
        try {
            return Suit.valueOf(letter);
        } catch (Exception e) {
            throw new IllegalSuitException();
        }
    }

    @Override
    public String toString() {
        return value.toString() + suit.name();
    }

    public Suit getSuit() {
        return suit;
    }

    public Value getValue() {
        return value;
    }
}
