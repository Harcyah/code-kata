package com.harcyah.kata.projecteuler;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem009Test {

    @Test
    public void testProblem009() {
        Problem009 sut = new Problem009();
        assertEquals(31875000, sut.getSpecialPythagoreanTriplet());
    }

}
