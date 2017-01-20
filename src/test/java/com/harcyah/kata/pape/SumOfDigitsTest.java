package com.harcyah.kata.pape;

import org.junit.Assert;
import org.junit.Test;

public class SumOfDigitsTest {

    @Test
    public void test() {
        SumOfDigits sod = new SumOfDigits();
        Assert.assertEquals(6L, sod.sum(new char[]{'0', '1', '5'}));
        Assert.assertEquals(30L, sod.sum(new char[]{'1', '9', '8', '9', '3'}));
    }

}
