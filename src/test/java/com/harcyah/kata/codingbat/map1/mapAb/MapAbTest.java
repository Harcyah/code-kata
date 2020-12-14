package com.harcyah.kata.codingbat.map1.mapAb;

import com.harcyah.kata.codingbat.MapBuilder;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class MapAbTest {

    @Test
    public void testMapAB() {
        MapAb sut = new MapAb();
        assertThat(sut.mapAb(MapBuilder.build("b", "There", "a", "Hi")))
            .isEqualTo(Map.of("b", "There", "a", "Hi", "ab", "HiThere"));
        assertThat(sut.mapAb(MapBuilder.build("a", "Hi")))
            .isEqualTo(Map.of("a", "Hi"));
        assertThat(sut.mapAb(MapBuilder.build("b", "There")))
            .isEqualTo(Map.of("b", "There"));
        assertThat(sut.mapAb(MapBuilder.build("c", "meh")))
            .isEqualTo(Map.of("c", "meh"));
        assertThat(sut.mapAb(MapBuilder.build("b", "bbb", "c", "ccc", "a", "aaa", "ab", "nope")))
            .isEqualTo(Map.of("b", "bbb", "c", "ccc", "a", "aaa", "ab", "aaabbb"));
        assertThat(sut.mapAb(MapBuilder.build("b", "bbb", "c", "ccc", "ab", "nope")))
            .isEqualTo(Map.of("b", "bbb", "c", "ccc", "ab", "nope"));
    }

}
