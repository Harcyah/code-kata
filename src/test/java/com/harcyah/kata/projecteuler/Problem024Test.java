package com.harcyah.kata.projecteuler;

import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class Problem024Test {

    @Test
    public void testProblem024() {
        Problem024 sut = new Problem024();
        assertEquals("2783915460", sut.getLexicographicPermutations(1000000));
    }

    @Test
    public void testToFactorialRepresentation() {
        Problem024 sut = new Problem024();
        assertEquals("34101", factorialToString(sut.toFactorialRepresentation(463)));
        assertEquals("220", factorialToString(sut.toFactorialRepresentation(16)));
        assertEquals("266251220", factorialToString(sut.toFactorialRepresentation(1000000)));
    }

    protected String factorialToString(List<Integer> factorials) {
        String full = factorials.stream().map(String::valueOf).collect(Collectors.joining(""));
        return full.substring(0, full.length() - 1);
    }

}
