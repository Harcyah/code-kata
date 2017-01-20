package com.harcyah.kata.codingbat.warmup1.diff21;

import org.junit.Assert;
import org.junit.Test;

public class Diff21Test {

    @Test
    public void testDiff21() {
        Diff21 diff21 = new Diff21();
        Assert.assertEquals(2, diff21.diff21(19));
        Assert.assertEquals(11, diff21.diff21(10));
        Assert.assertEquals(0, diff21.diff21(21));
        Assert.assertEquals(2, diff21.diff21(22));
        Assert.assertEquals(8, diff21.diff21(25));
        Assert.assertEquals(18, diff21.diff21(30));
        Assert.assertEquals(21, diff21.diff21(0));
        Assert.assertEquals(20, diff21.diff21(1));
        Assert.assertEquals(19, diff21.diff21(2));
        Assert.assertEquals(22, diff21.diff21(-1));
        Assert.assertEquals(23, diff21.diff21(-2));
        Assert.assertEquals(58, diff21.diff21(50));
    }

}
