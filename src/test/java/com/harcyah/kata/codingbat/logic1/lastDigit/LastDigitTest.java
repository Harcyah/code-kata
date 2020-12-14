package com.harcyah.kata.codingbat.logic1.lastDigit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LastDigitTest {

    @Test
    public void testLastDigit() {
        LastDigit lastDigit = new LastDigit();
        assertTrue(lastDigit.lastDigit(23, 19, 13));
        assertFalse(lastDigit.lastDigit(23, 19, 12));
        assertTrue(lastDigit.lastDigit(23, 19, 3));
        assertTrue(lastDigit.lastDigit(23, 19, 39));
        assertFalse(lastDigit.lastDigit(1, 2, 3));
        assertTrue(lastDigit.lastDigit(1, 1, 2));
        assertTrue(lastDigit.lastDigit(1, 2, 2));
        assertFalse(lastDigit.lastDigit(14, 25, 43));
        assertTrue(lastDigit.lastDigit(14, 25, 45));
        assertFalse(lastDigit.lastDigit(248, 106, 1002));
        assertTrue(lastDigit.lastDigit(248, 106, 1008));
        assertTrue(lastDigit.lastDigit(10, 11, 20));
        assertTrue(lastDigit.lastDigit(0, 11, 0));
    }

}
