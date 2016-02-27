package com.harcyah.kata.codingbat.string3.countYZ;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class CountYZTest {

	@Test
	public void testCountYZ() {
		CountYZ countYZ = new CountYZ();
		Assertions.assertThat(countYZ.countYZ("fez day")).isEqualTo(2);
		Assertions.assertThat(countYZ.countYZ("day fez")).isEqualTo(2);
		Assertions.assertThat(countYZ.countYZ("day fyyyz")).isEqualTo(2);
		Assertions.assertThat(countYZ.countYZ("day yak")).isEqualTo(1);
		Assertions.assertThat(countYZ.countYZ("day:yak")).isEqualTo(1);
		Assertions.assertThat(countYZ.countYZ("!!day--yaz!!")).isEqualTo(2);
		Assertions.assertThat(countYZ.countYZ("yak zak")).isEqualTo(0);
		Assertions.assertThat(countYZ.countYZ("DAY abc XYZ")).isEqualTo(2);
		Assertions.assertThat(countYZ.countYZ("aaz yyz my")).isEqualTo(3);
		Assertions.assertThat(countYZ.countYZ("y2bz")).isEqualTo(2);
		Assertions.assertThat(countYZ.countYZ("zxyx")).isEqualTo(0);
	}

}
