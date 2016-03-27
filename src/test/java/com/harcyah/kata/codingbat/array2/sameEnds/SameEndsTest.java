package com.harcyah.kata.codingbat.array2.sameEnds;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SameEndsTest {

	@Test
	public void testSameEnds() {
		SameEnds sameEnds = new SameEnds();
		Assertions.assertThat(sameEnds.sameEnds(new int[] { 5, 6, 45, 99, 13, 5, 6 }, 1)).isEqualTo(false);
		Assertions.assertThat(sameEnds.sameEnds(new int[] { 5, 6, 45, 99, 13, 5, 6 }, 2)).isEqualTo(true);
		Assertions.assertThat(sameEnds.sameEnds(new int[] { 5, 6, 45, 99, 13, 5, 6 }, 3)).isEqualTo(false);
		Assertions.assertThat(sameEnds.sameEnds(new int[] { 1, 2, 5, 2, 1 }, 1)).isEqualTo(true);
		Assertions.assertThat(sameEnds.sameEnds(new int[] { 1, 2, 5, 2, 1 }, 2)).isEqualTo(false);
		Assertions.assertThat(sameEnds.sameEnds(new int[] { 1, 2, 5, 2, 1 }, 0)).isEqualTo(true);
		Assertions.assertThat(sameEnds.sameEnds(new int[] { 1, 2, 5, 2, 1 }, 5)).isEqualTo(true);
		Assertions.assertThat(sameEnds.sameEnds(new int[] { 1, 1, 1 }, 0)).isEqualTo(true);
		Assertions.assertThat(sameEnds.sameEnds(new int[] { 1, 1, 1 }, 1)).isEqualTo(true);
		Assertions.assertThat(sameEnds.sameEnds(new int[] { 1, 1, 1 }, 2)).isEqualTo(true);
		Assertions.assertThat(sameEnds.sameEnds(new int[] { 1, 1, 1 }, 3)).isEqualTo(true);
		Assertions.assertThat(sameEnds.sameEnds(new int[] { 1 }, 1)).isEqualTo(true);
		Assertions.assertThat(sameEnds.sameEnds(new int[] {}, 0)).isEqualTo(true);
		Assertions.assertThat(sameEnds.sameEnds(new int[] { 4, 2, 4, 5 }, 1)).isEqualTo(false);
	}

}
