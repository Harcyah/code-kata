package com.harcyah.kata.codingbat.warmup2.array123;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Array123Test {

    @Test
    public void testArray123() {
        Array123 array123 = new Array123();
        assertTrue(array123.array123(new int[]{1, 1, 2, 3, 1}));
        assertFalse(array123.array123(new int[]{1, 1, 2, 4, 1}));
        assertTrue(array123.array123(new int[]{1, 1, 2, 1, 2, 3}));
        assertFalse(array123.array123(new int[]{1, 1, 2, 1, 2, 1}));
        assertTrue(array123.array123(new int[]{1, 2, 3, 1, 2, 3}));
        assertTrue(array123.array123(new int[]{1, 2, 3}));
        assertFalse(array123.array123(new int[]{1, 1, 1}));
        assertFalse(array123.array123(new int[]{1, 2}));
        assertFalse(array123.array123(new int[]{1}));
        assertFalse(array123.array123(new int[]{}));
    }

}
