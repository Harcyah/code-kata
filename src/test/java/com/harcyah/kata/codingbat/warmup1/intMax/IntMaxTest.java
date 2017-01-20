package com.harcyah.kata.codingbat.warmup1.intMax;

import org.junit.Assert;
import org.junit.Test;

public class IntMaxTest {

    @Test
    public void testIntMax() {
        IntMax intMax = new IntMax();
        Assert.assertEquals(3, intMax.intMax(1, 2, 3));
        Assert.assertEquals(3, intMax.intMax(1, 3, 2));
        Assert.assertEquals(3, intMax.intMax(3, 2, 1));
        Assert.assertEquals(9, intMax.intMax(9, 3, 3));
        Assert.assertEquals(9, intMax.intMax(3, 9, 3));
        Assert.assertEquals(9, intMax.intMax(3, 3, 9));
        Assert.assertEquals(8, intMax.intMax(8, 2, 3));
        Assert.assertEquals(-1, intMax.intMax(-3, -1, -2));
        Assert.assertEquals(6, intMax.intMax(6, 2, 5));
        Assert.assertEquals(6, intMax.intMax(5, 6, 2));
        Assert.assertEquals(6, intMax.intMax(5, 2, 6));
    }

}