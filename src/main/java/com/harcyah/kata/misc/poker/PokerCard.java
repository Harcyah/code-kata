package com.harcyah.kata.misc.poker;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.harcyah.kata.misc.poker.suits.IllegalSuitException;
import com.harcyah.kata.misc.poker.suits.Suit;
import com.harcyah.kata.misc.poker.values.IllegalValueException;
import com.harcyah.kata.misc.poker.values.Value;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PokerCard pokerCard = (PokerCard) o;
        return value == pokerCard.value &&
                suit == pokerCard.suit;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value, suit);
    }
}
