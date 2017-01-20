package com.harcyah.kata.codingbat.warmup1.icyHot;

import org.junit.Assert;
import org.junit.Test;

public class IcyHotTest {

    @Test
    public void testIcyHot() {
        IcyHot icyHot = new IcyHot();
        Assert.assertTrue(icyHot.icyHot(120, -1));
        Assert.assertTrue(icyHot.icyHot(-1, 120));
        Assert.assertFalse(icyHot.icyHot(2, 120));
        Assert.assertFalse(icyHot.icyHot(-1, 100));
        Assert.assertFalse(icyHot.icyHot(-2, -2));
        Assert.assertFalse(icyHot.icyHot(120, 120));
    }

}