package com.harcyah.kata.codingbat.string1.startWord;

import org.junit.Assert;
import org.junit.Test;

public class StartWordTest {

    @Test
    public void testStartWord() {
        StartWord startWord = new StartWord();
        Assert.assertEquals("hi", startWord.startWord("hippo", "hi"));
        Assert.assertEquals("hip", startWord.startWord("hippo", "xip"));
        Assert.assertEquals("h", startWord.startWord("hippo", "i"));
        Assert.assertEquals("", startWord.startWord("hippo", "ix"));
        Assert.assertEquals("", startWord.startWord("h", "ix"));
        Assert.assertEquals("", startWord.startWord("", "i"));
        Assert.assertEquals("hi", startWord.startWord("hip", "zi"));
        Assert.assertEquals("hip", startWord.startWord("hip", "zip"));
        Assert.assertEquals("", startWord.startWord("hip", "zig"));
        Assert.assertEquals("h", startWord.startWord("h", "z"));
        Assert.assertEquals("hippo", startWord.startWord("hippo", "xippo"));
        Assert.assertEquals("", startWord.startWord("hippo", "xyz"));
        Assert.assertEquals("hip", startWord.startWord("hippo", "hip"));
        Assert.assertEquals("kit", startWord.startWord("kitten", "cit"));
        Assert.assertEquals("kit", startWord.startWord("kit", "cit"));
    }

}
