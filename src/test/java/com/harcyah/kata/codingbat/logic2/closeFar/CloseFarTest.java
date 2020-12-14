package com.harcyah.kata.codingbat.logic2.closeFar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CloseFarTest {

    @Test
    public void testCloseFar() {
        CloseFar closeFar = new CloseFar();
        assertTrue(closeFar.closeFar(1, 2, 10));
        assertFalse(closeFar.closeFar(1, 2, 3));
        assertTrue(closeFar.closeFar(4, 1, 3));
        assertFalse(closeFar.closeFar(4, 5, 3));
        assertFalse(closeFar.closeFar(4, 3, 5));
        assertTrue(closeFar.closeFar(-1, 10, 0));
        assertTrue(closeFar.closeFar(0, -1, 10));
        assertTrue(closeFar.closeFar(10, 10, 8));
        assertFalse(closeFar.closeFar(10, 8, 9));
        assertFalse(closeFar.closeFar(8, 9, 10));
        assertFalse(closeFar.closeFar(8, 9, 7));
        assertTrue(closeFar.closeFar(8, 6, 9));
    }

}
