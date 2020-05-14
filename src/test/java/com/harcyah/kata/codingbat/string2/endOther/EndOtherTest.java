package com.harcyah.kata.codingbat.string2.endOther;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EndOtherTest {

    @Test
    public void testEndOther() {
        EndOther endOther = new EndOther();
        assertTrue(endOther.endOther("Hiabc", "abc"));
        assertTrue(endOther.endOther("AbC", "HiaBc"));
        assertTrue(endOther.endOther("abc", "abXabc"));
        assertFalse(endOther.endOther("Hiabc", "abcd"));
        assertTrue(endOther.endOther("Hiabc", "bc"));
        assertFalse(endOther.endOther("Hiabcx", "bc"));
        assertTrue(endOther.endOther("abc", "abc"));
        assertTrue(endOther.endOther("xyz", "12xyz"));
        assertFalse(endOther.endOther("yz", "12xz"));
        assertTrue(endOther.endOther("Z", "12xz"));
        assertTrue(endOther.endOther("12", "12"));
        assertFalse(endOther.endOther("abcXYZ", "abcDEF"));
        assertFalse(endOther.endOther("ab", "ab12"));
        assertTrue(endOther.endOther("ab", "12ab"));
    }

}
