package com.harcyah.kata.codingbat.logic2.makeChocolate;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MakeChocolateTest {

    @Test
    public void testMakeChocolate() {
        MakeChocolate makeChocolate = new MakeChocolate();
        assertEquals(4, makeChocolate.makeChocolate(4, 1, 9));
        assertEquals(-1, makeChocolate.makeChocolate(4, 1, 10));
        assertEquals(2, makeChocolate.makeChocolate(4, 1, 7));
        assertEquals(2, makeChocolate.makeChocolate(6, 2, 7));
        assertEquals(0, makeChocolate.makeChocolate(4, 1, 5));
        assertEquals(4, makeChocolate.makeChocolate(4, 1, 4));
        assertEquals(4, makeChocolate.makeChocolate(5, 4, 9));
        assertEquals(3, makeChocolate.makeChocolate(9, 3, 18));
        assertEquals(-1, makeChocolate.makeChocolate(3, 1, 9));
        assertEquals(-1, makeChocolate.makeChocolate(1, 2, 7));
        assertEquals(1, makeChocolate.makeChocolate(1, 2, 6));
        assertEquals(0, makeChocolate.makeChocolate(1, 2, 5));
        assertEquals(5, makeChocolate.makeChocolate(6, 1, 10));
        assertEquals(6, makeChocolate.makeChocolate(6, 1, 11));
        assertEquals(-1, makeChocolate.makeChocolate(6, 1, 12));
        assertEquals(-1, makeChocolate.makeChocolate(6, 1, 13));
        assertEquals(0, makeChocolate.makeChocolate(6, 2, 10));
        assertEquals(1, makeChocolate.makeChocolate(6, 2, 11));
        assertEquals(2, makeChocolate.makeChocolate(6, 2, 12));
        assertEquals(50, makeChocolate.makeChocolate(60, 100, 550));
        assertEquals(6, makeChocolate.makeChocolate(1000, 1000000, 5000006));
        assertEquals(7, makeChocolate.makeChocolate(7, 1, 12));
        assertEquals(-1, makeChocolate.makeChocolate(7, 1, 13));
        assertEquals(3, makeChocolate.makeChocolate(7, 2, 13));
    }

}
