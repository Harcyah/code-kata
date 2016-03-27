package com.harcyah.kata.codingbat.array2.tripleUp;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class TripleUpTest {

	@Test
	public void testTripleUp() {
		TripleUp tripleUp = new TripleUp();
		Assertions.assertThat(tripleUp.tripleUp(new int[] { 1, 4, 5, 6, 2 })).isEqualTo(true);
		Assertions.assertThat(tripleUp.tripleUp(new int[] { 1, 2, 3 })).isEqualTo(true);
		Assertions.assertThat(tripleUp.tripleUp(new int[] { 1, 2, 4 })).isEqualTo(false);
		Assertions.assertThat(tripleUp.tripleUp(new int[] { 1, 2, 4, 5, 7, 6, 5, 6, 7, 6 })).isEqualTo(true);
		Assertions.assertThat(tripleUp.tripleUp(new int[] { 1, 2, 4, 5, 7, 6, 5, 7, 7, 6 })).isEqualTo(false);
		Assertions.assertThat(tripleUp.tripleUp(new int[] { 1, 2 })).isEqualTo(false);
		Assertions.assertThat(tripleUp.tripleUp(new int[] { 1 })).isEqualTo(false);
		Assertions.assertThat(tripleUp.tripleUp(new int[] {})).isEqualTo(false);
		Assertions.assertThat(tripleUp.tripleUp(new int[] { 10, 9, 8, -100, -99, -98, 100 })).isEqualTo(true);
		Assertions.assertThat(tripleUp.tripleUp(new int[] { 10, 9, 8, -100, -99, 99, 100 })).isEqualTo(false);
		Assertions.assertThat(tripleUp.tripleUp(new int[] { -100, -99, -99, 100, 101, 102 })).isEqualTo(true);
		Assertions.assertThat(tripleUp.tripleUp(new int[] { 2, 3, 5, 6, 8, 9, 2, 3 })).isEqualTo(false);
	}

}
