package com.harcyah.kata.codingbat.logic2.blackjack;

import org.junit.Assert;
import org.junit.Test;

public class BlackjackTest {

    @Test
    public void testBlackjack() {
        Blackjack blackjack = new Blackjack();
        Assert.assertEquals(21, blackjack.blackjack(19, 21));
        Assert.assertEquals(21, blackjack.blackjack(21, 19));
        Assert.assertEquals(19, blackjack.blackjack(19, 22));
        Assert.assertEquals(19, blackjack.blackjack(22, 19));
        Assert.assertEquals(0, blackjack.blackjack(22, 50));
        Assert.assertEquals(0, blackjack.blackjack(22, 22));
        Assert.assertEquals(1, blackjack.blackjack(33, 1));
        Assert.assertEquals(2, blackjack.blackjack(1, 2));
        Assert.assertEquals(0, blackjack.blackjack(34, 33));
        Assert.assertEquals(19, blackjack.blackjack(17, 19));
        Assert.assertEquals(18, blackjack.blackjack(18, 17));
        Assert.assertEquals(16, blackjack.blackjack(16, 23));
        Assert.assertEquals(4, blackjack.blackjack(3, 4));
        Assert.assertEquals(3, blackjack.blackjack(3, 2));
        Assert.assertEquals(21, blackjack.blackjack(21, 20));
    }

}
