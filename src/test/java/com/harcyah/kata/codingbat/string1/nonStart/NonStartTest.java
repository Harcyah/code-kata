package com.harcyah.kata.codingbat.string1.nonStart;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NonStartTest {

    @Test
    public void testNonStart() {
        NonStart nonStart = new NonStart();
        assertEquals("ellohere", nonStart.nonStart("Hello", "There"));
        assertEquals("avaode", nonStart.nonStart("java", "code"));
        assertEquals("hotlava", nonStart.nonStart("shotl", "java"));
        assertEquals("by", nonStart.nonStart("ab", "xy"));
        assertEquals("b", nonStart.nonStart("ab", "x"));
        assertEquals("c", nonStart.nonStart("x", "ac"));
        assertEquals("", nonStart.nonStart("a", "x"));
        assertEquals("itat", nonStart.nonStart("kit", "kat"));
        assertEquals("artart", nonStart.nonStart("mart", "dart"));
    }

}
