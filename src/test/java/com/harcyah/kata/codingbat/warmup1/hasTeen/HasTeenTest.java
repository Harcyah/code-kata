package com.harcyah.kata.codingbat.warmup1.hasTeen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HasTeenTest {

    @Test
    public void testHasTeen() {
        HasTeen hasTeen = new HasTeen();
        assertTrue(hasTeen.hasTeen(13, 20, 10));
        assertTrue(hasTeen.hasTeen(20, 19, 10));
        assertTrue(hasTeen.hasTeen(20, 10, 13));
        assertFalse(hasTeen.hasTeen(1, 20, 12));
        assertTrue(hasTeen.hasTeen(19, 20, 12));
        assertTrue(hasTeen.hasTeen(12, 20, 19));
        assertFalse(hasTeen.hasTeen(12, 9, 20));
        assertTrue(hasTeen.hasTeen(12, 18, 20));
        assertTrue(hasTeen.hasTeen(14, 2, 20));
        assertFalse(hasTeen.hasTeen(4, 2, 20));
        assertFalse(hasTeen.hasTeen(11, 22, 22));
    }

}
