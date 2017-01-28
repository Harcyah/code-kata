package com.harcyah.kata.codingbat.map1.mapAB;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import com.google.common.collect.ImmutableMap;
import com.harcyah.kata.codingbat.MapBuilder;

public class MapABTest {

	@Test
	public void testMapAB() {
		MapAB mapAB = new MapAB();
		Assertions.assertThat(mapAB.mapAB(MapBuilder.build("b", "There", "a", "Hi"))).isEqualTo(ImmutableMap.of("b", "There", "a", "Hi", "ab", "HiThere"));
		Assertions.assertThat(mapAB.mapAB(MapBuilder.build("a", "Hi"))).isEqualTo(ImmutableMap.of("a", "Hi"));
		Assertions.assertThat(mapAB.mapAB(MapBuilder.build("b", "There"))).isEqualTo(ImmutableMap.of("b", "There"));
		Assertions.assertThat(mapAB.mapAB(MapBuilder.build("c", "meh"))).isEqualTo(ImmutableMap.of("c", "meh"));
		Assertions.assertThat(mapAB.mapAB(MapBuilder.build("b", "bbb", "c", "ccc", "a", "aaa", "ab", "nope")))
			.isEqualTo(ImmutableMap.of("b", "bbb", "c", "ccc", "a", "aaa", "ab", "aaabbb"));
		Assertions.assertThat(mapAB.mapAB(MapBuilder.build("b", "bbb", "c", "ccc", "ab", "nope"))).isEqualTo(ImmutableMap.of("b", "bbb", "c", "ccc", "ab", "nope"));
	}

}