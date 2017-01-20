package com.harcyah.kata.codingbat.array2.tenRun;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class TenRunTest {

    @Test
    public void testTenRun() {
        TenRun tenRun = new TenRun();
        Assertions.assertThat(tenRun.tenRun(new int[]{2, 10, 3, 4, 20, 5})).isEqualTo(new int[]{2, 10, 10, 10, 20, 20});
        Assertions.assertThat(tenRun.tenRun(new int[]{10, 1, 20, 2})).isEqualTo(new int[]{10, 10, 20, 20});
        Assertions.assertThat(tenRun.tenRun(new int[]{10, 1, 9, 20})).isEqualTo(new int[]{10, 10, 10, 20});
        Assertions.assertThat(tenRun.tenRun(new int[]{1, 2, 50, 1})).isEqualTo(new int[]{1, 2, 50, 50});
        Assertions.assertThat(tenRun.tenRun(new int[]{1, 20, 50, 1})).isEqualTo(new int[]{1, 20, 50, 50});
        Assertions.assertThat(tenRun.tenRun(new int[]{10, 10})).isEqualTo(new int[]{10, 10});
        Assertions.assertThat(tenRun.tenRun(new int[]{10, 2})).isEqualTo(new int[]{10, 10});
        Assertions.assertThat(tenRun.tenRun(new int[]{0, 2})).isEqualTo(new int[]{0, 0});
        Assertions.assertThat(tenRun.tenRun(new int[]{1, 2})).isEqualTo(new int[]{1, 2});
        Assertions.assertThat(tenRun.tenRun(new int[]{1})).isEqualTo(new int[]{1});
        Assertions.assertThat(tenRun.tenRun(new int[]{})).isEqualTo(new int[]{});
    }

}
