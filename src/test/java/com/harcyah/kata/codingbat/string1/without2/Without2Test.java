package com.harcyah.kata.codingbat.string1.without2;

import org.junit.Assert;
import org.junit.Test;

public class Without2Test {

    @Test
    public void testWithout2() {
        Without2 without2 = new Without2();
        Assert.assertEquals("lloHe", without2.without2("HelloHe"));
        Assert.assertEquals("HelloHi", without2.without2("HelloHi"));
        Assert.assertEquals("", without2.without2("Hi"));
        Assert.assertEquals("Chocolate", without2.without2("Chocolate"));
        Assert.assertEquals("x", without2.without2("xxx"));
        Assert.assertEquals("", without2.without2("xx"));
        Assert.assertEquals("x", without2.without2("x"));
        Assert.assertEquals("", without2.without2(""));
        Assert.assertEquals("Fruits", without2.without2("Fruits"));
    }

}
