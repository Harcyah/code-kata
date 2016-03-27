package com.harcyah.kata.codingbat.array2.post4;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Post4Test {

	@Test
	public void testPost4() {
		Post4 post4 = new Post4();
		Assertions.assertThat(post4.post4(new int[] { 2, 4, 1, 2 })).isEqualTo(new int[] { 1, 2 });
		Assertions.assertThat(post4.post4(new int[] { 4, 1, 4, 2 })).isEqualTo(new int[] { 2 });
		Assertions.assertThat(post4.post4(new int[] { 4, 4, 1, 2, 3 })).isEqualTo(new int[] { 1, 2, 3 });
		Assertions.assertThat(post4.post4(new int[] { 4, 2 })).isEqualTo(new int[] { 2 });
		Assertions.assertThat(post4.post4(new int[] { 4, 4, 3 })).isEqualTo(new int[] { 3 });
		Assertions.assertThat(post4.post4(new int[] { 4, 4 })).isEqualTo(new int[] {});
		Assertions.assertThat(post4.post4(new int[] { 4 })).isEqualTo(new int[] {});
		Assertions.assertThat(post4.post4(new int[] { 2, 4, 1, 4, 3, 2 })).isEqualTo(new int[] { 3, 2 });
		Assertions.assertThat(post4.post4(new int[] { 4, 1, 4, 2, 2, 2 })).isEqualTo(new int[] { 2, 2, 2 });
		Assertions.assertThat(post4.post4(new int[] { 3, 4, 3, 2 })).isEqualTo(new int[] { 3, 2 });
	}

}
