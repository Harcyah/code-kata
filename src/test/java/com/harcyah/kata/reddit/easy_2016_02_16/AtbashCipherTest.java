package com.harcyah.kata.reddit.easy_2016_02_16;

import org.junit.Assert;
import org.junit.Test;

public class AtbashCipherTest {

    protected AtbashCipher cipher = new AtbashCipher();

    @Test
    public void testCipher() {
        Assert.assertEquals("ullyzi", cipher.encode("foobar"));
        Assert.assertEquals("draziw", cipher.encode("wizard"));
        Assert.assertEquals("/i/wzrobkiltiznnvi", cipher.encode("/r/dailyprogrammer"));
        Assert.assertEquals("this is an example of the atbash cipher", cipher.encode("gsrh rh zm vcznkov lu gsv zgyzhs xrksvi"));
    }

}
