package com.harcyah.kata.codingbat.warmup1.sleepin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SleepInTest {

    @Test
    public void testSleepIn() {
        SleepIn sleepIn = new SleepIn();
        assertTrue(sleepIn.sleepIn(false, false));
        assertFalse(sleepIn.sleepIn(true, false));
        assertTrue(sleepIn.sleepIn(false, true));
        assertTrue(sleepIn.sleepIn(true, true));
    }

}
