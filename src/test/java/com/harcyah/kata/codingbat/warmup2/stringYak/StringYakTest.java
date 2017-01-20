package com.harcyah.kata.codingbat.warmup2.stringYak;

import org.junit.Assert;
import org.junit.Test;

public class StringYakTest {

    @Test
    public void testStringYak() {
        StringYak stringYak = new StringYak();
        Assert.assertEquals("pak", stringYak.stringYak("yakpak"));
        Assert.assertEquals("pak", stringYak.stringYak("pakyak"));
        Assert.assertEquals("123ya", stringYak.stringYak("yak123ya"));
        Assert.assertEquals("", stringYak.stringYak("yak"));
        Assert.assertEquals("xxx", stringYak.stringYak("yakxxxyak"));
        Assert.assertEquals("HiHi", stringYak.stringYak("HiyakHi"));
        Assert.assertEquals("xxxyyzzz", stringYak.stringYak("xxxyakyyyakzzz"));
    }

}
