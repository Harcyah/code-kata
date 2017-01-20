package com.harcyah.kata.codingbat.warmup1.delDel;

import org.junit.Assert;
import org.junit.Test;

public class DelDelTest {

    @Test
    public void testDelDel() {
        DelDel delDel = new DelDel();
        Assert.assertEquals("abc", delDel.delDel("adelbc"));
        Assert.assertEquals("aHello", delDel.delDel("adelHello"));
        Assert.assertEquals("adedbc", delDel.delDel("adedbc"));
        Assert.assertEquals("abcdel", delDel.delDel("abcdel"));
        Assert.assertEquals("add", delDel.delDel("add"));
        Assert.assertEquals("ad", delDel.delDel("ad"));
        Assert.assertEquals("a", delDel.delDel("a"));
        Assert.assertEquals("", delDel.delDel(""));
        Assert.assertEquals("del", delDel.delDel("del"));
        Assert.assertEquals("a", delDel.delDel("adel"));
        Assert.assertEquals("aadelbb", delDel.delDel("aadelbb"));
    }

}