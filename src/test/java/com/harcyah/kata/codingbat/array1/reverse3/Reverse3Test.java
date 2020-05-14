package com.harcyah.kata.codingbat.array1.reverse3;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Reverse3Test {

    @Test
    public void testReverse3() {
        Reverse3 reverse3 = new Reverse3();
        assertThat(reverse3.reverse3(new int[]{1, 2, 3})).isEqualTo(new int[]{3, 2, 1});
        assertThat(reverse3.reverse3(new int[]{5, 11, 9})).isEqualTo(new int[]{9, 11, 5});
        assertThat(reverse3.reverse3(new int[]{7, 0, 0})).isEqualTo(new int[]{0, 0, 7});
        assertThat(reverse3.reverse3(new int[]{2, 1, 2})).isEqualTo(new int[]{2, 1, 2});
        assertThat(reverse3.reverse3(new int[]{1, 2, 1})).isEqualTo(new int[]{1, 2, 1});
        assertThat(reverse3.reverse3(new int[]{2, 11, 3})).isEqualTo(new int[]{3, 11, 2});
        assertThat(reverse3.reverse3(new int[]{0, 6, 5})).isEqualTo(new int[]{5, 6, 0});
        assertThat(reverse3.reverse3(new int[]{7, 2, 3})).isEqualTo(new int[]{3, 2, 7});
    }

}
