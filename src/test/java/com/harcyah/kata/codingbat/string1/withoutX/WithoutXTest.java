package com.harcyah.kata.codingbat.string1.withoutX;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WithoutXTest {

    @Test
    public void testWithoutX() {
        WithoutX withoutX = new WithoutX();
        assertEquals("Hi", withoutX.withoutX("xHix"));
        assertEquals("Hi", withoutX.withoutX("xHi"));
        assertEquals("Hxi", withoutX.withoutX("Hxix"));
        assertEquals("Hi", withoutX.withoutX("Hi"));
        assertEquals("xHi", withoutX.withoutX("xxHi"));
        assertEquals("Hi", withoutX.withoutX("Hix"));
        assertEquals("axb", withoutX.withoutX("xaxbx"));
        assertEquals("", withoutX.withoutX("xx"));
        assertEquals("", withoutX.withoutX("x"));
        assertEquals("", withoutX.withoutX(""));
        assertEquals("Hello", withoutX.withoutX("Hello"));
        assertEquals("Hexllo", withoutX.withoutX("Hexllo"));
    }

}
