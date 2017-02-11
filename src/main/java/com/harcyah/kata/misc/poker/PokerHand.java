package com.harcyah.kata.misc.poker;

import com.google.common.base.Preconditions;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class PokerHand implements Comparable<PokerHand> {

    private static final int CARDS = 5;

    private final Set<PokerCard> cards = new HashSet<>();
    private final HighCardComparator highCardComparator = new HighCardComparator();

    public PokerHand(String definition) {
        Preconditions.checkArgument(definition.length() == 10);
        for (int i=0; i<CARDS; i++) {
            String card = definition.substring(i * 2, i * 2 + 2);
            cards.add(new PokerCard(card));
        };
    }

    @Override
    public int compareTo(PokerHand that) {
        Rank thisRank = this.getRank();
        Rank thatRank = that.getRank();
        if (thisRank == null && thatRank == null) {
            return highCardComparator.compare(this.cards, that.cards);
        }

        if (thisRank == null) {
            return -1;
        }

        if (thatRank == null) {
            return 1;
        }

        return Integer.compare(thisRank.ordinal(), thatRank.ordinal());
    }

    public Set<PokerCard> getCards() {
        return cards;
    }

    public Rank getRank() {
        for (Rank rank : Rank.values()) {
            if (rank.matches(cards)) {
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
