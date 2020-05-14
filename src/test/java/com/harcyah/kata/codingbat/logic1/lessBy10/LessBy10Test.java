package com.harcyah.kata.codingbat.logic1.lessBy10;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LessBy10Test {

    @Test
    public void testLessBy10() {
        LessBy10 lessBy10 = new LessBy10();
        assertTrue(lessBy10.lessBy10(1, 7, 11));
        assertFalse(lessBy10.lessBy10(1, 7, 10));
        assertTrue(lessBy10.lessBy10(11, 1, 7));
        assertFalse(lessBy10.lessBy10(10, 7, 1));
        assertTrue(lessBy10.lessBy10(-10, 2, 2));
        assertFalse(lessBy10.lessBy10(2, 11, 11));
        assertTrue(lessBy10.lessBy10(3, 3, 30));
        assertFalse(lessBy10.lessBy10(3, 3, 3));
        assertTrue(lessBy10.lessBy10(10, 1, 11));
        assertTrue(lessBy10.lessBy10(10, 11, 1));
        assertFalse(lessBy10.lessBy10(10, 11, 2));
        assertTrue(lessBy10.lessBy10(3, 30, 3));
        assertTrue(lessBy10.lessBy10(2, 2, -8));
        assertTrue(lessBy10.lessBy10(2, 8, 12));
    }

}
