package com.harcyah.kata.codingbat.ap1.scoresClump;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ScoresClumpTest {

    @Test
    public void testScoresClump() {
        ScoresClump scoresClump = new ScoresClump();
        assertTrue(scoresClump.scoresClump(new int[]{3, 4, 5}));
        assertFalse(scoresClump.scoresClump(new int[]{3, 4, 6}));
        assertTrue(scoresClump.scoresClump(new int[]{1, 3, 5, 5}));
        assertTrue(scoresClump.scoresClump(new int[]{2, 4, 5, 6}));
        assertFalse(scoresClump.scoresClump(new int[]{2, 4, 5, 7}));
        assertTrue(scoresClump.scoresClump(new int[]{2, 4, 4, 7}));
        assertFalse(scoresClump.scoresClump(new int[]{3, 3, 6, 7, 9}));
        assertTrue(scoresClump.scoresClump(new int[]{3, 3, 7, 7, 9}));
        assertFalse(scoresClump.scoresClump(new int[]{4, 5, 8}));
    }

}
