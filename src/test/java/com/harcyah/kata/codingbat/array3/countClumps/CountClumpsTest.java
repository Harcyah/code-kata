package com.harcyah.kata.codingbat.array3.countClumps;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class CountClumpsTest {

	@Test
	public void testCountClumps() {
		CountClumps countClumps = new CountClumps();
		Assertions.assertThat(countClumps.countClumps(new int[] { 1, 2, 2, 3, 4, 4 })).isEqualTo(2);
		Assertions.assertThat(countClumps.countClumps(new int[] { 1, 1, 2, 1, 1 })).isEqualTo(2);
		Assertions.assertThat(countClumps.countClumps(new int[] { 1, 1, 1, 1, 1 })).isEqualTo(1);
		Assertions.assertThat(countClumps.countClumps(new int[] { 1, 2, 3 })).isEqualTo(0);
		Assertions.assertThat(countClumps.countClumps(new int[] { 2, 2, 1, 1, 1, 2, 1, 1, 2, 2 })).isEqualTo(4);
		Assertions.assertThat(countClumps.countClumps(new int[] { 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2 })).isEqualTo(4);
		Assertions.assertThat(countClumps.countClumps(new int[] { 0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2 })).isEqualTo(5);
		Assertions.assertThat(countClumps.countClumps(new int[] { 0, 0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2 })).isEqualTo(5);
		Assertions.assertThat(countClumps.countClumps(new int[] {})).isEqualTo(0);
	}

}
