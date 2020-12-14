package com.harcyah.kata.codingbat.warmup1.max1020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Max1020Test {

    @Test
    public void testMax1020() {
        Max1020 max1020 = new Max1020();
        assertEquals(19, max1020.max1020(11, 19));
        assertEquals(19, max1020.max1020(19, 11));
        assertEquals(11, max1020.max1020(11, 9));
        assertEquals(0, max1020.max1020(9, 21));
        assertEquals(10, max1020.max1020(10, 21));
        assertEquals(10, max1020.max1020(21, 10));
        assertEquals(11, max1020.max1020(9, 11));
        assertEquals(10, max1020.max1020(23, 10));
        assertEquals(20, max1020.max1020(20, 10));
        assertEquals(20, max1020.max1020(7, 20));
        assertEquals(17, max1020.max1020(17, 16));
    }

}
