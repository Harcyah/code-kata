package com.harcyah.kata.codingbat.warmup1.icyHot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IcyHotTest {

    @Test
    public void testIcyHot() {
        IcyHot icyHot = new IcyHot();
        assertTrue(icyHot.icyHot(120, -1));
        assertTrue(icyHot.icyHot(-1, 120));
        assertFalse(icyHot.icyHot(2, 120));
        assertFalse(icyHot.icyHot(-1, 100));
        assertFalse(icyHot.icyHot(-2, -2));
        assertFalse(icyHot.icyHot(120, 120));
    }

}
