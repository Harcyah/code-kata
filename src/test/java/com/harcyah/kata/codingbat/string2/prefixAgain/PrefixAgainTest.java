package com.harcyah.kata.codingbat.string2.prefixAgain;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PrefixAgainTest {

    @Test
    public void testPrefixAgain() {
        PrefixAgain prefixAgain = new PrefixAgain();
        assertTrue(prefixAgain.prefixAgain("abXYabc", 1));
        assertTrue(prefixAgain.prefixAgain("abXYabc", 2));
        assertFalse(prefixAgain.prefixAgain("abXYabc", 3));
        assertTrue(prefixAgain.prefixAgain("xyzxyxyxy", 2));
        assertFalse(prefixAgain.prefixAgain("xyzxyxyxy", 3));
        assertTrue(prefixAgain.prefixAgain("Hi12345Hi6789Hi10", 1));
        assertTrue(prefixAgain.prefixAgain("Hi12345Hi6789Hi10", 2));
        assertTrue(prefixAgain.prefixAgain("Hi12345Hi6789Hi10", 3));
        assertFalse(prefixAgain.prefixAgain("Hi12345Hi6789Hi10", 4));
        assertFalse(prefixAgain.prefixAgain("a", 1));
        assertTrue(prefixAgain.prefixAgain("aa", 1));
        assertFalse(prefixAgain.prefixAgain("ab", 1));
    }

}
