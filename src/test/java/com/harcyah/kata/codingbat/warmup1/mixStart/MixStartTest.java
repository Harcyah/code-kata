package com.harcyah.kata.codingbat.warmup1.mixStart;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MixStartTest {

    @Test
    public void testMixStart() {
        MixStart mixStart = new MixStart();
        assertTrue(mixStart.mixStart("mix snacks"));
        assertTrue(mixStart.mixStart("pix snacks"));
        assertFalse(mixStart.mixStart("piz snacks"));
        assertTrue(mixStart.mixStart("nix"));
        assertFalse(mixStart.mixStart("ni"));
        assertFalse(mixStart.mixStart("n"));
        assertFalse(mixStart.mixStart(""));
    }

}
