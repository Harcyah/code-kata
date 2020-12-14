package com.harcyah.kata.codingbat.warmup1.lastDigit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LastDigitTest {

    @Test
    public void testLastDigit() {
        LastDigit lastDigit = new LastDigit();
        assertTrue(lastDigit.lastDigit(7, 17));
        assertFalse(lastDigit.lastDigit(6, 17));
        assertTrue(lastDigit.lastDigit(3, 113));
        assertFalse(lastDigit.lastDigit(114, 113));
        assertTrue(lastDigit.lastDigit(114, 4));
        assertTrue(lastDigit.lastDigit(10, 0));
        assertFalse(lastDigit.lastDigit(11, 0));
    }

}
