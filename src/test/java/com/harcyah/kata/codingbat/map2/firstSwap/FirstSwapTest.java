package com.harcyah.kata.codingbat.map2.firstSwap;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class FirstSwapTest {

	@Test
	public void testFirstSwap() {
		FirstSwap firstSwap = new FirstSwap();
		Assertions.assertThat(firstSwap.firstSwap(new String[] { "ab", "ac" })).isEqualTo(new String[] { "ac", "ab" });
		Assertions.assertThat(firstSwap.firstSwap(new String[] { "ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz" }))
			.isEqualTo(new String[] { "ay", "by", "cy", "cx", "bx", "ax", "aaa", "azz" });
		Assertions.assertThat(firstSwap.firstSwap(new String[] { "ax", "bx", "ay", "by", "ai", "aj", "bx", "by" }))
			.isEqualTo(new String[] { "ay", "by", "ax", "bx", "ai", "aj", "bx", "by" });
		Assertions.assertThat(firstSwap.firstSwap(new String[] { "ax", "bx", "cx", "ay", "cy", "aaa", "abb" }))
			.isEqualTo(new String[] { "ay", "bx", "cy", "ax", "cx", "aaa", "abb" });
		Assertions.assertThat(firstSwap.firstSwap(new String[] { "easy", "does", "it", "every", "ice", "eaten" }))
			.isEqualTo(new String[] { "every", "does", "ice", "easy", "it", "eaten" });
		Assertions.assertThat(firstSwap.firstSwap(new String[] { "list", "of", "words", "swims", "over", "lily", "water", "wait" }))
			.isEqualTo(new String[] { "lily", "over", "water", "swims", "of", "list", "words", "wait" });
		Assertions.assertThat(firstSwap.firstSwap(new String[] { "4", "8", "15", "16", "23", "42" })).isEqualTo(new String[] { "42", "8", "16", "15", "23", "4" });
		Assertions.assertThat(firstSwap.firstSwap(new String[] { "aaa" })).isEqualTo(new String[] { "aaa" });
		Assertions.assertThat(firstSwap.firstSwap(new String[] {})).isEqualTo(new String[] {});
		Assertions.assertThat(firstSwap.firstSwap(new String[] { "a", "b", "c", "xx", "yy", "zz" })).isEqualTo(new String[] { "a", "b", "c", "xx", "yy", "zz" });
	}

}