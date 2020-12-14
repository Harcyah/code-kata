package com.harcyah.kata.codingbat.map2.pairs;

import com.google.common.collect.ImmutableMap;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PairsTest {

    @Test
    public void testPairs() {
        Pairs pairs = new Pairs();
        assertThat(pairs.pairs(new String[]{"code", "bug"})).isEqualTo(ImmutableMap.of("b", "g", "c", "e"));
        assertThat(pairs.pairs(new String[]{"man", "moon", "main"})).isEqualTo(ImmutableMap.of("m", "n"));
        assertThat(pairs.pairs(new String[]{"man", "moon", "good", "night"})).isEqualTo(ImmutableMap.of("g", "d", "n", "t", "m", "n"));
        assertThat(pairs.pairs(new String[]{})).isEqualTo(ImmutableMap.of());
        assertThat(pairs.pairs(new String[]{"a", "b"})).isEqualTo(ImmutableMap.of("b", "b", "a", "a"));
        assertThat(pairs.pairs(new String[]{"are", "codes", "and", "cods"})).isEqualTo(ImmutableMap.of("c", "s", "a", "d"));
        assertThat(pairs.pairs(new String[]{"apple", "banana", "tea", "coffee"})).isEqualTo(ImmutableMap.of("t", "a", "b", "a", "c", "e", "a", "e"));
    }

}
