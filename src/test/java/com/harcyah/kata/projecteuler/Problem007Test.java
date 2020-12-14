package com.harcyah.kata.projecteuler;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem007Test {

    @Test
    public void testProblem007() throws NumberFormatException, IOException {
        Problem007 sut = new Problem007();
        assertEquals(13, sut.getNthPrime(6));
        assertEquals(104743, sut.getNthPrime(10001));
    }

}
