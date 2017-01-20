package com.harcyah.kata.reddit.easy_2016_03_21;

import org.junit.Assert;
import org.junit.Test;

public class ClarenceTheSlowTypistTest {

    protected ClarenceTheSlowTypist typist = new ClarenceTheSlowTypist();

    @Test
    public void testSolve() {
        Assert.assertEquals(27.38, typist.solve("219.45.143.143"), 0.01);
    }

}
