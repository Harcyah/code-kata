package com.harcyah.kata.codingbat.logic1.love6;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Love6Test {

	@Test
	public void testLove6() {
		Love6 love6 = new Love6();
		Assertions.assertThat(love6.love6(6, 4)).isEqualTo(true);
		Assertions.assertThat(love6.love6(4, 5)).isEqualTo(false);
		Assertions.assertThat(love6.love6(1, 5)).isEqualTo(true);
		Assertions.assertThat(love6.love6(1, 6)).isEqualTo(true);
		Assertions.assertThat(love6.love6(1, 8)).isEqualTo(false);
		Assertions.assertThat(love6.love6(1, 7)).isEqualTo(true);
		Assertions.assertThat(love6.love6(7, 5)).isEqualTo(false);
		Assertions.assertThat(love6.love6(8, 2)).isEqualTo(true);
		Assertions.assertThat(love6.love6(6, 6)).isEqualTo(true);
		Assertions.assertThat(love6.love6(-6, 2)).isEqualTo(false);
		Assertions.assertThat(love6.love6(-4, -10)).isEqualTo(true);
		Assertions.assertThat(love6.love6(-7, 1)).isEqualTo(false);
		Assertions.assertThat(love6.love6(7, -1)).isEqualTo(true);
		Assertions.assertThat(love6.love6(-6, 12)).isEqualTo(true);
		Assertions.assertThat(love6.love6(-2, -4)).isEqualTo(false);
		Assertions.assertThat(love6.love6(7, 1)).isEqualTo(true);
		Assertions.assertThat(love6.love6(0, 9)).isEqualTo(false);
		Assertions.assertThat(love6.love6(8, 3)).isEqualTo(false);
		Assertions.assertThat(love6.love6(3, 3)).isEqualTo(true);
		Assertions.assertThat(love6.love6(3, 4)).isEqualTo(false);
	}

}
