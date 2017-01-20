package com.harcyah.kata.codingbat.array1.no23;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class No23Test {

    @Test
    public void testNo23() {
        No23 no23 = new No23();
        Assertions.assertThat(no23.no23(new int[]{4, 5})).isEqualTo(true);
        Assertions.assertThat(no23.no23(new int[]{4, 2})).isEqualTo(false);
        Assertions.assertThat(no23.no23(new int[]{3, 5})).isEqualTo(false);
        Assertions.assertThat(no23.no23(new int[]{1, 9})).isEqualTo(true);
        Assertions.assertThat(no23.no23(new int[]{2, 9})).isEqualTo(false);
        Assertions.assertThat(no23.no23(new int[]{1, 3})).isEqualTo(false);
        Assertions.assertThat(no23.no23(new int[]{1, 1})).isEqualTo(true);
        Assertions.assertThat(no23.no23(new int[]{2, 2})).isEqualTo(false);
        Assertions.assertThat(no23.no23(new int[]{3, 3})).isEqualTo(false);
        Assertions.assertThat(no23.no23(new int[]{7, 8})).isEqualTo(true);
        Assertions.assertThat(no23.no23(new int[]{8, 7})).isEqualTo(true);
    }

}
