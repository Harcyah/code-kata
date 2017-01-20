package com.harcyah.kata.codingbat.ap1.hasOne;

import org.junit.Assert;
import org.junit.Test;

public class HasOneTest {

    @Test
    public void testHasOne() {
        HasOne hasOne = new HasOne();
        Assert.assertEquals(true, hasOne.hasOne(10));
        Assert.assertEquals(false, hasOne.hasOne(22));
        Assert.assertEquals(false, hasOne.hasOne(220));
        Assert.assertEquals(true, hasOne.hasOne(212));
        Assert.assertEquals(true, hasOne.hasOne(1));
        Assert.assertEquals(false, hasOne.hasOne(9));
        Assert.assertEquals(true, hasOne.hasOne(211112));
        Assert.assertEquals(true, hasOne.hasOne(121121));
        Assert.assertEquals(false, hasOne.hasOne(222222));
        Assert.assertEquals(true, hasOne.hasOne(56156));
        Assert.assertEquals(false, hasOne.hasOne(56556));
    }

}
