package com.harcyah.kata.codingbat.logic1.squirrelPlay;

import org.junit.Assert;
import org.junit.Test;

public class SquirrelPlayTest {

    @Test
    public void testSquirrelPlay() {
        SquirrelPlay squirrelPlay = new SquirrelPlay();
        Assert.assertEquals(true, squirrelPlay.squirrelPlay(70, false));
        Assert.assertEquals(false, squirrelPlay.squirrelPlay(95, false));
        Assert.assertEquals(true, squirrelPlay.squirrelPlay(95, true));
        Assert.assertEquals(true, squirrelPlay.squirrelPlay(90, false));
        Assert.assertEquals(true, squirrelPlay.squirrelPlay(90, true));
        Assert.assertEquals(false, squirrelPlay.squirrelPlay(50, false));
        Assert.assertEquals(false, squirrelPlay.squirrelPlay(50, true));
        Assert.assertEquals(false, squirrelPlay.squirrelPlay(100, false));
        Assert.assertEquals(true, squirrelPlay.squirrelPlay(100, true));
        Assert.assertEquals(false, squirrelPlay.squirrelPlay(105, true));
        Assert.assertEquals(false, squirrelPlay.squirrelPlay(59, false));
        Assert.assertEquals(false, squirrelPlay.squirrelPlay(59, true));
        Assert.assertEquals(true, squirrelPlay.squirrelPlay(60, false));
    }

}
