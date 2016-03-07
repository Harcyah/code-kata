package com.harcyah.kata.codingbat.array2.more14;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class More14Test {

	@Test
	public void testMore14() {
		More14 more14 = new More14();
		Assertions.assertThat(more14.more14(new int[] {1, 4, 1})).isEqualTo(true);
		Assertions.assertThat(more14.more14(new int[] {1, 4, 1, 4})).isEqualTo(false);
		Assertions.assertThat(more14.more14(new int[] {1, 1})).isEqualTo(true);
		Assertions.assertThat(more14.more14(new int[] {1, 6, 6})).isEqualTo(true);
		Assertions.assertThat(more14.more14(new int[] {1})).isEqualTo(true);
		Assertions.assertThat(more14.more14(new int[] {1, 4})).isEqualTo(false);
		Assertions.assertThat(more14.more14(new int[] {6, 1, 1})).isEqualTo(true);
		Assertions.assertThat(more14.more14(new int[] {1, 6, 4})).isEqualTo(false);
		Assertions.assertThat(more14.more14(new int[] {1, 1, 4, 4, 1})).isEqualTo(true);
		Assertions.assertThat(more14.more14(new int[] {1, 1, 6, 4, 4, 1})).isEqualTo(true);
		Assertions.assertThat(more14.more14(new int[] {})).isEqualTo(false);
		Assertions.assertThat(more14.more14(new int[] {4, 1, 4, 6})).isEqualTo(false);
		Assertions.assertThat(more14.more14(new int[] {4, 1, 4, 6, 1})).isEqualTo(false);
		Assertions.assertThat(more14.more14(new int[] {1, 4, 1, 4, 1, 6})).isEqualTo(true);	}

}


