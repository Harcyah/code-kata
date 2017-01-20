package com.harcyah.kata.codingbat.string2.doubleChar;

import org.junit.Assert;
import org.junit.Test;

public class DoubleCharTest {

    @Test
    public void testDoubleChar() {
        DoubleChar doubleChar = new DoubleChar();
        Assert.assertEquals("TThhee", doubleChar.doubleChar("The"));
        Assert.assertEquals("AAAAbbbb", doubleChar.doubleChar("AAbb"));
        Assert.assertEquals("HHii--TThheerree", doubleChar.doubleChar("Hi-There"));
        Assert.assertEquals("WWoorrdd!!", doubleChar.doubleChar("Word!"));
        Assert.assertEquals("!!!!", doubleChar.doubleChar("!!"));
        Assert.assertEquals("", doubleChar.doubleChar(""));
        Assert.assertEquals("aa", doubleChar.doubleChar("a"));
        Assert.assertEquals("..", doubleChar.doubleChar("."));
        Assert.assertEquals("aaaa", doubleChar.doubleChar("aa"));
    }

}
