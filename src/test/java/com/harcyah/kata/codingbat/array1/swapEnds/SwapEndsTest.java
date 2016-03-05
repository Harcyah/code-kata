package com.harcyah.kata.codingbat.array1.swapEnds;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SwapEndsTest {

	@Test
	public void testSwapEnds() {
		SwapEnds swapEnds = new SwapEnds();
		Assertions.assertThat(swapEnds.swapEnds(new int[] { 1, 2, 3, 4 })).isEqualTo(new int[] { 4, 2, 3, 1 });
		Assertions.assertThat(swapEnds.swapEnds(new int[] { 1, 2, 3 })).isEqualTo(new int[] { 3, 2, 1 });
		Assertions.assertThat(swapEnds.swapEnds(new int[] { 8, 6, 7, 9, 5 })).isEqualTo(new int[] { 5, 6, 7, 9, 8 });
		Assertions.assertThat(swapEnds.swapEnds(new int[] { 3, 1, 4, 1, 5, 9 })).isEqualTo(new int[] { 9, 1, 4, 1, 5, 3 });
		Assertions.assertThat(swapEnds.swapEnds(new int[] { 1, 2 })).isEqualTo(new int[] { 2, 1 });
		Assertions.assertThat(swapEnds.swapEnds(new int[] { 1 })).isEqualTo(new int[] { 1 });
	}

}
