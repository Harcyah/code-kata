package com.harcyah.kata.projecteuler;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem008Test {

    @Test
    public void testProblem008() {
        Problem008 sut = new Problem008();
        assertEquals(23514624000L, sut.getLargestProductInSeries());
    }

}
