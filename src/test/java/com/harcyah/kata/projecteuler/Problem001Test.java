package com.harcyah.kata.projecteuler;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem001Test {

    @Test
    public void testProblem001() {
        Problem001 sut = new Problem001();
        assertEquals(23, sut.sumMultipleThreeAndFive(10));
        assertEquals(233168, sut.sumMultipleThreeAndFive(1000));
    }

}
