package com.harcyah.kata.projecteuler;

import org.junit.Assert;
import org.junit.Test;

public class Problem_002Test {

    @Test
    public void testProblem_002() {
        Problem_002 problem_002 = new Problem_002();
        Assert.assertEquals(4613732, problem_002.sumEvenFibonacci(4000000));
    }

}
