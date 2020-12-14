package com.harcyah.kata.codingbat.warmup1.diff21;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Diff21Test {

    @Test
    public void testDiff21() {
        Diff21 diff21 = new Diff21();
        assertEquals(2, diff21.diff21(19));
        assertEquals(11, diff21.diff21(10));
        assertEquals(0, diff21.diff21(21));
        assertEquals(2, diff21.diff21(22));
        assertEquals(8, diff21.diff21(25));
        assertEquals(18, diff21.diff21(30));
        assertEquals(21, diff21.diff21(0));
        assertEquals(20, diff21.diff21(1));
        assertEquals(19, diff21.diff21(2));
        assertEquals(22, diff21.diff21(-1));
        assertEquals(23, diff21.diff21(-2));
        assertEquals(58, diff21.diff21(50));
    }

}
