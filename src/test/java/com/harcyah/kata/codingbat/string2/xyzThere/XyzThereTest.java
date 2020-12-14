package com.harcyah.kata.codingbat.string2.xyzThere;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class XyzThereTest {

    @Test
    public void testXyzThere() {
        XyzThere xyzThere = new XyzThere();
        assertTrue(xyzThere.xyzThere("abcxyz"));
        assertFalse(xyzThere.xyzThere("abc.xyz"));
        assertTrue(xyzThere.xyzThere("xyz.abc"));
        assertFalse(xyzThere.xyzThere("abcxy"));
        assertTrue(xyzThere.xyzThere("xyz"));
        assertFalse(xyzThere.xyzThere("xy"));
        assertFalse(xyzThere.xyzThere("x"));
        assertFalse(xyzThere.xyzThere(""));
        assertTrue(xyzThere.xyzThere("abc.xyzxyz"));
        assertTrue(xyzThere.xyzThere("abc.xxyz"));
        assertFalse(xyzThere.xyzThere(".xyz"));
        assertFalse(xyzThere.xyzThere("12.xyz"));
        assertTrue(xyzThere.xyzThere("12xyz"));
        assertFalse(xyzThere.xyzThere("1.xyz.xyz2.xyz"));
    }

}
