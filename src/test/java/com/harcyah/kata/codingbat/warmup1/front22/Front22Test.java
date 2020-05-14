package com.harcyah.kata.codingbat.warmup1.front22;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Front22Test {

    @Test
    public void testFront22() {
        Front22 front22 = new Front22();
        assertEquals("kikittenki", front22.front22("kitten"));
        assertEquals("HaHaHa", front22.front22("Ha"));
        assertEquals("ababcab", front22.front22("abc"));
        assertEquals("ababab", front22.front22("ab"));
        assertEquals("aaa", front22.front22("a"));
        assertEquals("", front22.front22(""));
        assertEquals("LoLogicLo", front22.front22("Logic"));
    }

}
