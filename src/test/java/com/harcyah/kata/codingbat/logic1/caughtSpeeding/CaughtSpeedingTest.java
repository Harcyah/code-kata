package com.harcyah.kata.codingbat.logic1.caughtSpeeding;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CaughtSpeedingTest {

    @Test
    public void testCaughtSpeeding() {
        CaughtSpeeding caughtSpeeding = new CaughtSpeeding();
        assertEquals(0, caughtSpeeding.caughtSpeeding(60, false));
        assertEquals(1, caughtSpeeding.caughtSpeeding(65, false));
        assertEquals(0, caughtSpeeding.caughtSpeeding(65, true));
        assertEquals(1, caughtSpeeding.caughtSpeeding(80, false));
        assertEquals(2, caughtSpeeding.caughtSpeeding(85, false));
        assertEquals(1, caughtSpeeding.caughtSpeeding(85, true));
        assertEquals(1, caughtSpeeding.caughtSpeeding(70, false));
        assertEquals(1, caughtSpeeding.caughtSpeeding(75, false));
        assertEquals(1, caughtSpeeding.caughtSpeeding(75, true));
        assertEquals(0, caughtSpeeding.caughtSpeeding(40, false));
        assertEquals(0, caughtSpeeding.caughtSpeeding(40, true));
        assertEquals(2, caughtSpeeding.caughtSpeeding(90, false));
    }

}
