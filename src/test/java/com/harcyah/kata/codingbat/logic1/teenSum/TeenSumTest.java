package com.harcyah.kata.codingbat.logic1.teenSum;

import org.junit.Assert;
import org.junit.Test;

public class TeenSumTest {

    @Test
    public void testTeenSum() {
        TeenSum teenSum = new TeenSum();
        Assert.assertEquals(7, teenSum.teenSum(3, 4));
        Assert.assertEquals(19, teenSum.teenSum(10, 13));
        Assert.assertEquals(19, teenSum.teenSum(13, 2));
        Assert.assertEquals(19, teenSum.teenSum(3, 19));
        Assert.assertEquals(19, teenSum.teenSum(13, 13));
        Assert.assertEquals(20, teenSum.teenSum(10, 10));
        Assert.assertEquals(19, teenSum.teenSum(6, 14));
        Assert.assertEquals(19, teenSum.teenSum(15, 2));
        Assert.assertEquals(19, teenSum.teenSum(19, 19));
        Assert.assertEquals(19, teenSum.teenSum(19, 20));
        Assert.assertEquals(19, teenSum.teenSum(2, 18));
        Assert.assertEquals(16, teenSum.teenSum(12, 4));
        Assert.assertEquals(22, teenSum.teenSum(2, 20));
        Assert.assertEquals(19, teenSum.teenSum(2, 17));
        Assert.assertEquals(19, teenSum.teenSum(2, 16));
        Assert.assertEquals(13, teenSum.teenSum(6, 7));
    }

}
