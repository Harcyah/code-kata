package com.harcyah.kata.codingbat.ap1.scores100;

import org.junit.Assert;
import org.junit.Test;

public class Scores100Test {

	@Test
	public void testScores100() {
		Scores100 scores100 = new Scores100();
		Assert.assertEquals(true, scores100.scores100(new int[] { 1, 100, 100 }));
		Assert.assertEquals(false, scores100.scores100(new int[] { 1, 100, 99, 100 }));
		Assert.assertEquals(true, scores100.scores100(new int[] { 100, 1, 100, 100 }));
		Assert.assertEquals(false, scores100.scores100(new int[] { 100, 1, 100, 1 }));
		Assert.assertEquals(false, scores100.scores100(new int[] { 1, 2, 3, 4, 5 }));
		Assert.assertEquals(false, scores100.scores100(new int[] { 1, 2, 100, 4, 5 }));
	}

}
