package com.harcyah.kata.codingbat.string1.comboString;

import org.junit.Assert;
import org.junit.Test;

public class ComboStringTest {

    @Test
    public void testComboString() {
        ComboString comboString = new ComboString();
        Assert.assertEquals("hiHellohi", comboString.comboString("Hello", "hi"));
        Assert.assertEquals("hiHellohi", comboString.comboString("hi", "Hello"));
        Assert.assertEquals("baaab", comboString.comboString("aaa", "b"));
        Assert.assertEquals("baaab", comboString.comboString("b", "aaa"));
        Assert.assertEquals("aaa", comboString.comboString("aaa", ""));
        Assert.assertEquals("bb", comboString.comboString("", "bb"));
        Assert.assertEquals("aaa1234aaa", comboString.comboString("aaa", "1234"));
        Assert.assertEquals("bbaaabb", comboString.comboString("aaa", "bb"));
        Assert.assertEquals("abba", comboString.comboString("a", "bb"));
        Assert.assertEquals("abba", comboString.comboString("bb", "a"));
        Assert.assertEquals("abxyzab", comboString.comboString("xyz", "ab"));
    }

}
