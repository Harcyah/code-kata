package com.harcyah.kata.misc.poker;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public enum Rank implements RankMatcher {

    ROYAL_FLUSH {
        @Override
        public boolean matches(Set<PokerCard> cards) {
            return false;
        }
    },

    STRAIGHT_FLUSH {
        @Override
        public boolean matches(Set<PokerCard> cards) {
            return false;
        }
    },

    FOUR_OF_A_KIND {
        @Override
        public boolean matches(Set<PokerCard> cards) {
            return Rank.getGroupsOfCards(cards, 4).size() == 1;
        }
    },

    FULL_HOUSE {
        @Override
        public boolean matches(Set<PokerCard> cards) {
            return false;
        }
    },

    FLUSH {
        @Override
        public boolean matches(Set<PokerCard> cards) {
            return false;
        }
    },

    STRAIGH {
        @Override
        public boolean matches(Set<PokerCard> cards) {
            return false;
        }
    },

    THREE_OF_A_KIND {
        @Override
        public boolean matches(Set<PokerCard> cards) {
            return Rank.getGroupsOfCards(cards, 3).size() == 1;
        }
    },

    TWO_PAIRS {
        @Override
        public boolean matches(Set<PokerCard> cards) {
            return Rank.getGroupsOfCards(cards, 2).size() == 2;
        }
    },

    ONE_PAIR {
        @Override
        public boolean matches(Set<PokerCard> cards) {
            return Rank.getGroupsOfCards(cards, 2).size() == 1;        }
    };

    private static List<List<PokerCard>> getGroupsOfCards(Set<PokerCard> cards, int size) {
        Map<PokerCard.Value, List<PokerCard>> groups = cards.stream().collect(Collectors.groupingBy(PokerCard::getValue));
        return groups.values().stream().filter(x -> x.size() == size).collect(Collectors.toList());
    }

}

