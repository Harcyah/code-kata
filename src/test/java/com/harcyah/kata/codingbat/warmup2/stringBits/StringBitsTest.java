package com.harcyah.kata.codingbat.warmup2.stringBits;

import org.junit.Assert;
import org.junit.Test;

public class StringBitsTest {

    @Test
    public void testStringBits() {
        StringBits stringBits = new StringBits();
        Assert.assertEquals("Hlo", stringBits.stringBits("Hello"));
        Assert.assertEquals("H", stringBits.stringBits("Hi"));
        Assert.assertEquals("Hello", stringBits.stringBits("Heeololeo"));
        Assert.assertEquals("HHH", stringBits.stringBits("HiHiHi"));
        Assert.assertEquals("", stringBits.stringBits(""));
        Assert.assertEquals("Getns", stringBits.stringBits("Greetings"));
        Assert.assertEquals("Coot", stringBits.stringBits("Chocoate"));
        Assert.assertEquals("p", stringBits.stringBits("pi"));
        Assert.assertEquals("HloKte", stringBits.stringBits("Hello Kitten"));
        Assert.assertEquals("happy", stringBits.stringBits("hxaxpxpxy"));
    }

}
