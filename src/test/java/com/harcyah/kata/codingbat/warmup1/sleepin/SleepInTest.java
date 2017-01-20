package com.harcyah.kata.codingbat.warmup1.sleepin;

import org.junit.Assert;
import org.junit.Test;

public class SleepInTest {

    @Test
    public void testSleepIn() {
        SleepIn sleepIn = new SleepIn();
        Assert.assertTrue(sleepIn.sleepIn(false, false));
        Assert.assertFalse(sleepIn.sleepIn(true, false));
        Assert.assertTrue(sleepIn.sleepIn(false, true));
        Assert.assertTrue(sleepIn.sleepIn(true, true));
    }

}
