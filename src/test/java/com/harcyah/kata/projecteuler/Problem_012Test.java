package com.harcyah.kata.projecteuler;

import org.junit.Assert;
import org.junit.Test;

public class Problem_012Test {

    @Test
    public void testProblem_012() {
        Problem_012 problem_012 = new Problem_012();
        Assert.assertEquals(76576500L, problem_012.getHighlyDivisibleTriangularNumber());
    }

}
