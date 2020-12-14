package com.harcyah.kata.codingbat.warmup1.in3050;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class In3050Test {

    @Test
    public void testIn3050() {
        In3050 in3050 = new In3050();
        assertTrue(in3050.in3050(30, 31));
        assertFalse(in3050.in3050(30, 41));
        assertTrue(in3050.in3050(40, 50));
        assertFalse(in3050.in3050(40, 51));
        assertFalse(in3050.in3050(39, 50));
        assertFalse(in3050.in3050(50, 39));
        assertTrue(in3050.in3050(40, 39));
        assertTrue(in3050.in3050(49, 48));
        assertTrue(in3050.in3050(50, 40));
        assertFalse(in3050.in3050(50, 51));
        assertTrue(in3050.in3050(35, 36));
        assertFalse(in3050.in3050(35, 45));
    }

}
