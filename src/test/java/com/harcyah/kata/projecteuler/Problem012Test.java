package com.harcyah.kata.projecteuler;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem012Test {

    @Test
    public void testProblem012() {
        Problem012 sut = new Problem012();
        assertEquals(76576500L, sut.getHighlyDivisibleTriangularNumber());
    }

}
