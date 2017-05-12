package com.harcyah.kata.codingbat.functional1;

import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class LowerTest {

    @Test
    public void testLower() {
        Lower lower = new Lower();
        assertThat(lower.lower(Arrays.asList("Hello", "Hi"))).containsExactly("hello", "hi");
        assertThat(lower.lower(Arrays.asList("AAA", "BBB", "ccc"))).containsExactly("aaa", "bbb", "ccc");
        assertThat(lower.lower(Arrays.asList("KitteN", "ChocolaTE"))).containsExactly("kitten", "chocolate");
        assertThat(lower.lower(Arrays.asList())).containsExactly();
        assertThat(lower.lower(Arrays.asList("EMPTY", ""))).containsExactly("empty", "");
        assertThat(lower.lower(Arrays.asList("aaX", "bYb", "Ycc", "ZZZ"))).containsExactly("aax", "byb", "ycc", "zzz");
    }

}
