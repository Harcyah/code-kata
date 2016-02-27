package com.harcyah.kata.codingbat.logic1.less20;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Less20Test {

	@Test
	public void testLess20() {
		Less20 less20 = new Less20();
		Assertions.assertThat(less20.less20(18)).isEqualTo(true);
		Assertions.assertThat(less20.less20(19)).isEqualTo(true);
		Assertions.assertThat(less20.less20(20)).isEqualTo(false);
		Assertions.assertThat(less20.less20(8)).isEqualTo(false);
		Assertions.assertThat(less20.less20(17)).isEqualTo(false);
		Assertions.assertThat(less20.less20(23)).isEqualTo(false);
		Assertions.assertThat(less20.less20(25)).isEqualTo(false);
		Assertions.assertThat(less20.less20(30)).isEqualTo(false);
		Assertions.assertThat(less20.less20(31)).isEqualTo(false);
		Assertions.assertThat(less20.less20(58)).isEqualTo(true);
		Assertions.assertThat(less20.less20(59)).isEqualTo(true);
		Assertions.assertThat(less20.less20(60)).isEqualTo(false);
		Assertions.assertThat(less20.less20(61)).isEqualTo(false);
		Assertions.assertThat(less20.less20(62)).isEqualTo(false);
		Assertions.assertThat(less20.less20(1017)).isEqualTo(false);
		Assertions.assertThat(less20.less20(1018)).isEqualTo(true);
		Assertions.assertThat(less20.less20(1019)).isEqualTo(true);
		Assertions.assertThat(less20.less20(1020)).isEqualTo(false);
		Assertions.assertThat(less20.less20(1021)).isEqualTo(false);
		Assertions.assertThat(less20.less20(1022)).isEqualTo(false);
		Assertions.assertThat(less20.less20(1023)).isEqualTo(false);
		Assertions.assertThat(less20.less20(37)).isEqualTo(false);
	}

}
