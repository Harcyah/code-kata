package com.harcyah.kata.codingbat.array1.makeEnds;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class MakeEndsTest {

	@Test
	public void testMakeEnds() {
		MakeEnds makeEnds = new MakeEnds();
		Assertions.assertThat(makeEnds.makeEnds(new int[] { 1, 2, 3 })).isEqualTo(new int[] { 1, 3 });
		Assertions.assertThat(makeEnds.makeEnds(new int[] { 1, 2, 3, 4 })).isEqualTo(new int[] { 1, 4 });
		Assertions.assertThat(makeEnds.makeEnds(new int[] { 7, 4, 6, 2 })).isEqualTo(new int[] { 7, 2 });
		Assertions.assertThat(makeEnds.makeEnds(new int[] { 1, 2, 2, 2, 2, 2, 2, 3 })).isEqualTo(new int[] { 1, 3 });
		Assertions.assertThat(makeEnds.makeEnds(new int[] { 7, 4 })).isEqualTo(new int[] { 7, 4 });
		Assertions.assertThat(makeEnds.makeEnds(new int[] { 7 })).isEqualTo(new int[] { 7, 7 });
		Assertions.assertThat(makeEnds.makeEnds(new int[] { 5, 2, 9 })).isEqualTo(new int[] { 5, 9 });
		Assertions.assertThat(makeEnds.makeEnds(new int[] { 2, 3, 4, 1 })).isEqualTo(new int[] { 2, 1 });
	}

}
