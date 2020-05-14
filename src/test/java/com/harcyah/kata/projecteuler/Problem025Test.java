package com.harcyah.kata.projecteuler;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem025Test {

    @Test
    public void testProblem025() {
        Problem025 sut = new Problem025();
        assertEquals(12, sut.getFibonacciSequenceLength(3));
        assertEquals(4782, sut.getFibonacciSequenceLength(1000));
    }

}
