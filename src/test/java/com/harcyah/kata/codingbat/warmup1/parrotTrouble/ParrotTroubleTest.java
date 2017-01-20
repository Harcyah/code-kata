package com.harcyah.kata.codingbat.warmup1.parrotTrouble;

import org.junit.Assert;
import org.junit.Test;

public class ParrotTroubleTest {

    @Test
    public void testParrotTrouble() {
        ParrotTrouble parrotTrouble = new ParrotTrouble();
        Assert.assertTrue(parrotTrouble.parrotTrouble(true, 6));
        Assert.assertFalse(parrotTrouble.parrotTrouble(true, 7));
        Assert.assertFalse(parrotTrouble.parrotTrouble(false, 6));
        Assert.assertTrue(parrotTrouble.parrotTrouble(true, 21));
        Assert.assertFalse(parrotTrouble.parrotTrouble(false, 21));
        Assert.assertFalse(parrotTrouble.parrotTrouble(false, 20));
        Assert.assertTrue(parrotTrouble.parrotTrouble(true, 23));
        Assert.assertFalse(parrotTrouble.parrotTrouble(false, 23));
        Assert.assertFalse(parrotTrouble.parrotTrouble(true, 20));
        Assert.assertFalse(parrotTrouble.parrotTrouble(false, 12));
    }

}
