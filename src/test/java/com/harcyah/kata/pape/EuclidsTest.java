package com.harcyah.kata.pape;

import org.junit.Assert;
import org.junit.Test;

public class EuclidsTest {

    @Test
    public void testEuclids() throws Exception {
        Euclids euclids = new Euclids();
        Assert.assertEquals(1, euclids.getGCD(15, 16));
        Assert.assertEquals(12, euclids.getGCD(96, 36));
        Assert.assertEquals(2, euclids.getGCD(758, 306));
    }

}
