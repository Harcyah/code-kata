package com.harcyah.kata.codingbat.recursion1.powerN;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class PowerNTest {

	@Test
	public void testPowerN() {
		PowerN powerN = new PowerN();
		Assertions.assertThat(powerN.powerN(3, 1)).isEqualTo(3);
		Assertions.assertThat(powerN.powerN(3, 2)).isEqualTo(9);
		Assertions.assertThat(powerN.powerN(3, 3)).isEqualTo(27);
		Assertions.assertThat(powerN.powerN(2, 1)).isEqualTo(2);
		Assertions.assertThat(powerN.powerN(2, 2)).isEqualTo(4);
		Assertions.assertThat(powerN.powerN(2, 3)).isEqualTo(8);
		Assertions.assertThat(powerN.powerN(2, 4)).isEqualTo(16);
		Assertions.assertThat(powerN.powerN(2, 5)).isEqualTo(32);
		Assertions.assertThat(powerN.powerN(10, 1)).isEqualTo(10);
		Assertions.assertThat(powerN.powerN(10, 2)).isEqualTo(100);
		Assertions.assertThat(powerN.powerN(10, 3)).isEqualTo(1000);
	}

}
