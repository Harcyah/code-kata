package com.harcyah.kata.codingbat.array1.double23;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Double23Test {

    @Test
    public void testDouble23() {
        Double23 double23 = new Double23();
        Assertions.assertThat(double23.double23(new int[]{2, 2})).isEqualTo(true);
        Assertions.assertThat(double23.double23(new int[]{3, 3})).isEqualTo(true);
        Assertions.assertThat(double23.double23(new int[]{2, 3})).isEqualTo(false);
        Assertions.assertThat(double23.double23(new int[]{3, 2})).isEqualTo(false);
        Assertions.assertThat(double23.double23(new int[]{4, 5})).isEqualTo(false);
        Assertions.assertThat(double23.double23(new int[]{2})).isEqualTo(false);
        Assertions.assertThat(double23.double23(new int[]{3})).isEqualTo(false);
        Assertions.assertThat(double23.double23(new int[]{})).isEqualTo(false);
        Assertions.assertThat(double23.double23(new int[]{3, 4})).isEqualTo(false);
    }

}
