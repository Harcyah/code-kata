package com.harcyah.kata.codingbat.warmup1.startHi;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StartHiTest {

    @Test
    public void testStartHi() {
        StartHi startHi = new StartHi();
        assertTrue(startHi.startHi("hi there"));
        assertTrue(startHi.startHi("hi"));
        assertFalse(startHi.startHi("hello hi"));
        assertFalse(startHi.startHi("he"));
        assertFalse(startHi.startHi("h"));
        assertFalse(startHi.startHi(""));
        assertFalse(startHi.startHi("ho hi"));
        assertTrue(startHi.startHi("hi ho"));
    }

}
