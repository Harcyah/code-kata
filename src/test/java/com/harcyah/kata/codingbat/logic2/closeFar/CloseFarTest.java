package com.harcyah.kata.codingbat.logic2.closeFar;

import org.junit.Assert;
import org.junit.Test;

public class CloseFarTest {

    @Test
    public void testCloseFar() {
        CloseFar closeFar = new CloseFar();
        Assert.assertEquals(true, closeFar.closeFar(1, 2, 10));
        Assert.assertEquals(false, closeFar.closeFar(1, 2, 3));
        Assert.assertEquals(true, closeFar.closeFar(4, 1, 3));
        Assert.assertEquals(false, closeFar.closeFar(4, 5, 3));
        Assert.assertEquals(false, closeFar.closeFar(4, 3, 5));
        Assert.assertEquals(true, closeFar.closeFar(-1, 10, 0));
        Assert.assertEquals(true, closeFar.closeFar(0, -1, 10));
        Assert.assertEquals(true, closeFar.closeFar(10, 10, 8));
        Assert.assertEquals(false, closeFar.closeFar(10, 8, 9));
        Assert.assertEquals(false, closeFar.closeFar(8, 9, 10));
        Assert.assertEquals(false, closeFar.closeFar(8, 9, 7));
        Assert.assertEquals(true, closeFar.closeFar(8, 6, 9));
    }

}
