package com.harcyah.kata.codingbat.logic1.specialEleven;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SpecialElevenTest {

	@Test
	public void testSpecialEleven() {
		SpecialEleven specialEleven = new SpecialEleven();
		Assertions.assertThat(specialEleven.specialEleven(22)).isEqualTo(true);
		Assertions.assertThat(specialEleven.specialEleven(23)).isEqualTo(true);
		Assertions.assertThat(specialEleven.specialEleven(24)).isEqualTo(false);
		Assertions.assertThat(specialEleven.specialEleven(21)).isEqualTo(false);
		Assertions.assertThat(specialEleven.specialEleven(11)).isEqualTo(true);
		Assertions.assertThat(specialEleven.specialEleven(12)).isEqualTo(true);
		Assertions.assertThat(specialEleven.specialEleven(10)).isEqualTo(false);
		Assertions.assertThat(specialEleven.specialEleven(9)).isEqualTo(false);
		Assertions.assertThat(specialEleven.specialEleven(8)).isEqualTo(false);
		Assertions.assertThat(specialEleven.specialEleven(0)).isEqualTo(true);
		Assertions.assertThat(specialEleven.specialEleven(1)).isEqualTo(true);
		Assertions.assertThat(specialEleven.specialEleven(2)).isEqualTo(false);
		Assertions.assertThat(specialEleven.specialEleven(121)).isEqualTo(true);
		Assertions.assertThat(specialEleven.specialEleven(122)).isEqualTo(true);
		Assertions.assertThat(specialEleven.specialEleven(123)).isEqualTo(false);
		Assertions.assertThat(specialEleven.specialEleven(46)).isEqualTo(false);
		Assertions.assertThat(specialEleven.specialEleven(49)).isEqualTo(false);
		Assertions.assertThat(specialEleven.specialEleven(52)).isEqualTo(false);
		Assertions.assertThat(specialEleven.specialEleven(54)).isEqualTo(false);
		Assertions.assertThat(specialEleven.specialEleven(55)).isEqualTo(true);
	}

}
