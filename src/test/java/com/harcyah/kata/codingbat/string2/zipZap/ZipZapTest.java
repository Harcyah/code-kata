package com.harcyah.kata.codingbat.string2.zipZap;

import org.junit.Assert;
import org.junit.Test;

public class ZipZapTest {

    @Test
    public void testZipZap() {
        ZipZap zipZap = new ZipZap();
        Assert.assertEquals("zpXzp", zipZap.zipZap("zipXzap"));
        Assert.assertEquals("zpzp", zipZap.zipZap("zopzop"));
        Assert.assertEquals("zzzpzp", zipZap.zipZap("zzzopzop"));
        Assert.assertEquals("zibzp", zipZap.zipZap("zibzap"));
        Assert.assertEquals("zp", zipZap.zipZap("zip"));
        Assert.assertEquals("zi", zipZap.zipZap("zi"));
        Assert.assertEquals("z", zipZap.zipZap("z"));
        Assert.assertEquals("", zipZap.zipZap(""));
        Assert.assertEquals("zp", zipZap.zipZap("zzp"));
        Assert.assertEquals("abcppp", zipZap.zipZap("abcppp"));
        Assert.assertEquals("azbcppp", zipZap.zipZap("azbcppp"));
        Assert.assertEquals("azbcpzp", zipZap.zipZap("azbcpzpp"));
    }

}
