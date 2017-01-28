package com.harcyah.kata.codingbat.map1.topping2;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import com.google.common.collect.ImmutableMap;
import com.harcyah.kata.codingbat.MapBuilder;

public class Topping2Test {

	@Test
	public void testTopping2() {
		Topping2 topping2 = new Topping2();
		Assertions.assertThat(topping2.topping2(MapBuilder.build("ice cream", "cherry"))).isEqualTo(ImmutableMap.of("yogurt", "cherry", "ice cream", "cherry"));
		Assertions.assertThat(topping2.topping2(MapBuilder.build("spinach", "dirt", "ice cream", "cherry")))
			.isEqualTo(ImmutableMap.of("yogurt", "cherry", "spinach", "nuts", "ice cream", "cherry"));
		Assertions.assertThat(topping2.topping2(MapBuilder.build("yogurt", "salt"))).isEqualTo(ImmutableMap.of("yogurt", "salt"));
		Assertions.assertThat(topping2.topping2(MapBuilder.build("yogurt", "salt", "bread", "butter"))).isEqualTo(ImmutableMap.of("yogurt", "salt", "bread", "butter"));
		Assertions.assertThat(topping2.topping2(MapBuilder.build())).isEqualTo(ImmutableMap.of());
		Assertions.assertThat(topping2.topping2(MapBuilder.build("salad", "oil", "ice cream", "air")))
			.isEqualTo(ImmutableMap.of("salad", "oil", "yogurt", "air", "ice cream", "air"));
	}

}