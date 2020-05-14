package com.harcyah.kata.codingbat.logic2.blackjack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BlackjackTest {

    @Test
    public void testBlackjack() {
        Blackjack blackjack = new Blackjack();
        assertEquals(21, blackjack.blackjack(19, 21));
        assertEquals(21, blackjack.blackjack(21, 19));
        assertEquals(19, blackjack.blackjack(19, 22));
        assertEquals(19, blackjack.blackjack(22, 19));
        assertEquals(0, blackjack.blackjack(22, 50));
        assertEquals(0, blackjack.blackjack(22, 22));
        assertEquals(1, blackjack.blackjack(33, 1));
        assertEquals(2, blackjack.blackjack(1, 2));
        assertEquals(0, blackjack.blackjack(34, 33));
        assertEquals(19, blackjack.blackjack(17, 19));
        assertEquals(18, blackjack.blackjack(18, 17));
        assertEquals(16, blackjack.blackjack(16, 23));
        assertEquals(4, blackjack.blackjack(3, 4));
        assertEquals(3, blackjack.blackjack(3, 2));
        assertEquals(21, blackjack.blackjack(21, 20));
    }

}
