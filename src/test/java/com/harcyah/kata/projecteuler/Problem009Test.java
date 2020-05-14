package com.harcyah.kata.projecteuler;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem009Test {

    @Test
    public void testProblem009() {
        Problem009 sut = new Problem009();
        assertEquals(31875000, sut.getSpecialPythagoreanTriplet());
    }

}
