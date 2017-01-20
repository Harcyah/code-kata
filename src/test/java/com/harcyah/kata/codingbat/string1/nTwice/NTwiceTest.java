package com.harcyah.kata.codingbat.string1.nTwice;

import org.junit.Assert;
import org.junit.Test;

public class NTwiceTest {

    @Test
    public void testNTwice() {
        NTwice nTwice = new NTwice();
        Assert.assertEquals("Helo", nTwice.nTwice("Hello", 2));
        Assert.assertEquals("Choate", nTwice.nTwice("Chocolate", 3));
        Assert.assertEquals("Ce", nTwice.nTwice("Chocolate", 1));
        Assert.assertEquals("", nTwice.nTwice("Chocolate", 0));
        Assert.assertEquals("Hellello", nTwice.nTwice("Hello", 4));
        Assert.assertEquals("CodeCode", nTwice.nTwice("Code", 4));
        Assert.assertEquals("Code", nTwice.nTwice("Code", 2));
    }

}
