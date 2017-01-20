package com.harcyah.kata.codingbat.string2.wordEnds;

import org.junit.Assert;
import org.junit.Test;

public class WordEndsTest {

    @Test
    public void testWordEnds() {
        WordEnds wordEnds = new WordEnds();
        Assert.assertEquals("c13i", wordEnds.wordEnds("abcXY123XYijk", "XY"));
        Assert.assertEquals("13", wordEnds.wordEnds("XY123XY", "XY"));
        Assert.assertEquals("11", wordEnds.wordEnds("XY1XY", "XY"));
        Assert.assertEquals("XY", wordEnds.wordEnds("XYXY", "XY"));
        Assert.assertEquals("", wordEnds.wordEnds("XY", "XY"));
        Assert.assertEquals("", wordEnds.wordEnds("Hi", "XY"));
        Assert.assertEquals("", wordEnds.wordEnds("", "XY"));
        Assert.assertEquals("cxziij", wordEnds.wordEnds("abc1xyz1i1j", "1"));
        Assert.assertEquals("cxz", wordEnds.wordEnds("abc1xyz1", "1"));
        Assert.assertEquals("cxz11", wordEnds.wordEnds("abc1xyz11", "1"));
        Assert.assertEquals("11", wordEnds.wordEnds("abc1xyz1abc", "abc"));
        Assert.assertEquals("acac", wordEnds.wordEnds("abc1xyz1abc", "b"));
        Assert.assertEquals("1111", wordEnds.wordEnds("abc1abc1abc", "abc"));
    }

}
