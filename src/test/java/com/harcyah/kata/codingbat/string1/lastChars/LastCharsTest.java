package com.harcyah.kata.codingbat.string1.lastChars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LastCharsTest {

    @Test
    public void testLastChars() {
        LastChars lastChars = new LastChars();
        assertEquals("ls", lastChars.lastChars("last", "chars"));
        assertEquals("ya", lastChars.lastChars("yo", "java"));
        assertEquals("h@", lastChars.lastChars("hi", ""));
        assertEquals("@o", lastChars.lastChars("", "hello"));
        assertEquals("@@", lastChars.lastChars("", ""));
        assertEquals("ki", lastChars.lastChars("kitten", "hi"));
        assertEquals("kp", lastChars.lastChars("k", "zip"));
        assertEquals("k@", lastChars.lastChars("kitten", ""));
        assertEquals("kp", lastChars.lastChars("kitten", "zip"));
    }

}
