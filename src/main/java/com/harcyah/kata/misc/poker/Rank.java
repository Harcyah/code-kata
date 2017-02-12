package com.harcyah.kata.misc.poker;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public enum Rank implements RankMatcher {

    ROYAL_FLUSH {
        @Override
        public boolean matches(PokerHand hand) {
            return STRAIGHT_FLUSH.matches(hand) && hand.getCardsSortedByValueDesc().get(0).getValue().equals(PokerCard.Value._A);
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
            return Rank.getGroupsOfCardsBySuit(hand, 5).size() == 1;
        }
    },

    STRAIGHT {
        @Override
        public boolean matches(PokerHand hand) {
            List<PokerCard> cards = hand.getCardsSortedByValueAsc();
            PokerCard.Value value = cards.get(0).getValue();
            for (int i=1; i<cards.size(); i++) {
                PokerCard.Value next = cards.get(i).getValue();
                if (value.ordinal() + i != next.ordinal()) {
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
            return Rank.getGroupsOfCardsByValue(hand, 2).size() == 1;        }
    };

    private static List<List<PokerCard>> getGroupsOfCardsBySuit(PokerHand hand, int size) {
        Map<PokerCard.Suit, List<PokerCard>> groups = hand.getCards().stream().collect(Collectors.groupingBy(PokerCard::getSuit));
        return groups.values().stream().filter(x -> x.size() == size).collect(Collectors.toList());
    }

    private static List<List<PokerCard>> getGroupsOfCardsByValue(PokerHand hand, int size) {
        Map<PokerCard.Value, List<PokerCard>> groups = hand.getCards().stream().collect(Collectors.groupingBy(PokerCard::getValue));
        return groups.values().stream().filter(x -> x.size() == size).collect(Collectors.toList());
    }

}

