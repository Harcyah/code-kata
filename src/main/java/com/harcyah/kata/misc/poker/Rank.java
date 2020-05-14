package com.harcyah.kata.misc.poker;

import com.harcyah.kata.misc.poker.suits.Suit;
import com.harcyah.kata.misc.poker.values.Value;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public enum Rank implements RankMatcher {

    ROYAL_FLUSH {
        @Override
        public boolean matches(PokerHand hand) {
            return STRAIGHT_FLUSH.matches(hand) && hand.getCards().get(0).getValue().equals(Value._A);
        }
    },

    STRAIGHT_FLUSH {
        @Override
        public boolean matches(PokerHand hand) {
            return STRAIGHT.matches(hand) && FLUSH.matches(hand);
        }
    },

    FOUR_OF_A_KIND {
        @Override
        public boolean matches(PokerHand hand) {
            return Rank.getGroupsOfCardsByValue(hand, 4).size() == 1;
        }
    },

    FULL_HOUSE {
        @Override
        public boolean matches(PokerHand hand) {
            return Rank.getGroupsOfCardsByValue(hand, 3).size() == 1 && Rank.getGroupsOfCardsByValue(hand, 2).size() == 1;
        }
    },

    FLUSH {
        @Override
        public boolean matches(PokerHand hand) {
            Suit suit = hand.getCards().iterator().next().getSuit();
            return hand.getCards().stream().allMatch(x -> x.getSuit().equals(suit));
        }
    },

    STRAIGHT {
        @Override
        public boolean matches(PokerHand hand) {
            List<PokerCard> cards = hand.getCards();
            Value value = cards.get(0).getValue();
            for (int i = 1; i < cards.size(); i++) {
                Value next = cards.get(i).getValue();
                if (value.ordinal() - i != next.ordinal()) {
                    return false;
                }
            }
            return true;
        }
    },

    THREE_OF_A_KIND {
        @Override
        public boolean matches(PokerHand hand) {
            return Rank.getGroupsOfCardsByValue(hand, 3).size() == 1;
        }
    },

    TWO_PAIRS {
        @Override
        public boolean matches(PokerHand hand) {
            return Rank.getGroupsOfCardsByValue(hand, 2).size() == 2;
        }
    },

    ONE_PAIR {
        @Override
        public boolean matches(PokerHand hand) {
            return Rank.getGroupsOfCardsByValue(hand, 2).size() == 1;
        }
    };

    private static List<List<PokerCard>> getGroupsOfCardsByValue(PokerHand hand, int size) {
        Map<Value, List<PokerCard>> groups = hand.getCards().stream().collect(Collectors.groupingBy(PokerCard::getValue));
        return groups.values().stream().filter(x -> x.size() == size).collect(Collectors.toList());
    }

}

