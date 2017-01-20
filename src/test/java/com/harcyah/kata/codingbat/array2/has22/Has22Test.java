package com.harcyah.kata.codingbat.array2.has22;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Has22Test {

    @Test
    public void testHas22() {
        Has22 has22 = new Has22();
        Assertions.assertThat(has22.has22(new int[]{1, 2, 2})).isEqualTo(true);
        Assertions.assertThat(has22.has22(new int[]{1, 2, 1, 2})).isEqualTo(false);
        Assertions.assertThat(has22.has22(new int[]{2, 1, 2})).isEqualTo(false);
        Assertions.assertThat(has22.has22(new int[]{2, 2, 1, 2})).isEqualTo(true);
        Assertions.assertThat(has22.has22(new int[]{1, 3, 2})).isEqualTo(false);
        Assertions.assertThat(has22.has22(new int[]{1, 3, 2, 2})).isEqualTo(true);
        Assertions.assertThat(has22.has22(new int[]{2, 3, 2, 2})).isEqualTo(true);
        Assertions.assertThat(has22.has22(new int[]{4, 2, 4, 2, 2, 5})).isEqualTo(true);
        Assertions.assertThat(has22.has22(new int[]{1, 2})).isEqualTo(false);
        Assertions.assertThat(has22.has22(new int[]{2, 2})).isEqualTo(true);
        Assertions.assertThat(has22.has22(new int[]{2})).isEqualTo(false);
        Assertions.assertThat(has22.has22(new int[]{})).isEqualTo(false);
        Assertions.assertThat(has22.has22(new int[]{3, 3, 2, 2})).isEqualTo(true);
        Assertions.assertThat(has22.has22(new int[]{5, 2, 5, 2})).isEqualTo(false);
    }

}


