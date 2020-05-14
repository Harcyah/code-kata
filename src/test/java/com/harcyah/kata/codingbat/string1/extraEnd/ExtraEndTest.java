package com.harcyah.kata.codingbat.string1.extraEnd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExtraEndTest {

    @Test
    public void testExtraEnd() {
        ExtraEnd extraEnd = new ExtraEnd();
        assertEquals("lololo", extraEnd.extraEnd("Hello"));
        assertEquals("ababab", extraEnd.extraEnd("ab"));
        assertEquals("HiHiHi", extraEnd.extraEnd("Hi"));
        assertEquals("dydydy", extraEnd.extraEnd("Candy"));
        assertEquals("dedede", extraEnd.extraEnd("Code"));
    }

}
