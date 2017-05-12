package com.harcyah.kata.codingbat.functional2;

import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class No34Test {

    @Test
    public void testNo34() {
        No34 no34 = new No34();
        assertThat(no34.no34(Arrays.asList("a", "bb", "ccc"))).containsExactly("a", "bb");
        assertThat(no34.no34(Arrays.asList("a", "bb", "ccc", "dddd"))).containsExactly("a", "bb");
        assertThat(no34.no34(Arrays.asList("ccc", "dddd", "apple"))).containsExactly("apple");
        assertThat(no34.no34(Arrays.asList("this", "not", "too", "long"))).containsExactly();
        assertThat(no34.no34(Arrays.asList("a", "bbb", "cccc", "xx"))).containsExactly("a", "xx");
        assertThat(no34.no34(Arrays.asList("dddd", "ddd", "xxxxxxx"))).containsExactly("xxxxxxx");
        assertThat(no34.no34(Arrays.asList())).containsExactly();
        assertThat(no34.no34(Arrays.asList(""))).containsExactly("");
        assertThat(no34.no34(Arrays.asList("empty", "", "empty"))).containsExactly("empty", "", "empty");
        assertThat(no34.no34(Arrays.asList("a"))).containsExactly("a");
        assertThat(no34.no34(Arrays.asList("aaaa", "bbb", "*****", "333"))).containsExactly("*****");
    }

}
