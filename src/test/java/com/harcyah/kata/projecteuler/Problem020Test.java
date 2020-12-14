package com.harcyah.kata.projecteuler;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem020Test {

    @Test
    public void testProblem020() {
        Problem020 sut = new Problem020();
        assertEquals(27, sut.getFactorialDigitSum(10));
        assertEquals(648, sut.getFactorialDigitSum(100));
    }

}
