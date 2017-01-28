package com.harcyah.kata.codingbat.map1.topping3;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import com.google.common.collect.ImmutableMap;
import com.harcyah.kata.codingbat.MapBuilder;

public class Topping3Test {

	@Test
	public void testTopping3() {
		Topping3 topping3 = new Topping3();
		Assertions.assertThat(topping3.topping3(MapBuilder.build("potato", "ketchup"))).isEqualTo(ImmutableMap.of("fries", "ketchup", "potato", "ketchup"));
		Assertions.assertThat(topping3.topping3(MapBuilder.build("potato", "butter"))).isEqualTo(ImmutableMap.of("fries", "butter", "potato", "butter"));
		Assertions.assertThat(topping3.topping3(MapBuilder.build("salad", "oil", "potato", "ketchup")))
			.isEqualTo(ImmutableMap.of("salad", "oil", "fries", "ketchup", "spinach", "oil", "potato", "ketchup"));
		Assertions.assertThat(topping3.topping3(MapBuilder.build("salad", "oil", "potato", "ketchup", "toast", "butter")))
			.isEqualTo(ImmutableMap.of("salad", "oil", "fries", "ketchup", "spinach", "oil", "potato", "ketchup", "toast", "butter"));
		Assertions.assertThat(topping3.topping3(MapBuilder.build())).isEqualTo(ImmutableMap.of());
		Assertions.assertThat(topping3.topping3(MapBuilder.build("salad", "pepper", "fries", "salt")))
			.isEqualTo(ImmutableMap.of("salad", "pepper", "fries", "salt", "spinach", "pepper"));
	}

}