package com.harcyah.kata.codingbat.ap1.scoresIncreasing;

import org.junit.Assert;
import org.junit.Test;

public class ScoresIncreasingTest {

	@Test
	public void testScoresIncreasing() {
		ScoresIncreasing scoresIncreasing = new ScoresIncreasing();
		Assert.assertEquals(true, scoresIncreasing.scoresIncreasing(new int[] { 1, 3, 4 }));
		Assert.assertEquals(false, scoresIncreasing.scoresIncreasing(new int[] { 1, 3, 2 }));
		Assert.assertEquals(true, scoresIncreasing.scoresIncreasing(new int[] { 1, 1, 4 }));
		Assert.assertEquals(true, scoresIncreasing.scoresIncreasing(new int[] { 1, 1, 2, 4, 4, 7 }));
		Assert.assertEquals(false, scoresIncreasing.scoresIncreasing(new int[] { 1, 1, 2, 4, 3, 7 }));
		Assert.assertEquals(true, scoresIncreasing.scoresIncreasing(new int[] { -5, 4, 11 }));
	}

}
