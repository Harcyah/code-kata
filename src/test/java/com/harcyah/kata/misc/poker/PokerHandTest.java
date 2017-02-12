package com.harcyah.kata.misc.poker;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class PokerHandTest {

    @Test
    public void testGetters() throws Exception {
        PokerHand hand = new PokerHand("3DKS5D7D9D");

        List<PokerCard> cardsAsc = hand.getCardsSortedByValueAsc();
        assertThat(cardsAsc).extractingResultOf("toString").containsExactly("3D", "5D", "7D", "9D", "KS");

        List<PokerCard> cardsDesc = hand.getCardsSortedByValueDesc();
        assertThat(cardsDesc).extractingResultOf("toString").containsExactly("KS", "9D", "7D", "5D", "3D");
    }

    @Test
    public void getRankFindsOnePair() throws Exception {
        PokerHand hand0 = new PokerHand("3D3S5D7D9D");
        assertThat(hand0.getRank()).isEqualTo(Rank.ONE_PAIR);

        PokerHand hand1 = new PokerHand("3D5D7D9D3S");
        assertThat(hand1.getRank()).isEqualTo(Rank.ONE_PAIR);
    }

    @Test
    public void getRankFindsTwoPairs() throws Exception {
        PokerHand hand0 = new PokerHand("3D3S5D7D5S");
        assertThat(hand0.getRank()).isEqualTo(Rank.TWO_PAIRS);

        PokerHand hand1 = new PokerHand("3D5D7D5S3S");
        assertThat(hand1.getRank()).isEqualTo(Rank.TWO_PAIRS);
    }

    @Test
    public void getRankFindsThreeOfKind() throws Exception {
        PokerHand hand0 = new PokerHand("3C3D3HKSQS");
        assertThat(hand0.getRank()).isEqualTo(Rank.THREE_OF_A_KIND);

        PokerHand hand1 = new PokerHand("3C3DKSQS3H");
        assertThat(hand1.getRank()).isEqualTo(Rank.THREE_OF_A_KIND);
    }

    @Test
    public void getRankFindsFullHouse() throws Exception {
        PokerHand hand0 = new PokerHand("3C3D3H5C5H");
        assertThat(hand0.getRank()).isEqualTo(Rank.FULL_HOUSE);

        PokerHand hand1 = new PokerHand("3C6C3H6S6H");
        assertThat(hand1.getRank()).isEqualTo(Rank.FULL_HOUSE);
    }

    @Test
    public void getRankFindsFourOfKind() throws Exception {
        PokerHand hand0 = new PokerHand("3C3D3HKS3S");
        assertThat(hand0.getRank()).isEqualTo(Rank.FOUR_OF_A_KIND);

        PokerHand hand1 = new PokerHand("3C3D3SQS3H");
        assertThat(hand1.getRank()).isEqualTo(Rank.FOUR_OF_A_KIND);
    }

    @Test
    public void getRankFindsRoyalFlush() throws Exception {
        PokerHand hand0 = new PokerHand("ASKSQSJSTS");
        assertThat(hand0.getRank()).isEqualTo(Rank.ROYAL_FLUSH);
    }

    @Test
    public void getRankFindsStraightFlush() throws Exception {
        PokerHand hand0 = new PokerHand("3C4C5C6C7C");
        assertThat(hand0.getRank()).isEqualTo(Rank.STRAIGHT_FLUSH);

        PokerHand hand1 = new PokerHand("7S8S9STSJS");
        assertThat(hand1.getRank()).isEqualTo(Rank.STRAIGHT_FLUSH);
    }

    @Test
    public void getRankFindsFlush() throws Exception {
        PokerHand hand0 = new PokerHand("3C5C7C9CKC");
        assertThat(hand0.getRank()).isEqualTo(Rank.FLUSH);

        PokerHand hand1 = new PokerHand("2C3C4C5CQC");
        assertThat(hand1.getRank()).isEqualTo(Rank.FLUSH);
    }

    @Test
    public void getRankFindsStraight() throws Exception {
        PokerHand hand0 = new PokerHand("3S4S5S6S7C");
        assertThat(hand0.getRank()).isEqualTo(Rank.STRAIGHT);

        PokerHand hand1 = new PokerHand("KSQSJSTSAC");
        assertThat(hand1.getRank()).isEqualTo(Rank.STRAIGHT);
    }

}
