package com.harcyah.kata.codingbat.map1.mapShare;

import com.harcyah.kata.codingbat.MapBuilder;
import org.junit.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class MapShareTest {

    @Test
    public void testMapShare() {
        MapShare mapShare = new MapShare();
        assertThat(mapShare.mapShare(MapBuilder.build("b", "bbb", "c", "ccc", "a", "aaa")))
            .isEqualTo(Map.of("b", "aaa", "a", "aaa"));
        assertThat(mapShare.mapShare(MapBuilder.build("b", "xyz", "c", "ccc")))
            .isEqualTo(Map.of("b", "xyz"));
        assertThat(mapShare.mapShare(MapBuilder.build("d", "hi", "c", "meh", "a", "aaa")))
            .isEqualTo(Map.of("d", "hi", "b", "aaa", "a", "aaa"));
        assertThat(mapShare.mapShare(MapBuilder.build("b", "1234", "c", "yo", "a", "xyz", "z", "zzz")))
            .isEqualTo(Map.of("b", "xyz", "a", "xyz", "z", "zzz"));
        assertThat(mapShare.mapShare(MapBuilder.build("d", "ddd", "e", "everything", "b", "1234", "c", "yo", "a", "xyz")))
            .isEqualTo(Map.of("d", "ddd", "e", "everything", "b", "xyz", "a", "xyz"));
    }

}
