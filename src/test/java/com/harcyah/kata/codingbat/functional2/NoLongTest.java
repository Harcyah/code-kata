package com.harcyah.kata.codingbat.functional2;

import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class NoLongTest {

    @Test
    public void testNoLong() {
        NoLong noLong = new NoLong();
        assertThat(noLong.noLong(Arrays.asList("this", "not", "too", "long"))).containsExactly("not", "too");
        assertThat(noLong.noLong(Arrays.asList("a", "bbb", "cccc"))).containsExactly("a", "bbb");
        assertThat(noLong.noLong(Arrays.asList("cccc", "cccc", "cccc"))).containsExactly();
        assertThat(noLong.noLong(Arrays.asList())).containsExactly();
        assertThat(noLong.noLong(Arrays.asList(""))).containsExactly("");
        assertThat(noLong.noLong(Arrays.asList("empty", "", "empty"))).containsExactly("");
        assertThat(noLong.noLong(Arrays.asList("a"))).containsExactly("a");
        assertThat(noLong.noLong(Arrays.asList("aaaa", "bbb", "***", "333"))).containsExactly("bbb", "***", "333");
    }

}
