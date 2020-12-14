package com.harcyah.kata.codingbat.string1.without2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Without2Test {

    @Test
    public void testWithout2() {
        Without2 without2 = new Without2();
        assertEquals("lloHe", without2.without2("HelloHe"));
        assertEquals("HelloHi", without2.without2("HelloHi"));
        assertEquals("", without2.without2("Hi"));
        assertEquals("Chocolate", without2.without2("Chocolate"));
        assertEquals("x", without2.without2("xxx"));
        assertEquals("", without2.without2("xx"));
        assertEquals("x", without2.without2("x"));
        assertEquals("", without2.without2(""));
        assertEquals("Fruits", without2.without2("Fruits"));
    }

}
