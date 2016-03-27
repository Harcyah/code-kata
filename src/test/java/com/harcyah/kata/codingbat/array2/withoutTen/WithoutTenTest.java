package com.harcyah.kata.codingbat.array2.withoutTen;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class WithoutTenTest {

	@Test
	public void testWithoutTen() {
		WithoutTen withoutTen = new WithoutTen();
		Assertions.assertThat(withoutTen.withoutTen(new int[] { 1, 10, 10, 2 })).isEqualTo(new int[] { 1, 2, 0, 0 });
		Assertions.assertThat(withoutTen.withoutTen(new int[] { 10, 2, 10 })).isEqualTo(new int[] { 2, 0, 0 });
		Assertions.assertThat(withoutTen.withoutTen(new int[] { 1, 99, 10 })).isEqualTo(new int[] { 1, 99, 0 });
		Assertions.assertThat(withoutTen.withoutTen(new int[] { 10, 13, 10, 14 })).isEqualTo(new int[] { 13, 14, 0, 0 });
		Assertions.assertThat(withoutTen.withoutTen(new int[] { 10, 13, 10, 14, 10 })).isEqualTo(new int[] { 13, 14, 0, 0, 0 });
		Assertions.assertThat(withoutTen.withoutTen(new int[] { 10, 10, 3 })).isEqualTo(new int[] { 3, 0, 0 });
		Assertions.assertThat(withoutTen.withoutTen(new int[] { 1 })).isEqualTo(new int[] { 1 });
		Assertions.assertThat(withoutTen.withoutTen(new int[] { 13, 1 })).isEqualTo(new int[] { 13, 1 });
		Assertions.assertThat(withoutTen.withoutTen(new int[] { 10 })).isEqualTo(new int[] { 0 });
		Assertions.assertThat(withoutTen.withoutTen(new int[] {})).isEqualTo(new int[] {});
	}

}
