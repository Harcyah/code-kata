package com.harcyah.kata.codingbat.logic2.loneSum;

import org.junit.Assert;
import org.junit.Test;

public class LoneSumTest {

    @Test
    public void testLoneSum() {
        LoneSum loneSum = new LoneSum();
        Assert.assertEquals(6, loneSum.loneSum(1, 2, 3));
        Assert.assertEquals(2, loneSum.loneSum(3, 2, 3));
        Assert.assertEquals(0, loneSum.loneSum(3, 3, 3));
        Assert.assertEquals(9, loneSum.loneSum(9, 2, 2));
        Assert.assertEquals(9, loneSum.loneSum(2, 2, 9));
        Assert.assertEquals(9, loneSum.loneSum(2, 9, 2));
        Assert.assertEquals(14, loneSum.loneSum(2, 9, 3));
        Assert.assertEquals(9, loneSum.loneSum(4, 2, 3));
        Assert.assertEquals(3, loneSum.loneSum(1, 3, 1));
    }

}
