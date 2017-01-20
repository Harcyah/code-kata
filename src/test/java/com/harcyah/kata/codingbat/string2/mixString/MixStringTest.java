package com.harcyah.kata.codingbat.string2.mixString;

import org.junit.Assert;
import org.junit.Test;

public class MixStringTest {

    @Test
    public void testMixString() {
        MixString mixString = new MixString();
        Assert.assertEquals("axbycz", mixString.mixString("abc", "xyz"));
        Assert.assertEquals("HTihere", mixString.mixString("Hi", "There"));
        Assert.assertEquals("xTxhxexre", mixString.mixString("xxxx", "There"));
        Assert.assertEquals("xXxx", mixString.mixString("xxx", "X"));
        Assert.assertEquals("22/7 around", mixString.mixString("2/", "27 around"));
        Assert.assertEquals("Hello", mixString.mixString("", "Hello"));
        Assert.assertEquals("Abc", mixString.mixString("Abc", ""));
        Assert.assertEquals("", mixString.mixString("", ""));
        Assert.assertEquals("ab", mixString.mixString("a", "b"));
        Assert.assertEquals("abx", mixString.mixString("ax", "b"));
        Assert.assertEquals("abx", mixString.mixString("a", "bx"));
        Assert.assertEquals("SLoong", mixString.mixString("So", "Long"));
        Assert.assertEquals("LSoong", mixString.mixString("Long", "So"));
    }

}
