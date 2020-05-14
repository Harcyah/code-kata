package com.harcyah.kata.codingbat.string1.lastTwo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LastTwoTest {

    @Test
    public void testLastTwo() {
        LastTwo lastTwo = new LastTwo();
        assertEquals("codign", lastTwo.lastTwo("coding"));
        assertEquals("cta", lastTwo.lastTwo("cat"));
        assertEquals("ba", lastTwo.lastTwo("ab"));
        assertEquals("a", lastTwo.lastTwo("a"));
        assertEquals("", lastTwo.lastTwo(""));
    }

}
