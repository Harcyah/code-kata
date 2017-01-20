package com.harcyah.kata.codingbat.warmup1.close10;

import org.junit.Assert;
import org.junit.Test;

public class Close10Test {

    @Test
    public void testClose10() {
        Close10 close10 = new Close10();
        Assert.assertEquals(8, close10.close10(8, 13));
        Assert.assertEquals(8, close10.close10(13, 8));
        Assert.assertEquals(0, close10.close10(13, 7));
        Assert.assertEquals(0, close10.close10(7, 13));
        Assert.assertEquals(9, close10.close10(9, 13));
        Assert.assertEquals(8, close10.close10(13, 8));
        Assert.assertEquals(10, close10.close10(10, 12));
        Assert.assertEquals(10, close10.close10(11, 10));
        Assert.assertEquals(5, close10.close10(5, 21));
        Assert.assertEquals(0, close10.close10(0, 20));
        Assert.assertEquals(0, close10.close10(10, 10));
    }

}