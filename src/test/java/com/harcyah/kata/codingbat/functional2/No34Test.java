package com.harcyah.kata.codingbat.functional2;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class No34Test {

    @Test
    public void testNo34() {
        No34 no34 = new No34();
        assertThat(no34.no34(List.of("a", "bb", "ccc")))
            .containsExactly("a", "bb");
        assertThat(no34.no34(List.of("a", "bb", "ccc", "dddd")))
            .containsExactly("a", "bb");
        assertThat(no34.no34(List.of("ccc", "dddd", "apple")))
            .containsExactly("apple");
        assertThat(no34.no34(List.of("this", "not", "too", "long")))
            .containsExactly();
        assertThat(no34.no34(List.of("a", "bbb", "cccc", "xx")))
            .containsExactly("a", "xx");
        assertThat(no34.no34(List.of("dddd", "ddd", "xxxxxxx")))
            .containsExactly("xxxxxxx");
        assertThat(no34.no34(List.of()))
            .containsExactly();
        assertThat(no34.no34(List.of("")))
            .containsExactly("");
        assertThat(no34.no34(List.of("empty", "", "empty")))
            .containsExactly("empty", "", "empty");
        assertThat(no34.no34(List.of("a")))
            .containsExactly("a");
        assertThat(no34.no34(List.of("aaaa", "bbb", "*****", "333")))
            .containsExactly("*****");
    }

}
