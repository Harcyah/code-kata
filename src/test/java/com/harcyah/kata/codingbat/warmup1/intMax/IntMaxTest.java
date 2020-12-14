package com.harcyah.kata.codingbat.warmup1.intMax;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntMaxTest {

    @Test
    public void testIntMax() {
        IntMax intMax = new IntMax();
        assertEquals(3, intMax.intMax(1, 2, 3));
        assertEquals(3, intMax.intMax(1, 3, 2));
        assertEquals(3, intMax.intMax(3, 2, 1));
        assertEquals(9, intMax.intMax(9, 3, 3));
        assertEquals(9, intMax.intMax(3, 9, 3));
        assertEquals(9, intMax.intMax(3, 3, 9));
        assertEquals(8, intMax.intMax(8, 2, 3));
        assertEquals(-1, intMax.intMax(-3, -1, -2));
        assertEquals(6, intMax.intMax(6, 2, 5));
        assertEquals(6, intMax.intMax(5, 6, 2));
        assertEquals(6, intMax.intMax(5, 2, 6));
    }

}
