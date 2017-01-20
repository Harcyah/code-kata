package com.harcyah.kata.projecteuler;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

public class Problem_024Test {

    @Test
    public void testProblem_024() {
        Problem_024 problem_024 = new Problem_024();
        Assert.assertEquals("2783915460", problem_024.getLexicographicPermutations(1000000));
    }

    @Test
    public void testToFactorialRepresentation() {
        Problem_024 problem_024 = new Problem_024();
        Assert.assertEquals("34101", factorialToString(problem_024.toFactorialRepresentation(463)));
        Assert.assertEquals("220", factorialToString(problem_024.toFactorialRepresentation(16)));
        Assert.assertEquals("266251220", factorialToString(problem_024.toFactorialRepresentation(1000000)));
    }

    protected String factorialToString(List<Integer> factorials) {
        String full = factorials.stream().map(x -> String.valueOf(x)).collect(Collectors.joining(""));
        return full.substring(0, full.length() - 1);
    }

}
