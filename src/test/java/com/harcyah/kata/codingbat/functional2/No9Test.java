package com.harcyah.kata.codingbat.functional2;

import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class No9Test {

    @Test
    public void testNo9() {
        No9 no9 = new No9();
        assertThat(no9.no9(Arrays.asList(1, 2, 19))).containsExactly(1, 2);
        assertThat(no9.no9(Arrays.asList(9, 19, 29, 3))).containsExactly(3);
        assertThat(no9.no9(Arrays.asList(1, 2, 3))).containsExactly(1, 2, 3);
        assertThat(no9.no9(Arrays.asList(45, 99, 90, 28, 13, 999, 0))).containsExactly(45, 90, 28, 13, 0);
        assertThat(no9.no9(Arrays.asList())).containsExactly();
        assertThat(no9.no9(Arrays.asList(9))).containsExactly();
        assertThat(no9.no9(Arrays.asList(0, 9, 0))).containsExactly(0, 0);
    }

}
