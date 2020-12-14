package com.harcyah.kata.codingbat.warmup2.has271;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Has271Test {

    @Test
    public void testHas271() {
        Has271 has271 = new Has271();
        assertTrue(has271.has271(new int[]{1, 2, 7, 1}));
        assertFalse(has271.has271(new int[]{1, 2, 8, 1}));
        assertTrue(has271.has271(new int[]{2, 7, 1}));
        assertTrue(has271.has271(new int[]{3, 8, 2}));
        assertTrue(has271.has271(new int[]{2, 7, 3}));
        assertFalse(has271.has271(new int[]{2, 7, 4}));
        assertTrue(has271.has271(new int[]{2, 7, -1}));
        assertFalse(has271.has271(new int[]{2, 7, -2}));
        assertTrue(has271.has271(new int[]{4, 5, 3, 8, 0}));
        assertTrue(has271.has271(new int[]{2, 7, 5, 10, 4}));
        assertTrue(has271.has271(new int[]{2, 7, -2, 4, 9, 3}));
        assertFalse(has271.has271(new int[]{2, 7, 5, 10, 1}));
        assertFalse(has271.has271(new int[]{2, 7, -2, 4, 10, 2}));
    }

}
