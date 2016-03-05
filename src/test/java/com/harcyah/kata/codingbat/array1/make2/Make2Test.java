package com.harcyah.kata.codingbat.array1.make2;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Make2Test {

	@Test
	public void testMake2() {
		Make2 make2 = new Make2();
		Assertions.assertThat(make2.make2(new int[] { 4, 5 }, new int[] { 1, 2, 3 })).isEqualTo(new int[] { 4, 5 });
		Assertions.assertThat(make2.make2(new int[] { 4 }, new int[] { 1, 2, 3 })).isEqualTo(new int[] { 4, 1 });
		Assertions.assertThat(make2.make2(new int[] {}, new int[] { 1, 2 })).isEqualTo(new int[] { 1, 2 });
		Assertions.assertThat(make2.make2(new int[] { 1, 2 }, new int[] {})).isEqualTo(new int[] { 1, 2 });
		Assertions.assertThat(make2.make2(new int[] { 3 }, new int[] { 1, 2, 3 })).isEqualTo(new int[] { 3, 1 });
		Assertions.assertThat(make2.make2(new int[] { 3 }, new int[] { 1 })).isEqualTo(new int[] { 3, 1 });
		Assertions.assertThat(make2.make2(new int[] { 3, 1, 4 }, new int[] {})).isEqualTo(new int[] { 3, 1 });
		Assertions.assertThat(make2.make2(new int[] { 1 }, new int[] { 1 })).isEqualTo(new int[] { 1, 1 });
		Assertions.assertThat(make2.make2(new int[] { 1, 2, 3 }, new int[] { 7, 8 })).isEqualTo(new int[] { 1, 2 });
		Assertions.assertThat(make2.make2(new int[] { 7, 8 }, new int[] { 1, 2, 3 })).isEqualTo(new int[] { 7, 8 });
		Assertions.assertThat(make2.make2(new int[] { 7 }, new int[] { 1, 2, 3 })).isEqualTo(new int[] { 7, 1 });
		Assertions.assertThat(make2.make2(new int[] { 5, 4 }, new int[] { 2, 3, 7 })).isEqualTo(new int[] { 5, 4 });
	}

}
