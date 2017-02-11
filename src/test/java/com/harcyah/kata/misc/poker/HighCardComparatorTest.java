package com.harcyah.kata.misc.poker;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HighCardComparatorTest {

    @Test
    public void compareSimilarHands() throws Exception {
        PokerHand left = new PokerHand("S2S3S4S5S6");
        PokerHand right = new PokerHand("D2D3D4D5D6");
        assertThat(left).isEqualByComparingTo(right);
    }

    @Test
    public void compareDifferentHands() throws Exception {
        PokerHand left = new PokerHand("S2S3S4S5S6");
        PokerHand right = new PokerHand("D2D3D4D5D7");
        assertThat(right).isGreaterThan(left);
        assertThat(left).isLessThan(right);
    }

}
