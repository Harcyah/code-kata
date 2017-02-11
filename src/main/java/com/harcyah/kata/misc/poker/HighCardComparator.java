package com.harcyah.kata.misc.poker;

import java.util.Comparator;
import java.util.Set;

public class HighCardComparator implements Comparator<Set<PokerCard>> {

    private static final Comparator<PokerCard> comparator = new Comparator<PokerCard>() {

        @Override
        public int compare(PokerCard o1, PokerCard o2) {
            return -1 * o1.compareTo(o2);
        }

    };

    @Override
    public int compare(Set<PokerCard> left, Set<PokerCard> right) {
        PokerCard topLeft = left.stream().sorted(comparator).findFirst().get();
        PokerCard topRight = right.stream().sorted(comparator).findFirst().get();
        return topLeft.compareTo(topRight);
    }

}
