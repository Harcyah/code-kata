package com.harcyah.kata.projecteuler;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem002Test {

    @Test
    public void testProblem002() {
        Problem002 sut = new Problem002();
        assertEquals(4613732, sut.sumEvenFibonacci(4000000));
    }

}
