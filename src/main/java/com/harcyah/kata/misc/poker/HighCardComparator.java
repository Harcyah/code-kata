package com.harcyah.kata.misc.poker;

import java.util.Comparator;

public class HighCardComparator implements Comparator<PokerHand> {

    @Override
    public int compare(PokerHand left, PokerHand right) {
        PokerCard topLeft = left.getCardsSortedByValueDesc().get(0);
        PokerCard topRight = right.getCardsSortedByValueDesc().get(0);
        return topLeft.compareTo(topRight);
    }

}
