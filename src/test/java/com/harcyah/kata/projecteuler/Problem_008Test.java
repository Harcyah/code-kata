package com.harcyah.kata.projecteuler;

import org.junit.Assert;
import org.junit.Test;

public class Problem_008Test {

    @Test
    public void testProblem_008() {
        Problem_008 problem_008 = new Problem_008();
        Assert.assertEquals(23514624000L, problem_008.getLargestProductInSeries());
    }

}
