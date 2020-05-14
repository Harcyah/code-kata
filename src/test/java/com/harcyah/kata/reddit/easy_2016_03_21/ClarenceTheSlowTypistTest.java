package com.harcyah.kata.reddit.easy_2016_03_21;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClarenceTheSlowTypistTest {

    protected ClarenceTheSlowTypist typist = new ClarenceTheSlowTypist();

    @Test
    public void testSolve() {
        assertEquals(27.38, typist.solve("219.45.143.143"), 0.01);
    }

}
