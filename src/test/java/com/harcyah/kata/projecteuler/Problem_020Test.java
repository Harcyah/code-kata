package com.harcyah.kata.projecteuler;

import org.junit.Assert;
import org.junit.Test;

public class Problem_020Test {

    @Test
    public void testProblem_020() {
        Problem_020 problem_020 = new Problem_020();
        Assert.assertEquals(27, problem_020.getFactorialDigitSum(10));
        Assert.assertEquals(648, problem_020.getFactorialDigitSum(100));
    }

}
