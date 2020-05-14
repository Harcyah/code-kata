package com.harcyah.kata.codingbat.warmup2.stringMatch;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringMatchTest {

    @Test
    public void testStringMatch() {
        StringMatch stringMatch = new StringMatch();
        assertEquals(3, stringMatch.stringMatch("xxcaazz", "xxbaaz"));
        assertEquals(2, stringMatch.stringMatch("abc", "abc"));
        assertEquals(0, stringMatch.stringMatch("abc", "axc"));
        assertEquals(1, stringMatch.stringMatch("hello", "he"));
        assertEquals(1, stringMatch.stringMatch("he", "hello"));
        assertEquals(0, stringMatch.stringMatch("h", "hello"));
        assertEquals(0, stringMatch.stringMatch("", "hello"));
        assertEquals(1, stringMatch.stringMatch("aabbccdd", "abbbxxd"));
        assertEquals(3, stringMatch.stringMatch("aaxxaaxx", "iaxxai"));
        assertEquals(3, stringMatch.stringMatch("iaxxai", "aaxxaaxx"));
    }

}
