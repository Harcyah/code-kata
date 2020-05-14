package com.harcyah.kata.codingbat.warmup1.makes10;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Makes10Test {

    @Test
    public void testMakes10() {
        Makes10 makes10 = new Makes10();
        assertTrue(makes10.makes10(9, 10));
        assertFalse(makes10.makes10(9, 9));
        assertTrue(makes10.makes10(1, 9));
        assertTrue(makes10.makes10(10, 1));
        assertTrue(makes10.makes10(10, 10));
        assertTrue(makes10.makes10(8, 2));
        assertFalse(makes10.makes10(8, 3));
        assertTrue(makes10.makes10(10, 42));
        assertTrue(makes10.makes10(12, -2));
    }

}
