package com.harcyah.kata.codingbat.warmup2.stringMatch;

import org.junit.Assert;
import org.junit.Test;

public class StringMatchTest {

    @Test
    public void testStringMatch() {
        StringMatch stringMatch = new StringMatch();
        Assert.assertEquals(3, stringMatch.stringMatch("xxcaazz", "xxbaaz"));
        Assert.assertEquals(2, stringMatch.stringMatch("abc", "abc"));
        Assert.assertEquals(0, stringMatch.stringMatch("abc", "axc"));
        Assert.assertEquals(1, stringMatch.stringMatch("hello", "he"));
        Assert.assertEquals(1, stringMatch.stringMatch("he", "hello"));
        Assert.assertEquals(0, stringMatch.stringMatch("h", "hello"));
        Assert.assertEquals(0, stringMatch.stringMatch("", "hello"));
        Assert.assertEquals(1, stringMatch.stringMatch("aabbccdd", "abbbxxd"));
        Assert.assertEquals(3, stringMatch.stringMatch("aaxxaaxx", "iaxxai"));
        Assert.assertEquals(3, stringMatch.stringMatch("iaxxai", "aaxxaaxx"));
    }

}
