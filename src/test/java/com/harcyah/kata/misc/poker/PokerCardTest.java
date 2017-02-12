package com.harcyah.kata.misc.poker;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

public class PokerCardTest {

    @Test
    public void testConstructor() throws Exception {
        PokerCard card = new PokerCard("2C");
        assertEquals(PokerCard.Value._2, card.getValue());
        assertEquals(PokerCard.Suit.C, card.getSuit());
    }

    @Test(expected = IllegalSuitException.class)
    public void testConstructor_UnexpectedSuit() throws Exception {
        new PokerCard("2X");
    }

    @Test(expected = IllegalValueException.class)
    public void testConstructor_UnexpectedValue() throws Exception {
        new PokerCard("ZS");
    }

    @Test
    public void testCompareTo_EqualCards() throws Exception {
        PokerCard C2 = new PokerCard("2C");
        PokerCard S2 = new PokerCard("2S");
        assertThat(C2).isEqualByComparingTo(S2);
        assertThat(S2).isEqualByComparingTo(C2);
    }

    @Test
    public void testCompareTo_DistinctCards() throws Exception {
        PokerCard C2 = new PokerCard("2C");
        PokerCard SA = new PokerCard("AS");
        assertThat(C2).isLessThan(SA);
        assertThat(SA).isGreaterThan(C2);
    }

}
