package com.harcyah.kata.misc.poker;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import junitparams.naming.TestCaseName;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnitParamsRunner.class)
public class PokerHandComparatorTest {

    @Test
    @Parameters({
        "3S 9H 4S 7S 9S, 2S 3H 4S 7S 9S"
    })
    @TestCaseName("{0} should win versus {1}")
    public void pokerHandComparator(String win, String lose) throws Exception {
        PokerHand winHand = new PokerHand(win);
        PokerHand loseHand = new PokerHand(lose);

        assertThat(winHand).isGreaterThan(loseHand);
        assertThat(loseHand).isLessThan(winHand);
    }

}
