package com.harcyah.kata.misc.poker;

import com.google.common.base.Preconditions;

public class PokerCard implements Comparable<PokerCard> {

    private final Suit suit;
    private final Value value;

    public enum Suit {
        C,
        D,
        H,
        S
    }

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

    public PokerCard(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    public PokerCard(String value) {
        Preconditions.checkArgument(value.length() == 2);
        this.suit = parseSuit(value.substring(0, 1));
        this.value = parseValue(value.substring(1, 2));
    }

    @Override
    public int compareTo(PokerCard that) {
        return Integer.compare(this.value.ordinal(), that.value.ordinal());
    }

    private Value parseValue(String letter) {
        try {
            return Value.valueOf("_" + letter);
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }
    }

    private Suit parseSuit(String letter) {
        try {
            return Suit.valueOf(letter);
        } catch (Exception e) {
            throw new IllegalArgumentException();
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
