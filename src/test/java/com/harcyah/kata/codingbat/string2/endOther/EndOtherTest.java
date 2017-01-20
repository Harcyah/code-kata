package com.harcyah.kata.codingbat.string2.endOther;

import org.junit.Assert;
import org.junit.Test;

public class EndOtherTest {

    @Test
    public void testEndOther() {
        EndOther endOther = new EndOther();
        Assert.assertEquals(true, endOther.endOther("Hiabc", "abc"));
        Assert.assertEquals(true, endOther.endOther("AbC", "HiaBc"));
        Assert.assertEquals(true, endOther.endOther("abc", "abXabc"));
        Assert.assertEquals(false, endOther.endOther("Hiabc", "abcd"));
        Assert.assertEquals(true, endOther.endOther("Hiabc", "bc"));
        Assert.assertEquals(false, endOther.endOther("Hiabcx", "bc"));
        Assert.assertEquals(true, endOther.endOther("abc", "abc"));
        Assert.assertEquals(true, endOther.endOther("xyz", "12xyz"));
        Assert.assertEquals(false, endOther.endOther("yz", "12xz"));
        Assert.assertEquals(true, endOther.endOther("Z", "12xz"));
        Assert.assertEquals(true, endOther.endOther("12", "12"));
        Assert.assertEquals(false, endOther.endOther("abcXYZ", "abcDEF"));
        Assert.assertEquals(false, endOther.endOther("ab", "ab12"));
        Assert.assertEquals(true, endOther.endOther("ab", "12ab"));
    }

}
