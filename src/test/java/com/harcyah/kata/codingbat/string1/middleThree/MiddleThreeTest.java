package com.harcyah.kata.codingbat.string1.middleThree;

import org.junit.Assert;
import org.junit.Test;

public class MiddleThreeTest {

    @Test
    public void testMiddleThree() {
        MiddleThree middleThree = new MiddleThree();
        Assert.assertEquals("and", middleThree.middleThree("Candy"));
        Assert.assertEquals("and", middleThree.middleThree("and"));
        Assert.assertEquals("lvi", middleThree.middleThree("solving"));
        Assert.assertEquals("yet", middleThree.middleThree("Hi yet Hi"));
        Assert.assertEquals("yet", middleThree.middleThree("java yet java"));
        Assert.assertEquals("col", middleThree.middleThree("Chocolate"));
        Assert.assertEquals("xyz", middleThree.middleThree("XabcxyzabcX"));
    }

}
