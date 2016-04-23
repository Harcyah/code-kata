package com.harcyah.kata.reddit.medium_2016_04_06;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.BeforeClass;
import org.junit.Test;

import com.google.common.io.Resources;

public class MagicSquareRearrangerTest {

	protected MagicSquareRearranger rearranger = new MagicSquareRearranger();

	protected static Integer[][] square8x8_0;
	protected static Integer[][] square8x8_1;
	protected static Integer[][] square8x8_2;
	protected static Integer[][] square12x12_0;
	protected static Integer[][] square12x12_1;

	@BeforeClass
	public static void setUp() throws IOException {
		square8x8_0 = readSquareFromResource("./8x8_0");
		square8x8_1 = readSquareFromResource("./8x8_1");
		square8x8_2 = readSquareFromResource("./8x8_2");
		square12x12_0 = readSquareFromResource("./12x12_0");
		square12x12_1 = readSquareFromResource("./12x12_1");
	}

	@Test
	public void testGetSolutions() throws Exception {
		Integer[][] square = { { 8, 1, 6 }, { 4, 9, 2 }, { 3, 5, 7 } };
		List<Integer[]> solutions = rearranger.getSolutions(square);
		Assertions.assertThat(solutions).hasSize(2);
		Assertions.assertThat(solutions.get(0)).isEqualTo(new Integer[] { 0, 2, 1 });
		Assertions.assertThat(solutions.get(1)).isEqualTo(new Integer[] { 1, 2, 0 });
	}

	private static Integer[][] readSquareFromResource(String resourceName) throws IOException {
		URL resource = MagicSquareRearranger.class.getResource(resourceName);
		List<String> lines = Resources.readLines(resource, StandardCharsets.UTF_8);
		Integer[][] square = new Integer[lines.size()][];
		for (int j = 0; j < lines.size(); j++) {
			String[] tokens = lines.get(j).split(" ");
			square[j] = new Integer[tokens.length];
			for (int i = 0; i < tokens.length; i++) {
				square[j][i] = Integer.parseInt(tokens[i]);
			}
		}
		return square;
	}

	// Runs in 0.026s
	@Test
	public void testGetSolutionsForSample8x8_0() throws IOException {
		List<Integer[]> solutions = rearranger.getSolutions(square8x8_0);
		Assertions.assertThat(solutions).hasSize(2);
	}

	// Runs in 0.026s
	@Test
	public void testGetSolutionsForSample8x8_1() throws IOException {
		List<Integer[]> solutions = rearranger.getSolutions(square8x8_1);
		Assertions.assertThat(solutions).hasSize(2);
	}

	// Runs in 0.026s
	@Test
	public void testGetSolutionsForSample8x8_2() throws IOException {
		List<Integer[]> solutions = rearranger.getSolutions(square8x8_2);
		Assertions.assertThat(solutions).hasSize(2);
	}

	// Runs in 141s
	@Test
	public void testGetSolutionsForSample12x12_0() throws IOException {
		List<Integer[]> solutions = rearranger.getSolutions(square12x12_0);
		Assertions.assertThat(solutions).hasSize(3646);
	}

	// Runs in 146s
	@Test
	public void testGetSolutionsForSample12x12_1() throws IOException {
		List<Integer[]> solutions = rearranger.getSolutions(square12x12_1);
		Assertions.assertThat(solutions).hasSize(3212);
	}

}
