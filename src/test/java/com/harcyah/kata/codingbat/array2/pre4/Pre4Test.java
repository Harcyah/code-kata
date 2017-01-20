package com.harcyah.kata.codingbat.array2.pre4;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Pre4Test {

    @Test
    public void testPre4() {
        Pre4 pre4 = new Pre4();
        Assertions.assertThat(pre4.pre4(new int[]{1, 2, 4, 1})).isEqualTo(new int[]{1, 2});
        Assertions.assertThat(pre4.pre4(new int[]{3, 1, 4})).isEqualTo(new int[]{3, 1});
        Assertions.assertThat(pre4.pre4(new int[]{1, 4, 4})).isEqualTo(new int[]{1});
        Assertions.assertThat(pre4.pre4(new int[]{1, 4, 4, 2})).isEqualTo(new int[]{1});
        Assertions.assertThat(pre4.pre4(new int[]{1, 3, 4, 2, 4})).isEqualTo(new int[]{1, 3});
        Assertions.assertThat(pre4.pre4(new int[]{4, 4})).isEqualTo(new int[]{});
        Assertions.assertThat(pre4.pre4(new int[]{3, 3, 4})).isEqualTo(new int[]{3, 3});
        Assertions.assertThat(pre4.pre4(new int[]{1, 2, 1, 4})).isEqualTo(new int[]{1, 2, 1});
        Assertions.assertThat(pre4.pre4(new int[]{2, 1, 4, 2})).isEqualTo(new int[]{2, 1});
        Assertions.assertThat(pre4.pre4(new int[]{2, 1, 2, 1, 4, 2})).isEqualTo(new int[]{2, 1, 2, 1});
    }

}
