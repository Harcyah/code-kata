package com.harcyah.kata.codingbat.array2.tenRun;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TenRunTest {

    @Test
    public void testTenRun() {
        TenRun tenRun = new TenRun();
        assertThat(tenRun.tenRun(new int[]{2, 10, 3, 4, 20, 5})).isEqualTo(new int[]{2, 10, 10, 10, 20, 20});
        assertThat(tenRun.tenRun(new int[]{10, 1, 20, 2})).isEqualTo(new int[]{10, 10, 20, 20});
        assertThat(tenRun.tenRun(new int[]{10, 1, 9, 20})).isEqualTo(new int[]{10, 10, 10, 20});
        assertThat(tenRun.tenRun(new int[]{1, 2, 50, 1})).isEqualTo(new int[]{1, 2, 50, 50});
        assertThat(tenRun.tenRun(new int[]{1, 20, 50, 1})).isEqualTo(new int[]{1, 20, 50, 50});
        assertThat(tenRun.tenRun(new int[]{10, 10})).isEqualTo(new int[]{10, 10});
        assertThat(tenRun.tenRun(new int[]{10, 2})).isEqualTo(new int[]{10, 10});
        assertThat(tenRun.tenRun(new int[]{0, 2})).isEqualTo(new int[]{0, 0});
        assertThat(tenRun.tenRun(new int[]{1, 2})).isEqualTo(new int[]{1, 2});
        assertThat(tenRun.tenRun(new int[]{1})).isEqualTo(new int[]{1});
        assertThat(tenRun.tenRun(new int[]{})).isEqualTo(new int[]{});
    }

}
