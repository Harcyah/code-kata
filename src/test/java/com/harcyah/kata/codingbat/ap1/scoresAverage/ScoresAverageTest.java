package com.harcyah.kata.codingbat.ap1.scoresAverage;

import org.junit.Assert;
import org.junit.Test;

public class ScoresAverageTest {

    @Test
    public void testScoresAverage() {
        ScoresAverage scoresAverage = new ScoresAverage();
        Assert.assertEquals(4, scoresAverage.scoresAverage(new int[]{2, 2, 4, 4}));
        Assert.assertEquals(4, scoresAverage.scoresAverage(new int[]{4, 4, 4, 2, 2, 2}));
        Assert.assertEquals(4, scoresAverage.scoresAverage(new int[]{3, 4, 5, 1, 2, 3}));
        Assert.assertEquals(6, scoresAverage.scoresAverage(new int[]{5, 6}));
        Assert.assertEquals(5, scoresAverage.scoresAverage(new int[]{5, 4}));
        Assert.assertEquals(5, scoresAverage.scoresAverage(new int[]{5, 4, 5, 6, 2, 1, 2, 3}));
    }

}
