package com.harcyah.kata.codingbat.string1.withouEnd2;

import org.junit.Assert;
import org.junit.Test;

public class WithouEnd2Test {

    @Test
    public void testWithouEnd2() {
        WithouEnd2 withouEnd2 = new WithouEnd2();
        Assert.assertEquals("ell", withouEnd2.withouEnd2("Hello"));
        Assert.assertEquals("b", withouEnd2.withouEnd2("abc"));
        Assert.assertEquals("", withouEnd2.withouEnd2("ab"));
        Assert.assertEquals("", withouEnd2.withouEnd2("a"));
        Assert.assertEquals("", withouEnd2.withouEnd2(""));
        Assert.assertEquals("old", withouEnd2.withouEnd2("coldy"));
        Assert.assertEquals("ava cod", withouEnd2.withouEnd2("java code"));
    }

}
