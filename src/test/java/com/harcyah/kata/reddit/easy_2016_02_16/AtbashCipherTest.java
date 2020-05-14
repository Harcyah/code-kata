package com.harcyah.kata.reddit.easy_2016_02_16;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AtbashCipherTest {

    protected AtbashCipher cipher = new AtbashCipher();

    @Test
    public void testCipher() {
        assertEquals("ullyzi", cipher.encode("foobar"));
        assertEquals("draziw", cipher.encode("wizard"));
        assertEquals("/i/wzrobkiltiznnvi", cipher.encode("/r/dailyprogrammer"));
        assertEquals("this is an example of the atbash cipher", cipher.encode("gsrh rh zm vcznkov lu gsv zgyzhs xrksvi"));
    }

}
