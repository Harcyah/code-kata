package com.harcyah.kata.misc.poker;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class PokerHandTest {

    private static final String ONE_PAIR_1 = "3D 3S 5D 7D 9D";
    private static final String ONE_PAIR_2 = "3D 5D 7D 9D 3S";

    private static final String TWO_PAIRS_1 = "3D 3S 5D 7D 5S";
    private static final String TWO_PAIRS_2 = "3D 5D 7D 5S 3S";

    private static final String THREE_OF_A_KIND_1 = "3C 3D 3H KS QS";
    private static final String THREE_OF_A_KIND_2 = "3C 3D KS QS 3H";

    private static final String FOUR_OF_A_KIND_1 = "3C 3D 3H KS 3S";
    private static final String FOUR_OF_A_KIND_2 = "3C 3D 3S QS 3H";

    private static final String FLUSH_1 = "3C 5C 7C 9C KC";
    private static final String FLUSH_2 = "2C 3C 4C 5C QC";

    private static final String STRAIGHT_1 = "3S 4S 5S 6S 7C";
    private static final String STRAIGHT_2 = "KS QS JS TS AC";

    private static final String FULL_HOUSE_1 = "3C 3D 3H 5C 5H";
    private static final String FULL_HOUSE_2 = "3C 6C 3H 6S 6H";

    private static final String STRAIGHT_FLUSH_1 = "3C 4C 5C 6C 7C";
    private static final String STRAIGHT_FLUSH_2 = "7S 8S 9S TS JS";

    private static final String ROYAL_FLUSH = "AS KS QS JS TS";

    private static final String HIGH_CARD = "7H 9H TS JS 3H";

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorThrowsExceptionIfStringArgumentHasIncorrectSize() throws Exception {
        new PokerHand("lorem ipsum dolor sit amet");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorThrowsExceptionIfSameCardAppearsTwice() throws Exception {
        new PokerHand("7H 9H TS JS JS");
    }

    @Test
    public void testGetCardsAreExposedSortedByValueDesc() throws Exception {
        PokerHand hand = new PokerHand("3D KS 5D 7D 9D");
        List<PokerCard> cards = hand.getCards();
        assertThat(cards).extractingResultOf("toString").containsExactly("KS", "9D", "7D", "5D", "3D");
    }

    @Test
    public void testGetRankFindsNothing() throws Exception {
        PokerHand hand = new PokerHand(HIGH_CARD);
        assertThat(hand.getRank()).isNull();
    }

    @Test
    public void testGetRankFindsOnePair() throws Exception {
        PokerHand hand0 = new PokerHand(ONE_PAIR_1);
        assertThat(hand0.getRank()).isEqualTo(Rank.ONE_PAIR);

        PokerHand hand1 = new PokerHand(ONE_PAIR_2);
        assertThat(hand1.getRank()).isEqualTo(Rank.ONE_PAIR);
    }

    @Test
    public void testGetRankFindsTwoPairs() throws Exception {
        PokerHand hand0 = new PokerHand(TWO_PAIRS_1);
        assertThat(hand0.getRank()).isEqualTo(Rank.TWO_PAIRS);

        PokerHand hand1 = new PokerHand(TWO_PAIRS_2);
        assertThat(hand1.getRank()).isEqualTo(Rank.TWO_PAIRS);
    }

    @Test
    public void testGetRankFindsThreeOfKind() throws Exception {
        PokerHand hand0 = new PokerHand(THREE_OF_A_KIND_1);
        assertThat(hand0.getRank()).isEqualTo(Rank.THREE_OF_A_KIND);

        PokerHand hand1 = new PokerHand(THREE_OF_A_KIND_2);
        assertThat(hand1.getRank()).isEqualTo(Rank.THREE_OF_A_KIND);
    }

    @Test
    public void testGetRankFindsFullHouse() throws Exception {
        PokerHand hand0 = new PokerHand(FULL_HOUSE_1);
        assertThat(hand0.getRank()).isEqualTo(Rank.FULL_HOUSE);

        PokerHand hand1 = new PokerHand(FULL_HOUSE_2);
        assertThat(hand1.getRank()).isEqualTo(Rank.FULL_HOUSE);
    }

    @Test
    public void testGetRankFindsFourOfKind() throws Exception {
        PokerHand hand0 = new PokerHand(FOUR_OF_A_KIND_1);
        assertThat(hand0.getRank()).isEqualTo(Rank.FOUR_OF_A_KIND);

        PokerHand hand1 = new PokerHand(FOUR_OF_A_KIND_2);
        assertThat(hand1.getRank()).isEqualTo(Rank.FOUR_OF_A_KIND);
    }

    @Test
    public void testGetRankFindsFlush() throws Exception {
        PokerHand hand0 = new PokerHand(FLUSH_1);
        assertThat(hand0.getRank()).isEqualTo(Rank.FLUSH);

        PokerHand hand1 = new PokerHand(FLUSH_2);
        assertThat(hand1.getRank()).isEqualTo(Rank.FLUSH);
    }

    @Test
    public void testGetRankFindsStraight() throws Exception {
        PokerHand hand0 = new PokerHand(STRAIGHT_1);
        assertThat(hand0.getRank()).isEqualTo(Rank.STRAIGHT);

        PokerHand hand1 = new PokerHand(STRAIGHT_2);
        assertThat(hand1.getRank()).isEqualTo(Rank.STRAIGHT);
    }

    @Test
    public void testGetRankFindsStraightFlush() throws Exception {
        PokerHand hand0 = new PokerHand(STRAIGHT_FLUSH_1);
        assertThat(hand0.getRank()).isEqualTo(Rank.STRAIGHT_FLUSH);

        PokerHand hand1 = new PokerHand(STRAIGHT_FLUSH_2);
        assertThat(hand1.getRank()).isEqualTo(Rank.STRAIGHT_FLUSH);
    }

    @Test
    public void testGetRankFindsRoyalFlush() throws Exception {
        PokerHand hand0 = new PokerHand(ROYAL_FLUSH);
        assertThat(hand0.getRank()).isEqualTo(Rank.ROYAL_FLUSH);
    }

    @Test
    public void testRoyalFlushBeatsStraightFlush() throws Exception {
        PokerHand royalFlush = new PokerHand(ROYAL_FLUSH);
        PokerHand straightFlush = new PokerHand(STRAIGHT_FLUSH_1);
        assertThat(straightFlush).isLessThan(royalFlush);
        assertThat(royalFlush).isGreaterThan(straightFlush);
    }

    @Test
    public void testStraightFlushBeatsFourOfAKind() throws Exception {
        PokerHand straightFlush = new PokerHand(STRAIGHT_FLUSH_1);
        PokerHand fourOfAKind = new PokerHand(FOUR_OF_A_KIND_1);
        assertThat(fourOfAKind).isLessThan(straightFlush);
        assertThat(straightFlush).isGreaterThan(fourOfAKind);
    }

    @Test
    public void testFourOfAKindBeatsFullHouse() throws Exception {
        PokerHand fourOfAKind = new PokerHand(FOUR_OF_A_KIND_1);
        PokerHand fullHouse = new PokerHand(FULL_HOUSE_1);
        assertThat(fullHouse).isLessThan(fourOfAKind);
        assertThat(fourOfAKind).isGreaterThan(fullHouse);
    }

    @Test
    public void testFullHouseBeatsFlush() throws Exception {
        PokerHand fullHouse = new PokerHand(FULL_HOUSE_1);
        PokerHand flush = new PokerHand(FLUSH_1);
        assertThat(flush).isLessThan(fullHouse);
        assertThat(fullHouse).isGreaterThan(flush);
    }

    @Test
    public void testFlushBeatsStraight() throws Exception {
        PokerHand flush = new PokerHand(FLUSH_1);
        PokerHand straight = new PokerHand(STRAIGHT_1);
        assertThat(straight).isLessThan(flush);
        assertThat(flush).isGreaterThan(straight);
    }

    @Test
    public void testStraightBeatsThreeOfAKind() throws Exception {
        PokerHand straight = new PokerHand(STRAIGHT_1);
        PokerHand threeOfAKind = new PokerHand(THREE_OF_A_KIND_1);
        assertThat(threeOfAKind).isLessThan(straight);
        assertThat(straight).isGreaterThan(threeOfAKind);
    }

    @Test
    public void testThreeOfAKindBeatsTwoPairs() throws Exception {
        PokerHand threeOfAKind = new PokerHand(THREE_OF_A_KIND_1);
        PokerHand twoPairs = new PokerHand(TWO_PAIRS_1);
        assertThat(twoPairs).isLessThan(threeOfAKind);
        assertThat(threeOfAKind).isGreaterThan(twoPairs);
    }

    @Test
    public void testTwoPairsBeatsOnePair() throws Exception {
        PokerHand twoPairs = new PokerHand(TWO_PAIRS_1);
        PokerHand onePair = new PokerHand(ONE_PAIR_1);
        assertThat(onePair).isLessThan(twoPairs);
        assertThat(twoPairs).isGreaterThan(onePair);
    }

    @Test
    public void testOnePairBeatsHighCard() throws Exception {
        PokerHand onePair = new PokerHand(ONE_PAIR_1);
        PokerHand highCard = new PokerHand(HIGH_CARD);
        assertThat(highCard).isLessThan(onePair);
        assertThat(onePair).isGreaterThan(highCard);
    }

}
