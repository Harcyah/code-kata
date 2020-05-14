package com.harcyah.kata.misc.poker;

import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.harcyah.kata.misc.poker.suits.IllegalSuitException;
import com.harcyah.kata.misc.poker.values.IllegalValueException;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PokerHand implements Comparable<PokerHand> {

    private static final int CARDS = 5;

    private final List<PokerCard> cards;
    private final HighCardComparator highCardComparator = new HighCardComparator();

    public PokerHand(String definition) throws IllegalSuitException, IllegalValueException {
        Preconditions.checkArgument(definition.length() == 14);

        List<String> tokens = Splitter.on(' ').splitToList(definition);
        Set<PokerCard> set = new HashSet<>();
        for (String token : tokens) {
            set.add(new PokerCard(token));
        }

        if (set.size() != CARDS) {
            throw new IllegalArgumentException();
        }

        cards = set.stream().sorted((a, b) -> -1 * a.compareTo(b)).collect(Collectors.toList());
    }

    @Override
    public int compareTo(PokerHand that) {
        Rank thisRank = this.getRank();
        Rank thatRank = that.getRank();
        if (thisRank == null && thatRank == null) {
            return highCardComparator.compare(this, that);
        }

        if (thisRank == null) {
            return -1;
        }

        if (thatRank == null) {
            return 1;
        }

        return -1 * Integer.compare(thisRank.ordinal(), thatRank.ordinal());
    }

    public List<PokerCard> getCards() {
        return cards;
    }

    public Rank getRank() {
        for (Rank rank : Rank.values()) {
            if (rank.matches(this)) {
                return rank;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return cards.stream().map(PokerCard::toString).collect(Collectors.joining(" "));
    }

}
