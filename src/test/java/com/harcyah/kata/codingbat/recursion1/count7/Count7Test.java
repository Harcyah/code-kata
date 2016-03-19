package com.harcyah.kata.codingbat.recursion1.count7;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Count7Test {

	@Test
	public void testCount7() {
		Count7 count7 = new Count7();
		Assertions.assertThat(count7.count7(717)).isEqualTo(2);
		Assertions.assertThat(count7.count7(7)).isEqualTo(1);
		Assertions.assertThat(count7.count7(123)).isEqualTo(0);
		Assertions.assertThat(count7.count7(77)).isEqualTo(2);
		Assertions.assertThat(count7.count7(7123)).isEqualTo(1);
		Assertions.assertThat(count7.count7(771237)).isEqualTo(3);
		Assertions.assertThat(count7.count7(771737)).isEqualTo(4);
		Assertions.assertThat(count7.count7(47571)).isEqualTo(2);
		Assertions.assertThat(count7.count7(777777)).isEqualTo(6);
		Assertions.assertThat(count7.count7(70701277)).isEqualTo(4);
		Assertions.assertThat(count7.count7(777576197)).isEqualTo(5);
		Assertions.assertThat(count7.count7(99999)).isEqualTo(0);
		Assertions.assertThat(count7.count7(99799)).isEqualTo(1);
	}

}
