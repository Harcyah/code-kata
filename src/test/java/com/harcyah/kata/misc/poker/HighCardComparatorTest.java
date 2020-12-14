package com.harcyah.kata.misc.poker;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HighCardComparatorTest {

    private HighCardComparator comparator = new HighCardComparator();

    @Test
    public void compareSimilarHands() throws Exception {
        PokerHand left = new PokerHand("2S 3S 4S 5S 6S");
        PokerHand right = new PokerHand("2D 3D 4D 5D 6D");
        assertThat(comparator.compare(left, right)).isEqualTo(0);
    }

    @Test
    public void compareDifferentHands() throws Exception {
        PokerHand left = new PokerHand("2S 3S 4S 5S 6S");
        PokerHand right = new PokerHand("2D 3D 4D 5D 7D");
        assertThat(comparator.compare(left, right)).isNegative();
        assertThat(comparator.compare(right, left)).isPositive();
    }

}
