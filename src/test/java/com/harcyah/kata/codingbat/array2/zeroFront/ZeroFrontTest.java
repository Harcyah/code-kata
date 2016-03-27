package com.harcyah.kata.codingbat.array2.zeroFront;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class ZeroFrontTest {

	@Test
	public void testZeroFront() {
		ZeroFront zeroFront = new ZeroFront();
		Assertions.assertThat(zeroFront.zeroFront(new int[] { 1, 0, 0, 1 })).isEqualTo(new int[] { 0, 0, 1, 1 });
		Assertions.assertThat(zeroFront.zeroFront(new int[] { 0, 1, 1, 0, 1 })).isEqualTo(new int[] { 0, 0, 1, 1, 1 });
		Assertions.assertThat(zeroFront.zeroFront(new int[] { 1, 0 })).isEqualTo(new int[] { 0, 1 });
		Assertions.assertThat(zeroFront.zeroFront(new int[] { 0, 1 })).isEqualTo(new int[] { 0, 1 });
		Assertions.assertThat(zeroFront.zeroFront(new int[] { 1, 1, 1, 0 })).isEqualTo(new int[] { 0, 1, 1, 1 });
		Assertions.assertThat(zeroFront.zeroFront(new int[] { 2, 2, 2, 2 })).isEqualTo(new int[] { 2, 2, 2, 2 });
		Assertions.assertThat(zeroFront.zeroFront(new int[] { 0, 0, 1, 0 })).isEqualTo(new int[] { 0, 0, 0, 1 });
		Assertions.assertThat(zeroFront.zeroFront(new int[] { -1, 0, 0, -1, 0 })).isEqualTo(new int[] { 0, 0, 0, -1, -1 });
		Assertions.assertThat(zeroFront.zeroFront(new int[] { 0, -3, 0, -3 })).isEqualTo(new int[] { 0, 0, -3, -3 });
		Assertions.assertThat(zeroFront.zeroFront(new int[] {})).isEqualTo(new int[] {});
		Assertions.assertThat(zeroFront.zeroFront(new int[] { 9, 9, 0, 9, 0, 9 })).isEqualTo(new int[] { 0, 0, 9, 9, 9, 9 });
	}

}
