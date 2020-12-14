package com.harcyah.kata.codingbat.warmup1.nearHundred;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NearHundredTest {

    @Test
    public void testNearHundred() {
        NearHundred nearHundred = new NearHundred();
        assertTrue(nearHundred.nearHundred(93));
        assertTrue(nearHundred.nearHundred(90));
        assertFalse(nearHundred.nearHundred(89));
        assertTrue(nearHundred.nearHundred(110));
        assertFalse(nearHundred.nearHundred(111));
        assertFalse(nearHundred.nearHundred(121));
        assertFalse(nearHundred.nearHundred(0));
        assertFalse(nearHundred.nearHundred(5));
        assertTrue(nearHundred.nearHundred(191));
        assertFalse(nearHundred.nearHundred(189));
        assertTrue(nearHundred.nearHundred(190));
        assertTrue(nearHundred.nearHundred(200));
        assertTrue(nearHundred.nearHundred(210));
        assertFalse(nearHundred.nearHundred(211));
        assertFalse(nearHundred.nearHundred(290));
    }

}
