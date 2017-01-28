package com.harcyah.kata.codingbat.map1.mapShare;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import com.google.common.collect.ImmutableMap;
import com.harcyah.kata.codingbat.MapBuilder;

public class MapShareTest {

	@Test
	public void testMapShare() {
		MapShare mapShare = new MapShare();
		Assertions.assertThat(mapShare.mapShare(MapBuilder.build("b", "bbb", "c", "ccc", "a", "aaa"))).isEqualTo(ImmutableMap.of("b", "aaa", "a", "aaa"));
		Assertions.assertThat(mapShare.mapShare(MapBuilder.build("b", "xyz", "c", "ccc"))).isEqualTo(ImmutableMap.of("b", "xyz"));
		Assertions.assertThat(mapShare.mapShare(MapBuilder.build("d", "hi", "c", "meh", "a", "aaa"))).isEqualTo(ImmutableMap.of("d", "hi", "b", "aaa", "a", "aaa"));
		Assertions.assertThat(mapShare.mapShare(MapBuilder.build("b", "1234", "c", "yo", "a", "xyz", "z", "zzz"))).isEqualTo(ImmutableMap.of("b", "xyz", "a", "xyz", "z", "zzz"));
		Assertions.assertThat(mapShare.mapShare(MapBuilder.build("d", "ddd", "e", "everything", "b", "1234", "c", "yo", "a", "xyz")))
			.isEqualTo(ImmutableMap.of("d", "ddd", "e", "everything", "b", "xyz", "a", "xyz"));
	}

}