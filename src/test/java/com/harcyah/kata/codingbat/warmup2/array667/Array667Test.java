package com.harcyah.kata.codingbat.warmup2.array667;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Array667Test {

    @Test
    public void testArray667() {
        Array667 array667 = new Array667();
        assertEquals(1, array667.array667(new int[]{6, 6, 2}));
        assertEquals(1, array667.array667(new int[]{6, 6, 2, 6}));
        assertEquals(1, array667.array667(new int[]{6, 7, 2, 6}));
        assertEquals(2, array667.array667(new int[]{6, 6, 2, 6, 7}));
        assertEquals(0, array667.array667(new int[]{1, 6, 3}));
        assertEquals(0, array667.array667(new int[]{6, 1}));
        assertEquals(0, array667.array667(new int[]{}));
        assertEquals(1, array667.array667(new int[]{3, 6, 7, 6}));
        assertEquals(2, array667.array667(new int[]{3, 6, 6, 7}));
        assertEquals(1, array667.array667(new int[]{6, 3, 6, 6}));
        assertEquals(2, array667.array667(new int[]{6, 7, 6, 6}));
        assertEquals(0, array667.array667(new int[]{1, 2, 3, 5, 6}));
        assertEquals(1, array667.array667(new int[]{1, 2, 3, 6, 6}));
    }

}
