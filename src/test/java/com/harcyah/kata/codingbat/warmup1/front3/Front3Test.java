package com.harcyah.kata.codingbat.warmup1.front3;

import org.junit.Assert;
import org.junit.Test;

public class Front3Test {

    @Test
    public void testFront3() {
        Front3 front3 = new Front3();
        Assert.assertEquals("JavJavJav", front3.front3("Java"));
        Assert.assertEquals("ChoChoCho", front3.front3("Chocolate"));
        Assert.assertEquals("abcabcabc", front3.front3("abc"));
        Assert.assertEquals("abcabcabc", front3.front3("abcXYZ"));
        Assert.assertEquals("ababab", front3.front3("ab"));
        Assert.assertEquals("aaa", front3.front3("a"));
        Assert.assertEquals("", front3.front3(""));
    }

}