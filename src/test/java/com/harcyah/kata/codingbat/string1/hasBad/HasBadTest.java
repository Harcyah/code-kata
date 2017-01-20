package com.harcyah.kata.codingbat.string1.hasBad;

import org.junit.Assert;
import org.junit.Test;

public class HasBadTest {

    @Test
    public void testHasBad() {
        HasBad hasBad = new HasBad();
        Assert.assertEquals(true, hasBad.hasBad("badxx"));
        Assert.assertEquals(true, hasBad.hasBad("xbadxx"));
        Assert.assertEquals(false, hasBad.hasBad("xxbadxx"));
        Assert.assertEquals(false, hasBad.hasBad("code"));
        Assert.assertEquals(true, hasBad.hasBad("bad"));
        Assert.assertEquals(false, hasBad.hasBad("ba"));
        Assert.assertEquals(false, hasBad.hasBad("xba"));
        Assert.assertEquals(true, hasBad.hasBad("xbad"));
        Assert.assertEquals(false, hasBad.hasBad(""));
        Assert.assertEquals(true, hasBad.hasBad("badyy"));
    }

}
