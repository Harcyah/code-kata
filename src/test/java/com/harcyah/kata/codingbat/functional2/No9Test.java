package com.harcyah.kata.codingbat.functional2;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class No9Test {

    @Test
    public void testNo9() {
        No9 no9 = new No9();
        assertThat(no9.no9(List.of(1, 2, 19)))
            .containsExactly(1, 2);
        assertThat(no9.no9(List.of(9, 19, 29, 3)))
            .containsExactly(3);
        assertThat(no9.no9(List.of(1, 2, 3)))
            .containsExactly(1, 2, 3);
        assertThat(no9.no9(List.of(45, 99, 90, 28, 13, 999, 0)))
            .containsExactly(45, 90, 28, 13, 0);
        assertThat(no9.no9(List.of()))
            .containsExactly();
        assertThat(no9.no9(List.of(9)))
            .containsExactly();
        assertThat(no9.no9(List.of(0, 9, 0)))
            .containsExactly(0, 0);
    }

}
