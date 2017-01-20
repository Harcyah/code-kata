package com.harcyah.kata.codingbat.logic1.inOrder;

import org.junit.Assert;
import org.junit.Test;

public class InOrderTest {

    @Test
    public void testInOrder() {
        InOrder inOrder = new InOrder();
        Assert.assertEquals(true, inOrder.inOrder(1, 2, 4, false));
        Assert.assertEquals(false, inOrder.inOrder(1, 2, 1, false));
        Assert.assertEquals(true, inOrder.inOrder(1, 1, 2, true));
        Assert.assertEquals(false, inOrder.inOrder(3, 2, 4, false));
        Assert.assertEquals(true, inOrder.inOrder(2, 3, 4, false));
        Assert.assertEquals(true, inOrder.inOrder(3, 2, 4, true));
        Assert.assertEquals(false, inOrder.inOrder(4, 2, 2, true));
        Assert.assertEquals(false, inOrder.inOrder(4, 5, 2, true));
        Assert.assertEquals(true, inOrder.inOrder(2, 4, 6, true));
        Assert.assertEquals(true, inOrder.inOrder(7, 9, 10, false));
        Assert.assertEquals(true, inOrder.inOrder(7, 5, 6, true));
        Assert.assertEquals(false, inOrder.inOrder(7, 5, 4, true));
    }

}
