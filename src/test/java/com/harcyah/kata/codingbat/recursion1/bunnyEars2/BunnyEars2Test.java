package com.harcyah.kata.codingbat.recursion1.bunnyEars2;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class BunnyEars2Test {

	@Test
	public void testBunnyEars2() {
		BunnyEars2 bunnyEars2 = new BunnyEars2();
		Assertions.assertThat(bunnyEars2.bunnyEars2(0)).isEqualTo(0);
		Assertions.assertThat(bunnyEars2.bunnyEars2(1)).isEqualTo(2);
		Assertions.assertThat(bunnyEars2.bunnyEars2(2)).isEqualTo(5);
		Assertions.assertThat(bunnyEars2.bunnyEars2(3)).isEqualTo(7);
		Assertions.assertThat(bunnyEars2.bunnyEars2(4)).isEqualTo(10);
		Assertions.assertThat(bunnyEars2.bunnyEars2(5)).isEqualTo(12);
		Assertions.assertThat(bunnyEars2.bunnyEars2(6)).isEqualTo(15);
		Assertions.assertThat(bunnyEars2.bunnyEars2(10)).isEqualTo(25);
	}

}
