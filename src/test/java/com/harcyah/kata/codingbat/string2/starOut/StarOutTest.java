package com.harcyah.kata.codingbat.string2.starOut;

import org.junit.Assert;
import org.junit.Test;

public class StarOutTest {

    @Test
    public void testStarOut() {
        StarOut starOut = new StarOut();
        Assert.assertEquals("ad", starOut.starOut("ab*cd"));
        Assert.assertEquals("ad", starOut.starOut("ab**cd"));
        Assert.assertEquals("silly", starOut.starOut("sm*eilly"));
        Assert.assertEquals("siy", starOut.starOut("sm*eil*ly"));
        Assert.assertEquals("siy", starOut.starOut("sm**eil*ly"));
        Assert.assertEquals("siy", starOut.starOut("sm***eil*ly"));
        Assert.assertEquals("string", starOut.starOut("stringy*"));
        Assert.assertEquals("tringy", starOut.starOut("*stringy"));
        Assert.assertEquals("ty", starOut.starOut("*str*in*gy"));
        Assert.assertEquals("abc", starOut.starOut("abc"));
        Assert.assertEquals("c", starOut.starOut("a*bc"));
        Assert.assertEquals("ab", starOut.starOut("ab"));
        Assert.assertEquals("", starOut.starOut("a*b"));
        Assert.assertEquals("a", starOut.starOut("a"));
        Assert.assertEquals("", starOut.starOut("a*"));
        Assert.assertEquals("", starOut.starOut("*a"));
        Assert.assertEquals("", starOut.starOut("*"));
        Assert.assertEquals("", starOut.starOut(""));
    }

}
