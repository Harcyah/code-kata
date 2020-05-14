package com.harcyah.kata.codingbat.warmup1.loneTeen;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LoneTeenTest {

    @Test
    public void testLoneTeen() {
        LoneTeen loneTeen = new LoneTeen();
        assertTrue(loneTeen.loneTeen(13, 99));
        assertTrue(loneTeen.loneTeen(21, 19));
        assertFalse(loneTeen.loneTeen(13, 13));
        assertTrue(loneTeen.loneTeen(14, 20));
        assertTrue(loneTeen.loneTeen(20, 15));
        assertFalse(loneTeen.loneTeen(16, 17));
        assertTrue(loneTeen.loneTeen(16, 9));
        assertFalse(loneTeen.loneTeen(16, 18));
        assertFalse(loneTeen.loneTeen(13, 19));
        assertTrue(loneTeen.loneTeen(13, 20));
        assertTrue(loneTeen.loneTeen(6, 18));
        assertTrue(loneTeen.loneTeen(99, 13));
        assertFalse(loneTeen.loneTeen(99, 99));
    }

}
