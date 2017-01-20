package com.harcyah.kata.codingbat.string2.xyBalance;

import org.junit.Assert;
import org.junit.Test;

public class XyBalanceTest {

    @Test
    public void testXyBalance() {
        XyBalance xyBalance = new XyBalance();
        Assert.assertEquals(true, xyBalance.xyBalance("aaxbby"));
        Assert.assertEquals(false, xyBalance.xyBalance("aaxbb"));
        Assert.assertEquals(false, xyBalance.xyBalance("yaaxbb"));
        Assert.assertEquals(true, xyBalance.xyBalance("yaaxbby"));
        Assert.assertEquals(true, xyBalance.xyBalance("xaxxbby"));
        Assert.assertEquals(false, xyBalance.xyBalance("xaxxbbyx"));
        Assert.assertEquals(true, xyBalance.xyBalance("xxbxy"));
        Assert.assertEquals(false, xyBalance.xyBalance("xxbx"));
        Assert.assertEquals(true, xyBalance.xyBalance("bbb"));
        Assert.assertEquals(false, xyBalance.xyBalance("bxbb"));
        Assert.assertEquals(true, xyBalance.xyBalance("bxyb"));
        Assert.assertEquals(true, xyBalance.xyBalance("xy"));
        Assert.assertEquals(true, xyBalance.xyBalance("y"));
        Assert.assertEquals(false, xyBalance.xyBalance("x"));
        Assert.assertEquals(true, xyBalance.xyBalance(""));
        Assert.assertEquals(false, xyBalance.xyBalance("yxyxyxyx"));
        Assert.assertEquals(true, xyBalance.xyBalance("yxyxyxyxy"));
        Assert.assertEquals(true, xyBalance.xyBalance("12xabxxydxyxyzz"));
    }

}
