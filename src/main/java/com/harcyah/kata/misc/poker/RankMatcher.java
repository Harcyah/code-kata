package com.harcyah.kata.misc.poker;

import java.util.Set;

public interface RankMatcher {

    boolean matches(Set<PokerCard> cards);

}
