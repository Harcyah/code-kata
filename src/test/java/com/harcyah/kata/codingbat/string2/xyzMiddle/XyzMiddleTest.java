package com.harcyah.kata.codingbat.string2.xyzMiddle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class XyzMiddleTest {

    @Test
    public void testXyzMiddle() {
        XyzMiddle xyzMiddle = new XyzMiddle();
        assertTrue(xyzMiddle.xyzMiddle("AAxyzBB"));
        assertTrue(xyzMiddle.xyzMiddle("AxyzBB"));
        assertFalse(xyzMiddle.xyzMiddle("AxyzBBB"));
        assertFalse(xyzMiddle.xyzMiddle("AxyzBBBB"));
        assertFalse(xyzMiddle.xyzMiddle("AAAxyzB"));
        assertTrue(xyzMiddle.xyzMiddle("AAAxyzBB"));
        assertFalse(xyzMiddle.xyzMiddle("AAAAxyzBB"));
        assertFalse(xyzMiddle.xyzMiddle("AAAAAxyzBBB"));
        assertTrue(xyzMiddle.xyzMiddle("1x345xyz12x4"));
        assertTrue(xyzMiddle.xyzMiddle("xyzAxyzBBB"));
        assertTrue(xyzMiddle.xyzMiddle("xyzAxyzBxyz"));
        assertTrue(xyzMiddle.xyzMiddle("xyzxyzAxyzBxyzxyz"));
        assertTrue(xyzMiddle.xyzMiddle("xyzxyzxyzBxyzxyz"));
        assertTrue(xyzMiddle.xyzMiddle("xyzxyzAxyzxyzxyz"));
        assertFalse(xyzMiddle.xyzMiddle("xyzxyzAxyzxyzxy"));
        assertFalse(xyzMiddle.xyzMiddle("AxyzxyzBB"));
        assertFalse(xyzMiddle.xyzMiddle(""));
        assertFalse(xyzMiddle.xyzMiddle("x"));
        assertFalse(xyzMiddle.xyzMiddle("xy"));
        assertTrue(xyzMiddle.xyzMiddle("xyz"));
        assertTrue(xyzMiddle.xyzMiddle("xyzz"));
    }

}
