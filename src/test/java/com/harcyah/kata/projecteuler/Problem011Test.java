package com.harcyah.kata.projecteuler;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem011Test {

    @Test
    public void testProblem011() {
        Problem011 sut = new Problem011();
        assertEquals(70600674, sut.getLargestProductInGrid());
    }

}