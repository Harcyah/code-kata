package com.harcyah.kata.codingbat.ap1.scoresIncreasing;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ScoresIncreasingTest {

    @Test
    public void testScoresIncreasing() {
        ScoresIncreasing scoresIncreasing = new ScoresIncreasing();
        assertTrue(scoresIncreasing.scoresIncreasing(new int[]{1, 3, 4}));
        assertFalse(scoresIncreasing.scoresIncreasing(new int[]{1, 3, 2}));
        assertTrue(scoresIncreasing.scoresIncreasing(new int[]{1, 1, 4}));
        assertTrue(scoresIncreasing.scoresIncreasing(new int[]{1, 1, 2, 4, 4, 7}));
        assertFalse(scoresIncreasing.scoresIncreasing(new int[]{1, 1, 2, 4, 3, 7}));
        assertTrue(scoresIncreasing.scoresIncreasing(new int[]{-5, 4, 11}));
    }

}
