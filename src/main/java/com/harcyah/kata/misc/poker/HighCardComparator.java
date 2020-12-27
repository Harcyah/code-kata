package com.harcyah.kata.misc.poker;

import java.io.Serializable;
import java.util.Comparator;

public class HighCardComparator implements Serializable, Comparator<PokerHand> {

    private static final long serialVersionUID = 1357133658685425L;

    @Override
    public int compare(PokerHand left, PokerHand right) {
        PokerCard topLeft = left.getCards().get(0);
        PokerCard topRight = right.getCards().get(0);
        return topLeft.compareTo(topRight);
    }

}
