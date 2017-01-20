package com.harcyah.kata.codingbat.string1.nonStart;

import org.junit.Assert;
import org.junit.Test;

public class NonStartTest {

    @Test
    public void testNonStart() {
        NonStart nonStart = new NonStart();
        Assert.assertEquals("ellohere", nonStart.nonStart("Hello", "There"));
        Assert.assertEquals("avaode", nonStart.nonStart("java", "code"));
        Assert.assertEquals("hotlava", nonStart.nonStart("shotl", "java"));
        Assert.assertEquals("by", nonStart.nonStart("ab", "xy"));
        Assert.assertEquals("b", nonStart.nonStart("ab", "x"));
        Assert.assertEquals("c", nonStart.nonStart("x", "ac"));
        Assert.assertEquals("", nonStart.nonStart("a", "x"));
        Assert.assertEquals("itat", nonStart.nonStart("kit", "kat"));
        Assert.assertEquals("artart", nonStart.nonStart("mart", "dart"));
    }

}
