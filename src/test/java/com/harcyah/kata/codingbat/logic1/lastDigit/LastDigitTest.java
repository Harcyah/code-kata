package com.harcyah.kata.codingbat.logic1.lastDigit;

import org.junit.Assert;
import org.junit.Test;

public class LastDigitTest {

    @Test
    public void testLastDigit() {
        LastDigit lastDigit = new LastDigit();
        Assert.assertEquals(true, lastDigit.lastDigit(23, 19, 13));
        Assert.assertEquals(false, lastDigit.lastDigit(23, 19, 12));
        Assert.assertEquals(true, lastDigit.lastDigit(23, 19, 3));
        Assert.assertEquals(true, lastDigit.lastDigit(23, 19, 39));
        Assert.assertEquals(false, lastDigit.lastDigit(1, 2, 3));
        Assert.assertEquals(true, lastDigit.lastDigit(1, 1, 2));
        Assert.assertEquals(true, lastDigit.lastDigit(1, 2, 2));
        Assert.assertEquals(false, lastDigit.lastDigit(14, 25, 43));
        Assert.assertEquals(true, lastDigit.lastDigit(14, 25, 45));
        Assert.assertEquals(false, lastDigit.lastDigit(248, 106, 1002));
        Assert.assertEquals(true, lastDigit.lastDigit(248, 106, 1008));
        Assert.assertEquals(true, lastDigit.lastDigit(10, 11, 20));
        Assert.assertEquals(true, lastDigit.lastDigit(0, 11, 0));
    }

}
