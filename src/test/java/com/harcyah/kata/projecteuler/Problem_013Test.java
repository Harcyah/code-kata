package com.harcyah.kata.projecteuler;

import org.junit.Assert;
import org.junit.Test;

public class Problem_013Test {

    @Test
    public void testProblem_013() {
        Problem_013 problem_013 = new Problem_013();
        Assert.assertEquals("5537376230", problem_013.getLargeSum());
    }

}
