package com.harcyah.kata.codingbat.recursion1.array11;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Array11Test {

    @Test
    public void testArray11() {
        Array11 array11 = new Array11();
        assertThat(array11.array11(new int[]{1, 2, 11}, 0)).isEqualTo(1);
        assertThat(array11.array11(new int[]{11, 11}, 0)).isEqualTo(2);
        assertThat(array11.array11(new int[]{1, 2, 3, 4}, 0)).isEqualTo(0);
        assertThat(array11.array11(new int[]{1, 11, 3, 11, 11}, 0)).isEqualTo(3);
        assertThat(array11.array11(new int[]{11}, 0)).isEqualTo(1);
        assertThat(array11.array11(new int[]{1}, 0)).isEqualTo(0);
        assertThat(array11.array11(new int[]{}, 0)).isEqualTo(0);
        assertThat(array11.array11(new int[]{11, 2, 3, 4, 11, 5}, 0)).isEqualTo(2);
        assertThat(array11.array11(new int[]{11, 5, 11}, 0)).isEqualTo(2);
    }

}
