package com.harcyah.kata.misc.poker;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HighCardComparatorTest {

    private HighCardComparator comparator = new HighCardComparator();

    @Test
    public void compareSimilarHands() throws Exception {
        PokerHand left = new PokerHand("2S3S4S5S6S");
        PokerHand right = new PokerHand("2D3D4D5D6D");
        assertThat(comparator.compare(left, right)).isEqualTo(0);
    }

    @Test
    public void compareDifferentHands() throws Exception {
        PokerHand left = new PokerHand("2S3S4S5S6S");
        PokerHand right = new PokerHand("2D3D4D5D7D");
        assertThat(comparator.compare(left, right)).isNegative();
        assertThat(comparator.compare(right, left)).isPositive();
    }

}
