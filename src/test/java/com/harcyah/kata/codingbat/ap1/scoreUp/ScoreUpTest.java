package com.harcyah.kata.codingbat.ap1.scoreUp;

import org.junit.Assert;
import org.junit.Test;

public class ScoreUpTest {

    @Test
    public void testScoreUp() {
        ScoreUp scoreUp = new ScoreUp();
        Assert.assertEquals(6, scoreUp.scoreUp(
                new String[]{"a", "a", "b", "b"},
                new String[]{"a", "c", "b", "c"}));
        Assert.assertEquals(11, scoreUp.scoreUp(
                new String[]{"a", "a", "b", "b"},
                new String[]{"a", "a", "b", "c"}));
        Assert.assertEquals(16, scoreUp.scoreUp(
                new String[]{"a", "a", "b", "b"},
                new String[]{"a", "a", "b", "b"}));
        Assert.assertEquals(3, scoreUp.scoreUp(
                new String[]{"a", "a", "b", "b"},
                new String[]{"?", "c", "b", "?"}));
        Assert.assertEquals(-1, scoreUp.scoreUp(
                new String[]{"a", "a", "b", "b"},
                new String[]{"?", "c", "?", "?"}));
        Assert.assertEquals(7, scoreUp.scoreUp(
                new String[]{"a", "a", "b", "b"},
                new String[]{"c", "?", "b", "b"}));
        Assert.assertEquals(3, scoreUp.scoreUp(
                new String[]{"a", "a", "b", "b"},
                new String[]{"c", "?", "b", "?"}));
        Assert.assertEquals(2, scoreUp.scoreUp(
                new String[]{"a", "b", "c"},
                new String[]{"a", "c", "b"}));
        Assert.assertEquals(4, scoreUp.scoreUp(
                new String[]{"a", "a", "b", "b", "c", "c"},
                new String[]{"a", "c", "a", "c", "a", "c"}));
        Assert.assertEquals(6, scoreUp.scoreUp(
                new String[]{"a", "a", "b", "b", "c", "c"},
                new String[]{"a", "c", "?", "?", "a", "c"}));
        Assert.assertEquals(11, scoreUp.scoreUp(
                new String[]{"a", "a", "b", "b", "c", "c"},
                new String[]{"a", "c", "?", "?", "c", "c"}));
        Assert.assertEquals(12, scoreUp.scoreUp(
                new String[]{"a", "b", "c"},
                new String[]{"a", "b", "c"}));
    }

}
