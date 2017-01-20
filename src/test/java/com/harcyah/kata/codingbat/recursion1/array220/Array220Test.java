package com.harcyah.kata.codingbat.recursion1.array220;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Array220Test {

    @Test
    public void testArray220() {
        Array220 array220 = new Array220();
        Assertions.assertThat(array220.array220(new int[]{1, 2, 20}, 0)).isEqualTo(true);
        Assertions.assertThat(array220.array220(new int[]{3, 30}, 0)).isEqualTo(true);
        Assertions.assertThat(array220.array220(new int[]{3}, 0)).isEqualTo(false);
        Assertions.assertThat(array220.array220(new int[]{}, 0)).isEqualTo(false);
        Assertions.assertThat(array220.array220(new int[]{3, 3, 30, 4}, 0)).isEqualTo(true);
        Assertions.assertThat(array220.array220(new int[]{2, 19, 4}, 0)).isEqualTo(false);
        Assertions.assertThat(array220.array220(new int[]{20, 2, 21}, 0)).isEqualTo(false);
        Assertions.assertThat(array220.array220(new int[]{20, 2, 21, 210}, 0)).isEqualTo(true);
        Assertions.assertThat(array220.array220(new int[]{2, 200, 2000}, 0)).isEqualTo(true);
        Assertions.assertThat(array220.array220(new int[]{0, 0}, 0)).isEqualTo(true);
        Assertions.assertThat(array220.array220(new int[]{1, 2, 3, 4, 5, 6}, 0)).isEqualTo(false);
        Assertions.assertThat(array220.array220(new int[]{1, 2, 3, 4, 5, 50, 6}, 0)).isEqualTo(true);
        Assertions.assertThat(array220.array220(new int[]{1, 2, 3, 4, 5, 51, 6}, 0)).isEqualTo(false);
        Assertions.assertThat(array220.array220(new int[]{1, 2, 3, 4, 4, 50, 500, 6}, 0)).isEqualTo(true);
    }

}
