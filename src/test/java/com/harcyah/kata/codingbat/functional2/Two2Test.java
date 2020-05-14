package com.harcyah.kata.codingbat.functional2;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Two2Test {

    @Test
    public void testTwo2() {
        Two2 two2 = new Two2();
        assertThat(two2.two2(List.of(1, 2, 3)))
            .containsExactly(4, 6);
        assertThat(two2.two2(List.of(2, 6, 11)))
            .containsExactly(4);
        assertThat(two2.two2(List.of(0)))
            .containsExactly(0);
        assertThat(two2.two2(List.of()))
            .containsExactly();
        assertThat(two2.two2(List.of(1, 11, 111, 16)))
            .containsExactly();
        assertThat(two2.two2(List.of(2, 3, 5, 7, 11)))
            .containsExactly(4, 6, 10, 14);
        assertThat(two2.two2(List.of(3, 1, 4, 1, 6, 99, 0)))
            .containsExactly(6, 8, 198, 0);
    }

}
