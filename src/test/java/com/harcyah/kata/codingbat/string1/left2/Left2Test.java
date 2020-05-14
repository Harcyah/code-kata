package com.harcyah.kata.codingbat.string1.left2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Left2Test {

    @Test
    public void testLeft2() {
        Left2 left2 = new Left2();
        assertEquals("lloHe", left2.left2("Hello"));
        assertEquals("vaja", left2.left2("java"));
        assertEquals("Hi", left2.left2("Hi"));
        assertEquals("deco", left2.left2("code"));
        assertEquals("tca", left2.left2("cat"));
        assertEquals("34512", left2.left2("12345"));
        assertEquals("ocolateCh", left2.left2("Chocolate"));
        assertEquals("icksbr", left2.left2("bricks"));
    }

}
