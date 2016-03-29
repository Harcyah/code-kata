package com.harcyah.kata.reddit.easy_2016_02_29;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class ObliqueTest {

	protected Oblique oblique = new Oblique();

	private static final Integer N = null;

	private static final Integer[][] INPUT = new Integer[][] {
		{ 0, 1, 2, 3, 4, 5, },
		{ 6, 7, 8, 9, 10, 11, },
		{ 12, 13, 14, 15, 16, 17, },
		{ 18, 19, 20, 21, 22, 23, },
		{ 24, 25, 26, 27, 28, 29, },
		{ 30, 31, 32, 33, 34, 35, },
	};

	private static final Integer[][] OUTPUT = new Integer[][] {
		{ 0, N, N, N, N, N },
		{ 1, 6, N, N, N, N },
		{ 2, 7, 12, N, N, N },
		{ 3, 8, 13, 18, N, N },
		{ 4, 9, 14, 19, 24, N },
		{ 5, 10, 15, 20, 25, 30 },
		{ 11, 16, 21, 26, 31, N },
		{ 17, 22, 27, 32, N, N },
		{ 23, 28, 33, N, N, N },
		{ 29, 34, N, N, N, N },
		{ 35, N, N, N, N, N },
	};

	@Test
	public void testOblique() {
		Assertions.assertThat(oblique.oblique(INPUT)).isEqualTo(OUTPUT);
	}

	@Test
	public void testDeoblique() {
		Assertions.assertThat(oblique.deoblique(OUTPUT)).isEqualTo(INPUT);
	}

}
