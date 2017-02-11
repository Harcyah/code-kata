package com.harcyah.kata.misc.poker;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PokerCardTest {

    @Test
    public void compareTo_whenEquals() throws Exception {
        PokerCard C2 = new PokerCard("C2");
        PokerCard S2 = new PokerCard("S2");
        assertThat(C2).isEqualByComparingTo(S2);
        assertThat(S2).isEqualByComparingTo(C2);
    }

    @Test
    public void compareTo_whenDistinct() throws Exception {
        PokerCard C2 = new PokerCard("C2");
        PokerCard SA = new PokerCard("SA");
        assertThat(C2).isLessThan(SA);
        assertThat(SA).isGreaterThan(C2);
    }

}