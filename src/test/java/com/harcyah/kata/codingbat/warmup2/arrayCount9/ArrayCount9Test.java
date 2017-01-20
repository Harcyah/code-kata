package com.harcyah.kata.codingbat.warmup2.arrayCount9;

import org.junit.Assert;
import org.junit.Test;

public class ArrayCount9Test {

    @Test
    public void testArrayCount9() {
        ArrayCount9 arrayCount9 = new ArrayCount9();
        Assert.assertEquals(1, arrayCount9.arrayCount9(new int[]{1, 2, 9}));
        Assert.assertEquals(2, arrayCount9.arrayCount9(new int[]{1, 9, 9}));
        Assert.assertEquals(3, arrayCount9.arrayCount9(new int[]{1, 9, 9, 3, 9}));
        Assert.assertEquals(0, arrayCount9.arrayCount9(new int[]{1, 2, 3}));
        Assert.assertEquals(0, arrayCount9.arrayCount9(new int[]{}));
        Assert.assertEquals(0, arrayCount9.arrayCount9(new int[]{4, 2, 4, 3, 1}));
        Assert.assertEquals(1, arrayCount9.arrayCount9(new int[]{9, 2, 4, 3, 1}));
    }

}
