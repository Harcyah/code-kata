package com.harcyah.kata.exercism.scrabble_score;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ScrabbleScoreTest {

	private String input;
	private int expectedOutput;

	@Parameterized.Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][]{
			{"", 0},
			{" \t\n", 0},
			{null, 0},
			{"a", 1},
			{"f", 4},
			{"street", 6},
			{"quirky", 22},
			{"oxyphenbutazone", 41},
			{"alacrity", 13},
		});
	}

	public ScrabbleScoreTest(String input, int expectedOutput) {
		this.input = input;
		this.expectedOutput = expectedOutput;
	}

	@Test
	public void test() {
		Scrabble scrabble = new Scrabble(input);

		assertEquals(expectedOutput, scrabble.getScore());
	}
}
