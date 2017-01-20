package com.harcyah.kata.projecteuler;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class Problem_007Test {

    @Test
    public void testProblem_007() throws NumberFormatException, IOException {
        Problem_007 problem_007 = new Problem_007();
        Assert.assertEquals(13, problem_007.getNthPrime(6));
        Assert.assertEquals(104743, problem_007.getNthPrime(10001));
    }

}
