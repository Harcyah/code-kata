package com.harcyah.kata.codingbat.string2.prefixAgain;

import org.junit.Assert;
import org.junit.Test;

public class PrefixAgainTest {

    @Test
    public void testPrefixAgain() {
        PrefixAgain prefixAgain = new PrefixAgain();
        Assert.assertEquals(true, prefixAgain.prefixAgain("abXYabc", 1));
        Assert.assertEquals(true, prefixAgain.prefixAgain("abXYabc", 2));
        Assert.assertEquals(false, prefixAgain.prefixAgain("abXYabc", 3));
        Assert.assertEquals(true, prefixAgain.prefixAgain("xyzxyxyxy", 2));
        Assert.assertEquals(false, prefixAgain.prefixAgain("xyzxyxyxy", 3));
        Assert.assertEquals(true, prefixAgain.prefixAgain("Hi12345Hi6789Hi10", 1));
        Assert.assertEquals(true, prefixAgain.prefixAgain("Hi12345Hi6789Hi10", 2));
        Assert.assertEquals(true, prefixAgain.prefixAgain("Hi12345Hi6789Hi10", 3));
        Assert.assertEquals(false, prefixAgain.prefixAgain("Hi12345Hi6789Hi10", 4));
        Assert.assertEquals(false, prefixAgain.prefixAgain("a", 1));
        Assert.assertEquals(true, prefixAgain.prefixAgain("aa", 1));
        Assert.assertEquals(false, prefixAgain.prefixAgain("ab", 1));
    }

}
