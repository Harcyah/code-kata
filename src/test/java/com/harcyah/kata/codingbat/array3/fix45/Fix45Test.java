package com.harcyah.kata.codingbat.array3.fix45;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Fix45Test {

	@Test
	public void testFix45() {
		Fix45 fix45 = new Fix45();
		Assertions.assertThat(fix45.fix45(new int[] { 5, 4, 9, 4, 9, 5 })).isEqualTo(new int[] { 9, 4, 5, 4, 5, 9 });
		Assertions.assertThat(fix45.fix45(new int[] { 1, 4, 1, 5 })).isEqualTo(new int[] { 1, 4, 5, 1 });
		Assertions.assertThat(fix45.fix45(new int[] { 1, 4, 1, 5, 5, 4, 1 })).isEqualTo(new int[] { 1, 4, 5, 1, 1, 4, 5 });
		Assertions.assertThat(fix45.fix45(new int[] { 4, 9, 4, 9, 5, 5, 4, 9, 5 })).isEqualTo(new int[] { 4, 5, 4, 5, 9, 9, 4, 5, 9 });
		Assertions.assertThat(fix45.fix45(new int[] { 5, 5, 4, 1, 4, 1 })).isEqualTo(new int[] { 1, 1, 4, 5, 4, 5 });
		Assertions.assertThat(fix45.fix45(new int[] { 4, 2, 2, 5 })).isEqualTo(new int[] { 4, 5, 2, 2 });
		Assertions.assertThat(fix45.fix45(new int[] { 4, 2, 4, 2, 5, 5 })).isEqualTo(new int[] { 4, 5, 4, 5, 2, 2 });
		Assertions.assertThat(fix45.fix45(new int[] { 4, 2, 4, 5, 5 })).isEqualTo(new int[] { 4, 5, 4, 5, 2 });
		Assertions.assertThat(fix45.fix45(new int[] { 1, 1, 1 })).isEqualTo(new int[] { 1, 1, 1 });
		Assertions.assertThat(fix45.fix45(new int[] { 4, 5 })).isEqualTo(new int[] { 4, 5 });
		Assertions.assertThat(fix45.fix45(new int[] { 5, 4, 1 })).isEqualTo(new int[] { 1, 4, 5 });
		Assertions.assertThat(fix45.fix45(new int[] {})).isEqualTo(new int[] {});
		Assertions.assertThat(fix45.fix45(new int[] { 5, 4, 5, 4, 1 })).isEqualTo(new int[] { 1, 4, 5, 4, 5 });
		Assertions.assertThat(fix45.fix45(new int[] { 4, 5, 4, 1, 5 })).isEqualTo(new int[] { 4, 5, 4, 5, 1 });
		Assertions.assertThat(fix45.fix45(new int[] { 3, 4, 5 })).isEqualTo(new int[] { 3, 4, 5 });
		Assertions.assertThat(fix45.fix45(new int[] { 4, 1, 5 })).isEqualTo(new int[] { 4, 5, 1 });
		Assertions.assertThat(fix45.fix45(new int[] { 5, 4, 1 })).isEqualTo(new int[] { 1, 4, 5 });
		Assertions.assertThat(fix45.fix45(new int[] { 2, 4, 2, 5 })).isEqualTo(new int[] { 2, 4, 5, 2 });
	}

}
