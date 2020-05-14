package com.harcyah.kata.projecteuler;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem013Test {

    @Test
    public void testProblem013() {
        Problem013 sut = new Problem013();
        assertEquals("5537376230", sut.getLargeSum());
    }

}
