package com.harcyah.kata.codingbat.logic1.inOrderEqual;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class InOrderEqualTest {

    @Test
    public void testInOrderEqual() {
        InOrderEqual inOrderEqual = new InOrderEqual();
        assertTrue(inOrderEqual.inOrderEqual(2, 5, 11, false));
        assertFalse(inOrderEqual.inOrderEqual(5, 7, 6, false));
        assertTrue(inOrderEqual.inOrderEqual(5, 5, 7, true));
        assertFalse(inOrderEqual.inOrderEqual(5, 5, 7, false));
        assertFalse(inOrderEqual.inOrderEqual(2, 5, 4, false));
        assertFalse(inOrderEqual.inOrderEqual(3, 4, 3, false));
        assertFalse(inOrderEqual.inOrderEqual(3, 4, 4, false));
        assertFalse(inOrderEqual.inOrderEqual(3, 4, 3, true));
        assertTrue(inOrderEqual.inOrderEqual(3, 4, 4, true));
        assertTrue(inOrderEqual.inOrderEqual(1, 5, 5, true));
        assertTrue(inOrderEqual.inOrderEqual(5, 5, 5, true));
        assertFalse(inOrderEqual.inOrderEqual(2, 2, 1, true));
        assertFalse(inOrderEqual.inOrderEqual(9, 2, 2, true));
        assertFalse(inOrderEqual.inOrderEqual(0, 1, 0, true));
    }

}
