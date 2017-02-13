package com.harcyah.kata.misc.poker;

import java.util.Comparator;

public class HighCardComparator implements Comparator<PokerHand> {

    @Override
    public int compare(PokerHand left, PokerHand right) {
        PokerCard topLeft = left.getCards().get(0);
        PokerCard topRight = right.getCards().get(0);
        return topLeft.compareTo(topRight);
    }

}
