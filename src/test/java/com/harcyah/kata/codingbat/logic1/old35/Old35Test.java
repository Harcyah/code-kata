package com.harcyah.kata.codingbat.logic1.old35;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Old35Test {

	@Test
	public void testOld35() {
		Old35 old35 = new Old35();
		Assertions.assertThat(old35.old35(3)).isEqualTo(true);
		Assertions.assertThat(old35.old35(10)).isEqualTo(true);
		Assertions.assertThat(old35.old35(15)).isEqualTo(false);
		Assertions.assertThat(old35.old35(5)).isEqualTo(true);
		Assertions.assertThat(old35.old35(9)).isEqualTo(true);
		Assertions.assertThat(old35.old35(8)).isEqualTo(false);
		Assertions.assertThat(old35.old35(7)).isEqualTo(false);
		Assertions.assertThat(old35.old35(6)).isEqualTo(true);
		Assertions.assertThat(old35.old35(17)).isEqualTo(false);
		Assertions.assertThat(old35.old35(18)).isEqualTo(true);
		Assertions.assertThat(old35.old35(29)).isEqualTo(false);
		Assertions.assertThat(old35.old35(20)).isEqualTo(true);
		Assertions.assertThat(old35.old35(21)).isEqualTo(true);
		Assertions.assertThat(old35.old35(22)).isEqualTo(false);
		Assertions.assertThat(old35.old35(45)).isEqualTo(false);
		Assertions.assertThat(old35.old35(99)).isEqualTo(true);
	}

}
