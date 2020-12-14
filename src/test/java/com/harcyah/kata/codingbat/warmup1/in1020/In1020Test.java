package com.harcyah.kata.codingbat.warmup1.in1020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class In1020Test {

    @Test
    public void testIn1020() {
        In1020 in1020 = new In1020();
        assertTrue(in1020.in1020(12, 99));
        assertTrue(in1020.in1020(21, 12));
        assertFalse(in1020.in1020(8, 99));
        assertTrue(in1020.in1020(99, 10));
        assertTrue(in1020.in1020(20, 20));
        assertFalse(in1020.in1020(21, 21));
        assertFalse(in1020.in1020(9, 9));
    }

}
