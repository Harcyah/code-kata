package com.harcyah.kata.misc.poker;

import com.google.common.base.Preconditions;

public class PokerCard implements Comparable<PokerCard> {

    private final Value value;
    private final Suit suit;

    public PokerCard(String value) throws IllegalValueException, IllegalSuitException {
        Preconditions.checkArgument(value.length() == 2);
        this.value = Value.parse(value.substring(0, 1));
        this.suit = Suit.parse(value.substring(1, 2));
    }

    @Override
    public int compareTo(PokerCard that) {
        return Integer.compare(this.value.ordinal(), that.value.ordinal());
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
