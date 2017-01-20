package com.harcyah.kata.codingbat.logic2.luckySum;

import org.junit.Assert;
import org.junit.Test;

public class LuckySumTest {

    @Test
    public void testLuckySum() {
        LuckySum luckySum = new LuckySum();
        Assert.assertEquals(6, luckySum.luckySum(1, 2, 3));
        Assert.assertEquals(3, luckySum.luckySum(1, 2, 13));
        Assert.assertEquals(1, luckySum.luckySum(1, 13, 3));
        Assert.assertEquals(1, luckySum.luckySum(1, 13, 13));
        Assert.assertEquals(13, luckySum.luckySum(6, 5, 2));
        Assert.assertEquals(0, luckySum.luckySum(13, 2, 3));
        Assert.assertEquals(0, luckySum.luckySum(13, 2, 13));
        Assert.assertEquals(0, luckySum.luckySum(13, 13, 2));
        Assert.assertEquals(13, luckySum.luckySum(9, 4, 13));
        Assert.assertEquals(8, luckySum.luckySum(8, 13, 2));
        Assert.assertEquals(10, luckySum.luckySum(7, 2, 1));
        Assert.assertEquals(6, luckySum.luckySum(3, 3, 13));
    }

}
