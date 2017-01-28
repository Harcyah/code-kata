package com.harcyah.kata.codingbat.map1.topping1;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import com.google.common.collect.ImmutableMap;
import com.harcyah.kata.codingbat.MapBuilder;

public class Topping1Test {

	@Test
	public void testTopping1() {
		Topping1 topping1 = new Topping1();
		Assertions.assertThat(topping1.topping1(MapBuilder.build("ice cream", "peanuts"))).isEqualTo(ImmutableMap.of("bread", "butter", "ice cream", "cherry"));
		Assertions.assertThat(topping1.topping1(MapBuilder.build())).isEqualTo(ImmutableMap.of("bread", "butter"));
		Assertions.assertThat(topping1.topping1(MapBuilder.build("pancake", "syrup"))).isEqualTo(ImmutableMap.of("bread", "butter", "pancake", "syrup"));
		Assertions.assertThat(topping1.topping1(MapBuilder.build("bread", "dirt", "ice cream", "strawberries")))
			.isEqualTo(ImmutableMap.of("bread", "butter", "ice cream", "cherry"));
		Assertions.assertThat(topping1.topping1(MapBuilder.build("salad", "oil", "bread", "jam", "ice cream", "strawberries")))
			.isEqualTo(ImmutableMap.of("salad", "oil", "bread", "butter", "ice cream", "cherry"));
	}

}