package com.harcyah.kata.codingbat.logic2.evenlySpaced;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EvenlySpacedTest {

    @Test
    public void testEvenlySpaced() {
        EvenlySpaced evenlySpaced = new EvenlySpaced();
        assertTrue(evenlySpaced.evenlySpaced(2, 4, 6));
        assertTrue(evenlySpaced.evenlySpaced(4, 6, 2));
        assertFalse(evenlySpaced.evenlySpaced(4, 6, 3));
        assertTrue(evenlySpaced.evenlySpaced(6, 2, 4));
        assertFalse(evenlySpaced.evenlySpaced(6, 2, 8));
        assertTrue(evenlySpaced.evenlySpaced(2, 2, 2));
        assertFalse(evenlySpaced.evenlySpaced(2, 2, 3));
        assertTrue(evenlySpaced.evenlySpaced(9, 10, 11));
        assertTrue(evenlySpaced.evenlySpaced(10, 9, 11));
        assertFalse(evenlySpaced.evenlySpaced(10, 9, 9));
        assertFalse(evenlySpaced.evenlySpaced(2, 4, 4));
        assertFalse(evenlySpaced.evenlySpaced(2, 2, 4));
        assertFalse(evenlySpaced.evenlySpaced(3, 6, 12));
        assertFalse(evenlySpaced.evenlySpaced(12, 3, 6));
    }

}
