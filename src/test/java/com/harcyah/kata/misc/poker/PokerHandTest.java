package com.harcyah.kata.misc.poker;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PokerHandTest {

    @Test
    public void testConstructor() throws Exception {
        PokerHand hand = new PokerHand("D3S3D5D7D9");

        assertThat(hand.getCards()).hasSize(5);
    }

    @Test
    public void getRankFindsOnePair() throws Exception {
        PokerHand hand0 = new PokerHand("D3S3D5D7D9");
        assertThat(hand0.getRank()).isEqualTo(Rank.ONE_PAIR);

        PokerHand hand1 = new PokerHand("D3D5D7D9S3");
        assertThat(hand1.getRank()).isEqualTo(Rank.ONE_PAIR);
    }

    @Test
    public void getRankFindsTwoPairs() throws Exception {
        PokerHand hand0 = new PokerHand("D3S3D5D7S5");
        assertThat(hand0.getRank()).isEqualTo(Rank.TWO_PAIRS);

        PokerHand hand1 = new PokerHand("D3D5D7S5S3");
        assertThat(hand1.getRank()).isEqualTo(Rank.TWO_PAIRS);
    }

    @Test
    public void getRankFindsThreeOfKind() throws Exception {
        PokerHand hand0 = new PokerHand("C3D3H3SKSQ");
        assertThat(hand0.getRank()).isEqualTo(Rank.THREE_OF_A_KIND);

        PokerHand hand1 = new PokerHand("C3D3SKSQH3");
        assertThat(hand1.getRank()).isEqualTo(Rank.THREE_OF_A_KIND);
    }

    @Test
    public void getRankFindsFourOfKind() throws Exception {
        PokerHand hand0 = new PokerHand("C3D3H3SKS3");
        assertThat(hand0.getRank()).isEqualTo(Rank.FOUR_OF_A_KIND);

        PokerHand hand1 = new PokerHand("C3D3S3SQH3");
        assertThat(hand1.getRank()).isEqualTo(Rank.FOUR_OF_A_KIND);
    }

}
