package com.harcyah.kata.codingbat.warmup2.last2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Last2Test {

    @Test
    public void testLast2() {
        Last2 last2 = new Last2();
        assertEquals(1, last2.last2("hixxhi"));
        assertEquals(1, last2.last2("xaxxaxaxx"));
        assertEquals(2, last2.last2("axxxaaxx"));
        assertEquals(3, last2.last2("xxaxxaxxaxx"));
        assertEquals(0, last2.last2("xaxaxaxx"));
        assertEquals(2, last2.last2("xxxx"));
        assertEquals(1, last2.last2("13121312"));
        assertEquals(1, last2.last2("11212"));
        assertEquals(0, last2.last2("13121311"));
        assertEquals(2, last2.last2("1717171"));
        assertEquals(0, last2.last2("hi"));
        assertEquals(0, last2.last2("h"));
        assertEquals(0, last2.last2(""));
    }

}
