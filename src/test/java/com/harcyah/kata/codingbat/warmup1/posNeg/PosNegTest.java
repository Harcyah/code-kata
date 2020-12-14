package com.harcyah.kata.codingbat.warmup1.posNeg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PosNegTest {

    @Test
    public void testPosNeg() {
        PosNeg posNeg = new PosNeg();
        assertTrue(posNeg.posNeg(1, -1, false));
        assertTrue(posNeg.posNeg(-1, 1, false));
        assertTrue(posNeg.posNeg(-4, -5, true));
        assertFalse(posNeg.posNeg(-4, -5, false));
        assertTrue(posNeg.posNeg(-4, 5, false));
        assertFalse(posNeg.posNeg(-4, 5, true));
        assertFalse(posNeg.posNeg(1, 1, false));
        assertFalse(posNeg.posNeg(-1, -1, false));
        assertFalse(posNeg.posNeg(1, -1, true));
        assertFalse(posNeg.posNeg(-1, 1, true));
        assertFalse(posNeg.posNeg(1, 1, true));
        assertTrue(posNeg.posNeg(-1, -1, true));
        assertTrue(posNeg.posNeg(5, -5, false));
        assertTrue(posNeg.posNeg(-6, 6, false));
        assertFalse(posNeg.posNeg(-5, -6, false));
        assertFalse(posNeg.posNeg(-2, -1, false));
        assertFalse(posNeg.posNeg(1, 2, false));
        assertFalse(posNeg.posNeg(-5, 6, true));
        assertTrue(posNeg.posNeg(-5, -5, true));
    }

}
