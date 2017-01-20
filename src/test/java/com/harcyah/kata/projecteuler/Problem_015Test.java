package com.harcyah.kata.projecteuler;

import org.junit.Assert;
import org.junit.Test;

public class Problem_015Test {

    @Test
    public void testCountLatticePaths() throws Exception {
        Problem_015 problem = new Problem_015();
        Assert.assertEquals(6L, problem.countLatticePaths(2));
        Assert.assertEquals(137846528820L, problem.countLatticePaths(20));
    }

}
