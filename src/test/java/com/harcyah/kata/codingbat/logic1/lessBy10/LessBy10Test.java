package com.harcyah.kata.codingbat.logic1.lessBy10;

import org.junit.Assert;
import org.junit.Test;

public class LessBy10Test {

    @Test
    public void testLessBy10() {
        LessBy10 lessBy10 = new LessBy10();
        Assert.assertEquals(true, lessBy10.lessBy10(1, 7, 11));
        Assert.assertEquals(false, lessBy10.lessBy10(1, 7, 10));
        Assert.assertEquals(true, lessBy10.lessBy10(11, 1, 7));
        Assert.assertEquals(false, lessBy10.lessBy10(10, 7, 1));
        Assert.assertEquals(true, lessBy10.lessBy10(-10, 2, 2));
        Assert.assertEquals(false, lessBy10.lessBy10(2, 11, 11));
        Assert.assertEquals(true, lessBy10.lessBy10(3, 3, 30));
        Assert.assertEquals(false, lessBy10.lessBy10(3, 3, 3));
        Assert.assertEquals(true, lessBy10.lessBy10(10, 1, 11));
        Assert.assertEquals(true, lessBy10.lessBy10(10, 11, 1));
        Assert.assertEquals(false, lessBy10.lessBy10(10, 11, 2));
        Assert.assertEquals(true, lessBy10.lessBy10(3, 30, 3));
        Assert.assertEquals(true, lessBy10.lessBy10(2, 2, -8));
        Assert.assertEquals(true, lessBy10.lessBy10(2, 8, 12));
    }

}
