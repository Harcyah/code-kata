package com.harcyah.kata.codingbat.array2.no14;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class No14Test {

	@Test
	public void testNo14() {
		No14 no14 = new No14();
		Assertions.assertThat(no14.no14(new int[] {1, 2, 3})).isEqualTo(true);
		Assertions.assertThat(no14.no14(new int[] {1, 2, 3, 4})).isEqualTo(false);
		Assertions.assertThat(no14.no14(new int[] {2, 3, 4})).isEqualTo(true);
		Assertions.assertThat(no14.no14(new int[] {1, 1, 4, 4})).isEqualTo(false);
		Assertions.assertThat(no14.no14(new int[] {2, 2, 4, 4})).isEqualTo(true);
		Assertions.assertThat(no14.no14(new int[] {2, 3, 4, 1})).isEqualTo(false);
		Assertions.assertThat(no14.no14(new int[] {2, 1, 1})).isEqualTo(true);
		Assertions.assertThat(no14.no14(new int[] {1, 4})).isEqualTo(false);
		Assertions.assertThat(no14.no14(new int[] {2})).isEqualTo(true);
		Assertions.assertThat(no14.no14(new int[] {2, 1})).isEqualTo(true);
		Assertions.assertThat(no14.no14(new int[] {1})).isEqualTo(true);
		Assertions.assertThat(no14.no14(new int[] {4})).isEqualTo(true);
		Assertions.assertThat(no14.no14(new int[] {})).isEqualTo(true);
		Assertions.assertThat(no14.no14(new int[] {1, 1, 1, 1})).isEqualTo(true);
		Assertions.assertThat(no14.no14(new int[] {9, 4, 4, 1})).isEqualTo(false);
		Assertions.assertThat(no14.no14(new int[] {4, 2, 3, 1})).isEqualTo(false);
		Assertions.assertThat(no14.no14(new int[] {4, 2, 3, 5})).isEqualTo(true);
		Assertions.assertThat(no14.no14(new int[] {4, 4, 2})).isEqualTo(true);
		Assertions.assertThat(no14.no14(new int[] {1, 4, 4})).isEqualTo(false);
	}

}


