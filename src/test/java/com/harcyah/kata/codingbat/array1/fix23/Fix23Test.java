package com.harcyah.kata.codingbat.array1.fix23;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Fix23Test {

    @Test
    public void testFix23() {
        Fix23 fix23 = new Fix23();
        Assertions.assertThat(fix23.fix23(new int[]{1, 2, 3})).isEqualTo(new int[]{1, 2, 0});
        Assertions.assertThat(fix23.fix23(new int[]{2, 3, 5})).isEqualTo(new int[]{2, 0, 5});
        Assertions.assertThat(fix23.fix23(new int[]{1, 2, 1})).isEqualTo(new int[]{1, 2, 1});
        Assertions.assertThat(fix23.fix23(new int[]{3, 2, 1})).isEqualTo(new int[]{3, 2, 1});
        Assertions.assertThat(fix23.fix23(new int[]{2, 2, 3})).isEqualTo(new int[]{2, 2, 0});
        Assertions.assertThat(fix23.fix23(new int[]{2, 3, 3})).isEqualTo(new int[]{2, 0, 3});
    }

}
