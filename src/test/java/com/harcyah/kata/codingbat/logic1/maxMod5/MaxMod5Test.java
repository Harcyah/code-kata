package com.harcyah.kata.codingbat.logic1.maxMod5;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class MaxMod5Test {

    @Test
    public void testMaxMod5() {
        MaxMod5 maxMod5 = new MaxMod5();
        Assertions.assertThat(maxMod5.maxMod5(2, 3)).isEqualTo(3);
        Assertions.assertThat(maxMod5.maxMod5(6, 2)).isEqualTo(6);
        Assertions.assertThat(maxMod5.maxMod5(3, 2)).isEqualTo(3);
        Assertions.assertThat(maxMod5.maxMod5(8, 12)).isEqualTo(12);
        Assertions.assertThat(maxMod5.maxMod5(7, 12)).isEqualTo(7);
        Assertions.assertThat(maxMod5.maxMod5(11, 6)).isEqualTo(6);
        Assertions.assertThat(maxMod5.maxMod5(2, 7)).isEqualTo(2);
        Assertions.assertThat(maxMod5.maxMod5(7, 7)).isEqualTo(0);
        Assertions.assertThat(maxMod5.maxMod5(9, 1)).isEqualTo(9);
        Assertions.assertThat(maxMod5.maxMod5(9, 14)).isEqualTo(9);
        Assertions.assertThat(maxMod5.maxMod5(1, 2)).isEqualTo(2);
    }

}
