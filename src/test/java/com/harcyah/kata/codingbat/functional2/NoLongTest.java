package com.harcyah.kata.codingbat.functional2;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class NoLongTest {

    @Test
    public void testNoLong() {
        NoLong noLong = new NoLong();
        assertThat(noLong.noLong(List.of("this", "not", "too", "long")))
            .containsExactly("not", "too");
        assertThat(noLong.noLong(List.of("a", "bbb", "cccc")))
            .containsExactly("a", "bbb");
        assertThat(noLong.noLong(List.of("cccc", "cccc", "cccc")))
            .containsExactly();
        assertThat(noLong.noLong(List.of()))
            .containsExactly();
        assertThat(noLong.noLong(List.of("")))
            .containsExactly("");
        assertThat(noLong.noLong(List.of("empty", "", "empty")))
            .containsExactly("");
        assertThat(noLong.noLong(List.of("a")))
            .containsExactly("a");
        assertThat(noLong.noLong(List.of("aaaa", "bbb", "***", "333")))
            .containsExactly("bbb", "***", "333");
    }

}
