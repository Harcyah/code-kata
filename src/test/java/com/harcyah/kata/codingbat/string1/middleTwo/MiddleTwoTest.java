package com.harcyah.kata.codingbat.string1.middleTwo;

import org.junit.Assert;
import org.junit.Test;

public class MiddleTwoTest {

    @Test
    public void testMiddleTwo() {
        MiddleTwo middleTwo = new MiddleTwo();
        Assert.assertEquals("ri", middleTwo.middleTwo("string"));
        Assert.assertEquals("od", middleTwo.middleTwo("code"));
        Assert.assertEquals("ct", middleTwo.middleTwo("Practice"));
        Assert.assertEquals("ab", middleTwo.middleTwo("ab"));
        Assert.assertEquals("45", middleTwo.middleTwo("0123456789"));
    }

}
