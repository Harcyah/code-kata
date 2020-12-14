package com.harcyah.kata.codingbat.warmup2.arrayCount9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayCount9Test {

    @Test
    public void testArrayCount9() {
        ArrayCount9 arrayCount9 = new ArrayCount9();
        assertEquals(1, arrayCount9.arrayCount9(new int[]{1, 2, 9}));
        assertEquals(2, arrayCount9.arrayCount9(new int[]{1, 9, 9}));
        assertEquals(3, arrayCount9.arrayCount9(new int[]{1, 9, 9, 3, 9}));
        assertEquals(0, arrayCount9.arrayCount9(new int[]{1, 2, 3}));
        assertEquals(0, arrayCount9.arrayCount9(new int[]{}));
        assertEquals(0, arrayCount9.arrayCount9(new int[]{4, 2, 4, 3, 1}));
        assertEquals(1, arrayCount9.arrayCount9(new int[]{9, 2, 4, 3, 1}));
    }

}
