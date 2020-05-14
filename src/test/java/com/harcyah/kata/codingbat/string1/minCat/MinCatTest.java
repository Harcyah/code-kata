package com.harcyah.kata.codingbat.string1.minCat;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinCatTest {

    @Test
    public void testMinCat() {
        MinCat minCat = new MinCat();
        assertEquals("loHi", minCat.minCat("Hello", "Hi"));
        assertEquals("ellojava", minCat.minCat("Hello", "java"));
        assertEquals("javaello", minCat.minCat("java", "Hello"));
        assertEquals("cx", minCat.minCat("abc", "x"));
        assertEquals("xc", minCat.minCat("x", "abc"));
        assertEquals("", minCat.minCat("abc", ""));
    }

}
