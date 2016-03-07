package com.harcyah.kata.codingbat.array2.sum67;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Sum67Test {

	@Test
	public void testSum67() {
		Sum67 sum67 = new Sum67();
		Assertions.assertThat(sum67.sum67(new int[] {1, 2, 2})).isEqualTo(5);
		Assertions.assertThat(sum67.sum67(new int[] {1, 2, 2, 6, 99, 99, 7})).isEqualTo(5);
		Assertions.assertThat(sum67.sum67(new int[] {1, 1, 6, 7, 2})).isEqualTo(4);
		Assertions.assertThat(sum67.sum67(new int[] {1, 6, 2, 2, 7, 1, 6, 99, 99, 7})).isEqualTo(2);
		Assertions.assertThat(sum67.sum67(new int[] {1, 6, 2, 6, 2, 7, 1, 6, 99, 99, 7})).isEqualTo(2);
		Assertions.assertThat(sum67.sum67(new int[] {2, 7, 6, 2, 6, 7, 2, 7})).isEqualTo(18);
		Assertions.assertThat(sum67.sum67(new int[] {2, 7, 6, 2, 6, 2, 7})).isEqualTo(9);
		Assertions.assertThat(sum67.sum67(new int[] {1, 6, 7, 7})).isEqualTo(8);
		Assertions.assertThat(sum67.sum67(new int[] {6, 7, 1, 6, 7, 7})).isEqualTo(8);
		Assertions.assertThat(sum67.sum67(new int[] {6, 8, 1, 6, 7})).isEqualTo(0);
		Assertions.assertThat(sum67.sum67(new int[] {})).isEqualTo(0);
		Assertions.assertThat(sum67.sum67(new int[] {6, 7, 11})).isEqualTo(11);
		Assertions.assertThat(sum67.sum67(new int[] {11, 6, 7, 11})).isEqualTo(22);
		Assertions.assertThat(sum67.sum67(new int[] {2, 2, 6, 7, 7})).isEqualTo(11);
	}

}


