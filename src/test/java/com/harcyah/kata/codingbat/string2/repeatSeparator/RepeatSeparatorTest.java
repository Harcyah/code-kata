package com.harcyah.kata.codingbat.string2.repeatSeparator;

import org.junit.Assert;
import org.junit.Test;

public class RepeatSeparatorTest {

    @Test
    public void testRepeatSeparator() {
        RepeatSeparator repeatSeparator = new RepeatSeparator();
        Assert.assertEquals("WordXWordXWord", repeatSeparator.repeatSeparator("Word", "X", 3));
        Assert.assertEquals("ThisAndThis", repeatSeparator.repeatSeparator("This", "And", 2));
        Assert.assertEquals("This", repeatSeparator.repeatSeparator("This", "And", 1));
        Assert.assertEquals("Hi-n-Hi", repeatSeparator.repeatSeparator("Hi", "-n-", 2));
        Assert.assertEquals("AAA", repeatSeparator.repeatSeparator("AAA", "", 1));
        Assert.assertEquals("", repeatSeparator.repeatSeparator("AAA", "", 0));
        Assert.assertEquals("ABABABABA", repeatSeparator.repeatSeparator("A", "B", 5));
        Assert.assertEquals("abcXXabcXXabc", repeatSeparator.repeatSeparator("abc", "XX", 3));
        Assert.assertEquals("abcXXabc", repeatSeparator.repeatSeparator("abc", "XX", 2));
        Assert.assertEquals("abc", repeatSeparator.repeatSeparator("abc", "XX", 1));
        Assert.assertEquals("XYZaXYZ", repeatSeparator.repeatSeparator("XYZ", "a", 2));
    }

}
