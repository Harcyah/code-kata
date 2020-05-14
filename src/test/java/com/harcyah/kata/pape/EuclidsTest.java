package com.harcyah.kata.pape;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EuclidsTest {

    @Test
    public void testEuclids() {
        Euclids euclids = new Euclids();
        assertEquals(1, euclids.getGCD(15, 16));
        assertEquals(12, euclids.getGCD(96, 36));
        assertEquals(2, euclids.getGCD(758, 306));
    }

}
