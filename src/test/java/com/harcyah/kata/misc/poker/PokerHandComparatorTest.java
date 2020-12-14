package com.harcyah.kata.misc.poker;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PokerHandComparatorTest {

    @Test
    public void pokerHandComparator() throws Exception {
        PokerHand winHand = new PokerHand("3S 9H 4S 7S 9S");
        PokerHand loseHand = new PokerHand("2S 3H 4S 7S 9S");

        assertThat(winHand).isGreaterThan(loseHand);
        assertThat(loseHand).isLessThan(winHand);
    }

}
