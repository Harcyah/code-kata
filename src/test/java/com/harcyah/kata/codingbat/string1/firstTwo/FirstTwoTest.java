package com.harcyah.kata.codingbat.string1.firstTwo;

import org.junit.Assert;
import org.junit.Test;

public class FirstTwoTest {

    @Test
    public void testFirstTwo() {
        FirstTwo firstTwo = new FirstTwo();
        Assert.assertEquals("He", firstTwo.firstTwo("Hello"));
        Assert.assertEquals("ab", firstTwo.firstTwo("abcdefg"));
        Assert.assertEquals("ab", firstTwo.firstTwo("ab"));
        Assert.assertEquals("a", firstTwo.firstTwo("a"));
        Assert.assertEquals("", firstTwo.firstTwo(""));
        Assert.assertEquals("Ki", firstTwo.firstTwo("Kitten"));
        Assert.assertEquals("hi", firstTwo.firstTwo("hi"));
        Assert.assertEquals("hi", firstTwo.firstTwo("hiya"));
    }

}
