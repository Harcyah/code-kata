package com.harcyah.kata.codingbat.logic1.inOrder;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class InOrderTest {

    @Test
    public void testInOrder() {
        InOrder inOrder = new InOrder();
        assertTrue(inOrder.inOrder(1, 2, 4, false));
        assertFalse(inOrder.inOrder(1, 2, 1, false));
        assertTrue(inOrder.inOrder(1, 1, 2, true));
        assertFalse(inOrder.inOrder(3, 2, 4, false));
        assertTrue(inOrder.inOrder(2, 3, 4, false));
        assertTrue(inOrder.inOrder(3, 2, 4, true));
        assertFalse(inOrder.inOrder(4, 2, 2, true));
        assertFalse(inOrder.inOrder(4, 5, 2, true));
        assertTrue(inOrder.inOrder(2, 4, 6, true));
        assertTrue(inOrder.inOrder(7, 9, 10, false));
        assertTrue(inOrder.inOrder(7, 5, 6, true));
        assertFalse(inOrder.inOrder(7, 5, 4, true));
    }

}
