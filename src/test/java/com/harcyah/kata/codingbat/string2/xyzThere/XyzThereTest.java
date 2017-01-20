package com.harcyah.kata.codingbat.string2.xyzThere;

import org.junit.Assert;
import org.junit.Test;

public class XyzThereTest {

    @Test
    public void testXyzThere() {
        XyzThere xyzThere = new XyzThere();
        Assert.assertEquals(true, xyzThere.xyzThere("abcxyz"));
        Assert.assertEquals(false, xyzThere.xyzThere("abc.xyz"));
        Assert.assertEquals(true, xyzThere.xyzThere("xyz.abc"));
        Assert.assertEquals(false, xyzThere.xyzThere("abcxy"));
        Assert.assertEquals(true, xyzThere.xyzThere("xyz"));
        Assert.assertEquals(false, xyzThere.xyzThere("xy"));
        Assert.assertEquals(false, xyzThere.xyzThere("x"));
        Assert.assertEquals(false, xyzThere.xyzThere(""));
        Assert.assertEquals(true, xyzThere.xyzThere("abc.xyzxyz"));
        Assert.assertEquals(true, xyzThere.xyzThere("abc.xxyz"));
        Assert.assertEquals(false, xyzThere.xyzThere(".xyz"));
        Assert.assertEquals(false, xyzThere.xyzThere("12.xyz"));
        Assert.assertEquals(true, xyzThere.xyzThere("12xyz"));
        Assert.assertEquals(false, xyzThere.xyzThere("1.xyz.xyz2.xyz"));
    }

}
