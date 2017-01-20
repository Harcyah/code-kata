package com.harcyah.kata.codingbat.string1.twoChar;

import org.junit.Assert;
import org.junit.Test;

public class TwoCharTest {

    @Test
    public void testTwoChar() {
        TwoChar twoChar = new TwoChar();
        Assert.assertEquals("ja", twoChar.twoChar("java", 0));
        Assert.assertEquals("va", twoChar.twoChar("java", 2));
        Assert.assertEquals("ja", twoChar.twoChar("java", 3));
        Assert.assertEquals("ja", twoChar.twoChar("java", 4));
        Assert.assertEquals("ja", twoChar.twoChar("java", -1));
        Assert.assertEquals("He", twoChar.twoChar("Hello", 0));
        Assert.assertEquals("el", twoChar.twoChar("Hello", 1));
        Assert.assertEquals("He", twoChar.twoChar("Hello", 99));
        Assert.assertEquals("lo", twoChar.twoChar("Hello", 3));
        Assert.assertEquals("He", twoChar.twoChar("Hello", 4));
        Assert.assertEquals("He", twoChar.twoChar("Hello", 5));
        Assert.assertEquals("He", twoChar.twoChar("Hello", -7));
        Assert.assertEquals("He", twoChar.twoChar("Hello", 6));
        Assert.assertEquals("He", twoChar.twoChar("Hello", -1));
        Assert.assertEquals("ya", twoChar.twoChar("yay", 0));
    }

}
