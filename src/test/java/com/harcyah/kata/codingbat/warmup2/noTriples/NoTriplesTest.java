package com.harcyah.kata.codingbat.warmup2.noTriples;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NoTriplesTest {

    @Test
    public void testNoTriples() {
        NoTriples noTriples = new NoTriples();
        assertTrue(noTriples.noTriples(new int[]{1, 1, 2, 2, 1}));
        assertFalse(noTriples.noTriples(new int[]{1, 1, 2, 2, 2, 1}));
        assertFalse(noTriples.noTriples(new int[]{1, 1, 1, 2, 2, 2, 1}));
        assertTrue(noTriples.noTriples(new int[]{1, 1, 2, 2, 1, 2, 1}));
        assertTrue(noTriples.noTriples(new int[]{1, 2, 1}));
        assertFalse(noTriples.noTriples(new int[]{1, 1, 1}));
        assertTrue(noTriples.noTriples(new int[]{1, 1}));
        assertTrue(noTriples.noTriples(new int[]{1}));
        assertTrue(noTriples.noTriples(new int[]{}));
    }

}
