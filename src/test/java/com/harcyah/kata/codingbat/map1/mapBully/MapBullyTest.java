package com.harcyah.kata.codingbat.map1.mapBully;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import com.google.common.collect.ImmutableMap;
import com.harcyah.kata.codingbat.MapBuilder;

public class MapBullyTest {

	@Test
	public void testMapBully() {
		MapBully mapBully = new MapBully();
		Assertions.assertThat(mapBully.mapBully(MapBuilder.build("b", "dirt", "a", "candy"))).isEqualTo(ImmutableMap.of("b", "candy", "a", ""));
		Assertions.assertThat(mapBully.mapBully(MapBuilder.build("a", "candy"))).isEqualTo(ImmutableMap.of("b", "candy", "a", ""));
		Assertions.assertThat(mapBully.mapBully(MapBuilder.build("b", "carrot", "c", "meh", "a", "candy"))).isEqualTo(ImmutableMap.of("b", "candy", "c", "meh", "a", ""));
		Assertions.assertThat(mapBully.mapBully(MapBuilder.build("b", "carrot"))).isEqualTo(ImmutableMap.of("b", "carrot"));
		Assertions.assertThat(mapBully.mapBully(MapBuilder.build("c", "meh"))).isEqualTo(ImmutableMap.of("c", "meh"));
		Assertions.assertThat(mapBully.mapBully(MapBuilder.build("c", "meh", "a", "sparkle"))).isEqualTo(ImmutableMap.of("b", "sparkle", "c", "meh", "a", ""));
	}

}