package com.harcyah.kata.codingbat.functional1;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class LowerTest {

    @Test
    public void testLower() {
        Lower lower = new Lower();
        assertThat(lower.lower(List.of("Hello", "Hi")))
            .containsExactly("hello", "hi");
        assertThat(lower.lower(List.of("AAA", "BBB", "ccc")))
            .containsExactly("aaa", "bbb", "ccc");
        assertThat(lower.lower(List.of("KitteN", "ChocolaTE")))
            .containsExactly("kitten", "chocolate");
        assertThat(lower.lower(List.of()))
            .containsExactly();
        assertThat(lower.lower(List.of("EMPTY", "")))
            .containsExactly("empty", "");
        assertThat(lower.lower(List.of("aaX", "bYb", "Ycc", "ZZZ")))
            .containsExactly("aax", "byb", "ycc", "zzz");
    }

}
