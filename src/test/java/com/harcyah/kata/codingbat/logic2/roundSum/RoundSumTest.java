package com.harcyah.kata.codingbat.logic2.roundSum;

import org.junit.Assert;
import org.junit.Test;

public class RoundSumTest {

    @Test
    public void testRoundSum() {
        RoundSum roundSum = new RoundSum();
        Assert.assertEquals(60, roundSum.roundSum(16, 17, 18));
        Assert.assertEquals(30, roundSum.roundSum(12, 13, 14));
        Assert.assertEquals(10, roundSum.roundSum(6, 4, 4));
        Assert.assertEquals(20, roundSum.roundSum(4, 6, 5));
        Assert.assertEquals(10, roundSum.roundSum(4, 4, 6));
        Assert.assertEquals(10, roundSum.roundSum(9, 4, 4));
        Assert.assertEquals(0, roundSum.roundSum(0, 0, 1));
        Assert.assertEquals(10, roundSum.roundSum(0, 9, 0));
        Assert.assertEquals(40, roundSum.roundSum(10, 10, 19));
        Assert.assertEquals(90, roundSum.roundSum(20, 30, 40));
        Assert.assertEquals(100, roundSum.roundSum(45, 21, 30));
        Assert.assertEquals(60, roundSum.roundSum(23, 11, 26));
        Assert.assertEquals(70, roundSum.roundSum(23, 24, 25));
        Assert.assertEquals(80, roundSum.roundSum(25, 24, 25));
        Assert.assertEquals(70, roundSum.roundSum(23, 24, 29));
        Assert.assertEquals(70, roundSum.roundSum(11, 24, 36));
        Assert.assertEquals(90, roundSum.roundSum(24, 36, 32));
        Assert.assertEquals(50, roundSum.roundSum(14, 12, 26));
        Assert.assertEquals(40, roundSum.roundSum(12, 10, 24));
    }

}
