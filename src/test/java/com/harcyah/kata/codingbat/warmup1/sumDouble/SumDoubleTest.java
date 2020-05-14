package com.harcyah.kata.codingbat.warmup1.sumDouble;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumDoubleTest {

    @Test
    public void testSumDouble() {
        SumDouble sumDouble = new SumDouble();
        assertEquals(3, sumDouble.sumDouble(1, 2));
        assertEquals(5, sumDouble.sumDouble(3, 2));
        assertEquals(8, sumDouble.sumDouble(2, 2));
    }

}
