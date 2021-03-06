package com.harcyah.kata.codingbat.string1.hasBad;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HasBadTest {

    @Test
    public void testHasBad() {
        HasBad hasBad = new HasBad();
        assertTrue(hasBad.hasBad("badxx"));
        assertTrue(hasBad.hasBad("xbadxx"));
        assertFalse(hasBad.hasBad("xxbadxx"));
        assertFalse(hasBad.hasBad("code"));
        assertTrue(hasBad.hasBad("bad"));
        assertFalse(hasBad.hasBad("ba"));
        assertFalse(hasBad.hasBad("xba"));
        assertTrue(hasBad.hasBad("xbad"));
        assertFalse(hasBad.hasBad(""));
        assertTrue(hasBad.hasBad("badyy"));
    }

}
