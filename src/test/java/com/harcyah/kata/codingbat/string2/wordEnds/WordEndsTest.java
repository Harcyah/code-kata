package com.harcyah.kata.codingbat.string2.wordEnds;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordEndsTest {

    @Test
    public void testWordEnds() {
        WordEnds wordEnds = new WordEnds();
        assertEquals("c13i", wordEnds.wordEnds("abcXY123XYijk", "XY"));
        assertEquals("13", wordEnds.wordEnds("XY123XY", "XY"));
        assertEquals("11", wordEnds.wordEnds("XY1XY", "XY"));
        assertEquals("XY", wordEnds.wordEnds("XYXY", "XY"));
        assertEquals("", wordEnds.wordEnds("XY", "XY"));
        assertEquals("", wordEnds.wordEnds("Hi", "XY"));
        assertEquals("", wordEnds.wordEnds("", "XY"));
        assertEquals("cxziij", wordEnds.wordEnds("abc1xyz1i1j", "1"));
        assertEquals("cxz", wordEnds.wordEnds("abc1xyz1", "1"));
        assertEquals("cxz11", wordEnds.wordEnds("abc1xyz11", "1"));
        assertEquals("11", wordEnds.wordEnds("abc1xyz1abc", "abc"));
        assertEquals("acac", wordEnds.wordEnds("abc1xyz1abc", "b"));
        assertEquals("1111", wordEnds.wordEnds("abc1abc1abc", "abc"));
    }

}
