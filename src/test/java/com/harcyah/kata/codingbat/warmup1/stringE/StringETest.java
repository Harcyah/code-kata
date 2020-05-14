package com.harcyah.kata.codingbat.warmup1.stringE;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StringETest {

    @Test
    public void testStringE() {
        StringE stringE = new StringE();
        assertTrue(stringE.stringE("Hello"));
        assertTrue(stringE.stringE("Heelle"));
        assertFalse(stringE.stringE("Heelele"));
        assertFalse(stringE.stringE("Hll"));
        assertTrue(stringE.stringE("e"));
        assertFalse(stringE.stringE(""));
    }

}
