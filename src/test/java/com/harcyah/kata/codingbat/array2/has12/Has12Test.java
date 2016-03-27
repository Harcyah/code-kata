package com.harcyah.kata.codingbat.array2.has12;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Has12Test {

	@Test
	public void testHas12() {
		Has12 has12 = new Has12();
		Assertions.assertThat(has12.has12(new int[] { 1, 3, 2 })).isEqualTo(true);
		Assertions.assertThat(has12.has12(new int[] { 3, 1, 2 })).isEqualTo(true);
		Assertions.assertThat(has12.has12(new int[] { 3, 1, 4, 5, 2 })).isEqualTo(true);
		Assertions.assertThat(has12.has12(new int[] { 3, 1, 4, 5, 6 })).isEqualTo(false);
		Assertions.assertThat(has12.has12(new int[] { 3, 1, 4, 1, 6, 2 })).isEqualTo(true);
		Assertions.assertThat(has12.has12(new int[] { 2, 1, 4, 1, 6, 2 })).isEqualTo(true);
		Assertions.assertThat(has12.has12(new int[] { 2, 1, 4, 1, 6 })).isEqualTo(false);
		Assertions.assertThat(has12.has12(new int[] { 3, 5, 9 })).isEqualTo(false);
		Assertions.assertThat(has12.has12(new int[] { 3, 5, 1 })).isEqualTo(false);
		Assertions.assertThat(has12.has12(new int[] { 3, 2, 1 })).isEqualTo(false);
		Assertions.assertThat(has12.has12(new int[] { 1, 2 })).isEqualTo(true);
		Assertions.assertThat(has12.has12(new int[] { 1, 1 })).isEqualTo(false);
		Assertions.assertThat(has12.has12(new int[] { 1 })).isEqualTo(false);
		Assertions.assertThat(has12.has12(new int[] {})).isEqualTo(false);
	}

}
