package com.harcyah.kata.reddit.easy_2016_04_18;

import org.junit.Assert;
import org.junit.Test;

public class ShannonEntropyTest {

    protected ShannonEntropy shannonEntropy = new ShannonEntropy();

    @Test
    public void testCompute() throws Exception {
        Assert.assertEquals(1.84644, shannonEntropy.compute("1223334444"), 0.00001);
        Assert.assertEquals(3.18083, shannonEntropy.compute("Hello, world!"), 0.00001);
    }

}
