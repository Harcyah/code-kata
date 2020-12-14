package com.harcyah.kata.codingbat.string2.sameStarChar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SameStarCharTest {

    @Test
    public void testSameStarChar() {
        SameStarChar sameStarChar = new SameStarChar();
        assertTrue(sameStarChar.sameStarChar("xy*yzz"));
        assertFalse(sameStarChar.sameStarChar("xy*zzz"));
        assertTrue(sameStarChar.sameStarChar("*xa*az"));
        assertFalse(sameStarChar.sameStarChar("*xa*bz"));
        assertTrue(sameStarChar.sameStarChar("*xa*a*"));
        assertTrue(sameStarChar.sameStarChar(""));
        assertTrue(sameStarChar.sameStarChar("*xa*a*a"));
        assertFalse(sameStarChar.sameStarChar("*xa*a*b"));
        assertTrue(sameStarChar.sameStarChar("*12*2*2"));
        assertFalse(sameStarChar.sameStarChar("12*2*3*"));
        assertTrue(sameStarChar.sameStarChar("abcDEF"));
        assertFalse(sameStarChar.sameStarChar("XY*YYYY*Z*"));
        assertTrue(sameStarChar.sameStarChar("XY*YYYY*Y*"));
        assertFalse(sameStarChar.sameStarChar("12*2*3*"));
        assertTrue(sameStarChar.sameStarChar("*"));
        assertTrue(sameStarChar.sameStarChar("**"));
    }

}
