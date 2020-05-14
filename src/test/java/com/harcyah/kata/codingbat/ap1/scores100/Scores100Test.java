package com.harcyah.kata.codingbat.ap1.scores100;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Scores100Test {

    @Test
    public void testScores100() {
        Scores100 scores100 = new Scores100();
        assertTrue(scores100.scores100(new int[]{1, 100, 100}));
        assertFalse(scores100.scores100(new int[]{1, 100, 99, 100}));
        assertTrue(scores100.scores100(new int[]{100, 1, 100, 100}));
        assertFalse(scores100.scores100(new int[]{100, 1, 100, 1}));
        assertFalse(scores100.scores100(new int[]{1, 2, 3, 4, 5}));
        assertFalse(scores100.scores100(new int[]{1, 2, 100, 4, 5}));
    }

}
