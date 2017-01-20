package com.harcyah.kata.codingbat.warmup1.stringE;

import org.junit.Assert;
import org.junit.Test;

public class StringETest {

    @Test
    public void testStringE() {
        StringE stringE = new StringE();
        Assert.assertTrue(stringE.stringE("Hello"));
        Assert.assertTrue(stringE.stringE("Heelle"));
        Assert.assertFalse(stringE.stringE("Heelele"));
        Assert.assertFalse(stringE.stringE("Hll"));
        Assert.assertTrue(stringE.stringE("e"));
        Assert.assertFalse(stringE.stringE(""));
    }

}
