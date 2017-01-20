package com.harcyah.kata.codingbat.string1.minCat;

import org.junit.Assert;
import org.junit.Test;

public class MinCatTest {

    @Test
    public void testMinCat() {
        MinCat minCat = new MinCat();
        Assert.assertEquals("loHi", minCat.minCat("Hello", "Hi"));
        Assert.assertEquals("ellojava", minCat.minCat("Hello", "java"));
        Assert.assertEquals("javaello", minCat.minCat("java", "Hello"));
        Assert.assertEquals("cx", minCat.minCat("abc", "x"));
        Assert.assertEquals("xc", minCat.minCat("x", "abc"));
        Assert.assertEquals("", minCat.minCat("abc", ""));
    }

}
