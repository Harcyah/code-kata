package com.harcyah.kata.projecteuler;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem010Test {

    @Test
    public void testProblem010() {
        Problem010 sut = new Problem010();
        assertEquals(17L, sut.getSummationOfPrimes(10));
        assertEquals(142913828922L, sut.getSummationOfPrimes(2000000));
    }

}
