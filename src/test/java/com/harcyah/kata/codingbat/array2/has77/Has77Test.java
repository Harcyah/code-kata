package com.harcyah.kata.codingbat.array2.has77;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Has77Test {

    @Test
    public void testHas77() {
        Has77 has77 = new Has77();
        Assertions.assertThat(has77.has77(new int[]{1, 7, 7})).isEqualTo(true);
        Assertions.assertThat(has77.has77(new int[]{1, 7, 1, 7})).isEqualTo(true);
        Assertions.assertThat(has77.has77(new int[]{1, 7, 1, 1, 7})).isEqualTo(false);
        Assertions.assertThat(has77.has77(new int[]{7, 7, 1, 1, 7})).isEqualTo(true);
        Assertions.assertThat(has77.has77(new int[]{2, 7, 2, 2, 7, 2})).isEqualTo(false);
        Assertions.assertThat(has77.has77(new int[]{2, 7, 2, 2, 7, 7})).isEqualTo(true);
        Assertions.assertThat(has77.has77(new int[]{7, 2, 7, 2, 2, 7})).isEqualTo(true);
        Assertions.assertThat(has77.has77(new int[]{7, 2, 6, 2, 2, 7})).isEqualTo(false);
        Assertions.assertThat(has77.has77(new int[]{7, 7, 7})).isEqualTo(true);
        Assertions.assertThat(has77.has77(new int[]{7, 1, 7})).isEqualTo(true);
        Assertions.assertThat(has77.has77(new int[]{7, 1, 1})).isEqualTo(false);
        Assertions.assertThat(has77.has77(new int[]{1, 2})).isEqualTo(false);
        Assertions.assertThat(has77.has77(new int[]{1, 7})).isEqualTo(false);
        Assertions.assertThat(has77.has77(new int[]{7})).isEqualTo(false);
    }

}
