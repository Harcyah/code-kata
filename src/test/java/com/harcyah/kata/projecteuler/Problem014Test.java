package com.harcyah.kata.projecteuler;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem014Test {

    @Test
    public void testProblem014() {
        Problem014 sut = new Problem014();
        assertEquals(837799, sut.getLongestCollatzSequence());
    }

}
