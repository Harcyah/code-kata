package com.harcyah.kata.codingbat.warmup1.mixStart;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
