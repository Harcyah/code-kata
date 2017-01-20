package com.harcyah.kata.codingbat.warmup2.arrayFront9;

import org.junit.Assert;
import org.junit.Test;

public class ArrayFront9Test {

    @Test
    public void testArrayFront9() {
        ArrayFront9 arrayFront9 = new ArrayFront9();
        Assert.assertEquals(true, arrayFront9.arrayFront9(new int[]{1, 2, 9, 3, 4}));
        Assert.assertEquals(false, arrayFront9.arrayFront9(new int[]{1, 2, 3, 4, 9}));
        Assert.assertEquals(false, arrayFront9.arrayFront9(new int[]{1, 2, 3, 4, 5}));
        Assert.assertEquals(true, arrayFront9.arrayFront9(new int[]{9, 2, 3}));
        Assert.assertEquals(true, arrayFront9.arrayFront9(new int[]{1, 9, 9}));
        Assert.assertEquals(false, arrayFront9.arrayFront9(new int[]{1, 2, 3}));
        Assert.assertEquals(true, arrayFront9.arrayFront9(new int[]{1, 9}));
        Assert.assertEquals(false, arrayFront9.arrayFront9(new int[]{5, 5}));
        Assert.assertEquals(false, arrayFront9.arrayFront9(new int[]{2}));
        Assert.assertEquals(true, arrayFront9.arrayFront9(new int[]{9}));
        Assert.assertEquals(false, arrayFront9.arrayFront9(new int[]{}));
        Assert.assertEquals(true, arrayFront9.arrayFront9(new int[]{3, 9, 2, 3, 3}));
    }
}
