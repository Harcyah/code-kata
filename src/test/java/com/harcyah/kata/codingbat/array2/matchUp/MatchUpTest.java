package com.harcyah.kata.codingbat.array2.matchUp;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class MatchUpTest {

	@Test
	public void testMatchUp() {
		MatchUp matchUp = new MatchUp();
		Assertions.assertThat(matchUp.matchUp(new int[] { 1, 2, 3 }, new int[] { 2, 3, 10 })).isEqualTo(2);
		Assertions.assertThat(matchUp.matchUp(new int[] { 1, 2, 3 }, new int[] { 2, 3, 5 })).isEqualTo(3);
		Assertions.assertThat(matchUp.matchUp(new int[] { 1, 2, 3 }, new int[] { 2, 3, 3 })).isEqualTo(2);
		Assertions.assertThat(matchUp.matchUp(new int[] { 5, 3 }, new int[] { 5, 5 })).isEqualTo(1);
		Assertions.assertThat(matchUp.matchUp(new int[] { 5, 3 }, new int[] { 4, 4 })).isEqualTo(2);
		Assertions.assertThat(matchUp.matchUp(new int[] { 5, 3 }, new int[] { 3, 3 })).isEqualTo(1);
		Assertions.assertThat(matchUp.matchUp(new int[] { 5, 3 }, new int[] { 2, 2 })).isEqualTo(1);
		Assertions.assertThat(matchUp.matchUp(new int[] { 5, 3 }, new int[] { 1, 1 })).isEqualTo(1);
		Assertions.assertThat(matchUp.matchUp(new int[] { 5, 3 }, new int[] { 0, 0 })).isEqualTo(0);
		Assertions.assertThat(matchUp.matchUp(new int[] { 4 }, new int[] { 4 })).isEqualTo(0);
		Assertions.assertThat(matchUp.matchUp(new int[] { 4 }, new int[] { 5 })).isEqualTo(1);
	}

}
