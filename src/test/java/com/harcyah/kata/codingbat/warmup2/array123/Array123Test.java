package com.harcyah.kata.codingbat.warmup2.array123;

import org.junit.Assert;
import org.junit.Test;

public class Array123Test {

    @Test
    public void testArray123() {
        Array123 array123 = new Array123();
        Assert.assertEquals(true, array123.array123(new int[]{1, 1, 2, 3, 1}));
        Assert.assertEquals(false, array123.array123(new int[]{1, 1, 2, 4, 1}));
        Assert.assertEquals(true, array123.array123(new int[]{1, 1, 2, 1, 2, 3}));
        Assert.assertEquals(false, array123.array123(new int[]{1, 1, 2, 1, 2, 1}));
        Assert.assertEquals(true, array123.array123(new int[]{1, 2, 3, 1, 2, 3}));
        Assert.assertEquals(true, array123.array123(new int[]{1, 2, 3}));
        Assert.assertEquals(false, array123.array123(new int[]{1, 1, 1}));
        Assert.assertEquals(false, array123.array123(new int[]{1, 2}));
        Assert.assertEquals(false, array123.array123(new int[]{1}));
        Assert.assertEquals(false, array123.array123(new int[]{}));
    }

}
