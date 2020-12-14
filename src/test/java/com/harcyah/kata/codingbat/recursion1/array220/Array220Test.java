package com.harcyah.kata.codingbat.recursion1.array220;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Array220Test {

    @Test
    public void testArray220() {
        Array220 array220 = new Array220();
        assertThat(array220.array220(new int[]{1, 2, 20}, 0)).isTrue();
        assertThat(array220.array220(new int[]{3, 30}, 0)).isTrue();
        assertThat(array220.array220(new int[]{3}, 0)).isFalse();
        assertThat(array220.array220(new int[]{}, 0)).isFalse();
        assertThat(array220.array220(new int[]{3, 3, 30, 4}, 0)).isTrue();
        assertThat(array220.array220(new int[]{2, 19, 4}, 0)).isFalse();
        assertThat(array220.array220(new int[]{20, 2, 21}, 0)).isFalse();
        assertThat(array220.array220(new int[]{20, 2, 21, 210}, 0)).isTrue();
        assertThat(array220.array220(new int[]{2, 200, 2000}, 0)).isTrue();
        assertThat(array220.array220(new int[]{0, 0}, 0)).isTrue();
        assertThat(array220.array220(new int[]{1, 2, 3, 4, 5, 6}, 0)).isFalse();
        assertThat(array220.array220(new int[]{1, 2, 3, 4, 5, 50, 6}, 0)).isTrue();
        assertThat(array220.array220(new int[]{1, 2, 3, 4, 5, 51, 6}, 0)).isFalse();
        assertThat(array220.array220(new int[]{1, 2, 3, 4, 4, 50, 500, 6}, 0)).isTrue();
    }

}
