package com.harcyah.kata.projecteuler;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem005Test {

    @Test
    public void testGetSmallestPositiveNumberEvenlyDivisible10() {
        Problem005 sut = new Problem005();
        assertEquals(2520, sut.getSmallestPositiveNumberEvenlyDivisibleUnder10());
    }

    @Test
    public void testGetSmallestPositiveNumberEvenlyDivisible20() {
        Problem005 problsutm = new Problem005();
        assertEquals(232792560, problsutm.getSmallestPositiveNumberEvenlyDivisibleUnder20());
    }

}
