package com.harcyah.kata.codingbat.array1.has23;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Has23Test {

    @Test
    public void testHas23() {
        Has23 has23 = new Has23();
        Assertions.assertThat(has23.has23(new int[]{2, 5})).isEqualTo(true);
        Assertions.assertThat(has23.has23(new int[]{4, 3})).isEqualTo(true);
        Assertions.assertThat(has23.has23(new int[]{4, 5})).isEqualTo(false);
        Assertions.assertThat(has23.has23(new int[]{2, 2})).isEqualTo(true);
        Assertions.assertThat(has23.has23(new int[]{3, 2})).isEqualTo(true);
        Assertions.assertThat(has23.has23(new int[]{3, 3})).isEqualTo(true);
        Assertions.assertThat(has23.has23(new int[]{7, 7})).isEqualTo(false);
        Assertions.assertThat(has23.has23(new int[]{3, 9})).isEqualTo(true);
        Assertions.assertThat(has23.has23(new int[]{9, 5})).isEqualTo(false);
    }

}
