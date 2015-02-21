package com.harcyah.kata.codingbat.ap1.scoresClump;

import org.junit.Assert;
import org.junit.Test;

public class ScoresClumpTest {

	@Test
	public void testScoresClump() {
		ScoresClump scoresClump = new ScoresClump();
		Assert.assertEquals(true, scoresClump.scoresClump(new int[] { 3, 4, 5 }));
		Assert.assertEquals(false, scoresClump.scoresClump(new int[] { 3, 4, 6 }));
		Assert.assertEquals(true, scoresClump.scoresClump(new int[] { 1, 3, 5, 5 }));
		Assert.assertEquals(true, scoresClump.scoresClump(new int[] { 2, 4, 5, 6 }));
		Assert.assertEquals(false, scoresClump.scoresClump(new int[] { 2, 4, 5, 7 }));
		Assert.assertEquals(true, scoresClump.scoresClump(new int[] { 2, 4, 4, 7 }));
		Assert.assertEquals(false, scoresClump.scoresClump(new int[] { 3, 3, 6, 7, 9 }));
		Assert.assertEquals(true, scoresClump.scoresClump(new int[] { 3, 3, 7, 7, 9 }));
		Assert.assertEquals(false, scoresClump.scoresClump(new int[] { 4, 5, 8 }));
	}

}
