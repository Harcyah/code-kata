package com.harcyah.kata.codingbat.string1.atFirst;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AtFirstTest {

    @Test
    public void testAtFirst() {
        AtFirst atFirst = new AtFirst();
        assertEquals("he", atFirst.atFirst("hello"));
        assertEquals("hi", atFirst.atFirst("hi"));
        assertEquals("h@", atFirst.atFirst("h"));
        assertEquals("@@", atFirst.atFirst(""));
        assertEquals("ki", atFirst.atFirst("kitten"));
        assertEquals("ja", atFirst.atFirst("java"));
        assertEquals("j@", atFirst.atFirst("j"));
    }

}
