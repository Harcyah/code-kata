package com.harcyah.kata.codingbat.warmup1.or35;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Or35Test {

    @Test
    public void testOr35() {
        Or35 or35 = new Or35();
        assertTrue(or35.or35(3));
        assertTrue(or35.or35(10));
        assertFalse(or35.or35(8));
        assertTrue(or35.or35(15));
        assertTrue(or35.or35(5));
        assertTrue(or35.or35(9));
        assertFalse(or35.or35(4));
        assertFalse(or35.or35(7));
        assertTrue(or35.or35(6));
        assertFalse(or35.or35(17));
        assertTrue(or35.or35(18));
        assertFalse(or35.or35(29));
        assertTrue(or35.or35(20));
        assertTrue(or35.or35(21));
        assertFalse(or35.or35(22));
        assertTrue(or35.or35(45));
        assertTrue(or35.or35(99));
        assertTrue(or35.or35(100));
        assertFalse(or35.or35(101));
        assertFalse(or35.or35(121));
        assertFalse(or35.or35(122));
        assertTrue(or35.or35(123));
    }

}
