package com.harcyah.kata.codingbat.ap1.scoreUp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScoreUpTest {

    @Test
    public void testScoreUp() {
        ScoreUp scoreUp = new ScoreUp();
        assertEquals(6, scoreUp.scoreUp(
                new String[]{"a", "a", "b", "b"},
                new String[]{"a", "c", "b", "c"}));
        assertEquals(11, scoreUp.scoreUp(
                new String[]{"a", "a", "b", "b"},
                new String[]{"a", "a", "b", "c"}));
        assertEquals(16, scoreUp.scoreUp(
                new String[]{"a", "a", "b", "b"},
                new String[]{"a", "a", "b", "b"}));
        assertEquals(3, scoreUp.scoreUp(
                new String[]{"a", "a", "b", "b"},
                new String[]{"?", "c", "b", "?"}));
        assertEquals(-1, scoreUp.scoreUp(
                new String[]{"a", "a", "b", "b"},
                new String[]{"?", "c", "?", "?"}));
        assertEquals(7, scoreUp.scoreUp(
                new String[]{"a", "a", "b", "b"},
                new String[]{"c", "?", "b", "b"}));
        assertEquals(3, scoreUp.scoreUp(
                new String[]{"a", "a", "b", "b"},
                new String[]{"c", "?", "b", "?"}));
        assertEquals(2, scoreUp.scoreUp(
                new String[]{"a", "b", "c"},
                new String[]{"a", "c", "b"}));
        assertEquals(4, scoreUp.scoreUp(
                new String[]{"a", "a", "b", "b", "c", "c"},
                new String[]{"a", "c", "a", "c", "a", "c"}));
        assertEquals(6, scoreUp.scoreUp(
                new String[]{"a", "a", "b", "b", "c", "c"},
                new String[]{"a", "c", "?", "?", "a", "c"}));
        assertEquals(11, scoreUp.scoreUp(
                new String[]{"a", "a", "b", "b", "c", "c"},
                new String[]{"a", "c", "?", "?", "c", "c"}));
        assertEquals(12, scoreUp.scoreUp(
                new String[]{"a", "b", "c"},
                new String[]{"a", "b", "c"}));
    }

}
