package com.harcyah.kata.codingbat.logic1.withoutDoubles;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WithoutDoublesTest {

    @Test
    public void testWithoutDoubles() {
        WithoutDoubles withoutDoubles = new WithoutDoubles();
        assertEquals(5, withoutDoubles.withoutDoubles(2, 3, true));
        assertEquals(7, withoutDoubles.withoutDoubles(3, 3, true));
        assertEquals(6, withoutDoubles.withoutDoubles(3, 3, false));
        assertEquals(5, withoutDoubles.withoutDoubles(2, 3, false));
        assertEquals(9, withoutDoubles.withoutDoubles(5, 4, true));
        assertEquals(9, withoutDoubles.withoutDoubles(5, 4, false));
        assertEquals(11, withoutDoubles.withoutDoubles(5, 5, true));
        assertEquals(10, withoutDoubles.withoutDoubles(5, 5, false));
        assertEquals(7, withoutDoubles.withoutDoubles(6, 6, true));
        assertEquals(12, withoutDoubles.withoutDoubles(6, 6, false));
        assertEquals(7, withoutDoubles.withoutDoubles(1, 6, true));
        assertEquals(7, withoutDoubles.withoutDoubles(6, 1, false));
    }

}
