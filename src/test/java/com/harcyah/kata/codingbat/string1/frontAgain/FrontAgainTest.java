package com.harcyah.kata.codingbat.string1.frontAgain;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FrontAgainTest {

    @Test
    public void testFrontAgain() {
        FrontAgain frontAgain = new FrontAgain();
        assertTrue(frontAgain.frontAgain("edited"));
        assertFalse(frontAgain.frontAgain("edit"));
        assertTrue(frontAgain.frontAgain("ed"));
        assertTrue(frontAgain.frontAgain("jj"));
        assertTrue(frontAgain.frontAgain("jjj"));
        assertTrue(frontAgain.frontAgain("jjjj"));
        assertFalse(frontAgain.frontAgain("jjjk"));
        assertFalse(frontAgain.frontAgain("x"));
        assertFalse(frontAgain.frontAgain(""));
        assertFalse(frontAgain.frontAgain("java"));
        assertTrue(frontAgain.frontAgain("javaja"));
    }

}
