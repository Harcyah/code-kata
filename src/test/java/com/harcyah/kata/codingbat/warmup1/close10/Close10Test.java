package com.harcyah.kata.codingbat.warmup1.close10;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Close10Test {

    @Test
    public void testClose10() {
        Close10 close10 = new Close10();
        assertEquals(8, close10.close10(8, 13));
        assertEquals(8, close10.close10(13, 8));
        assertEquals(0, close10.close10(13, 7));
        assertEquals(0, close10.close10(7, 13));
        assertEquals(9, close10.close10(9, 13));
        assertEquals(8, close10.close10(13, 8));
        assertEquals(10, close10.close10(10, 12));
        assertEquals(10, close10.close10(11, 10));
        assertEquals(5, close10.close10(5, 21));
        assertEquals(0, close10.close10(0, 20));
        assertEquals(0, close10.close10(10, 10));
    }

}
