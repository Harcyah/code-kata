package com.harcyah.kata.codingbat.array1.middleWay;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MiddleWayTest {

    @Test
    public void testMiddleWay() {
        MiddleWay middleWay = new MiddleWay();
        assertThat(middleWay.middleWay(new int[]{1, 2, 3}, new int[]{4, 5, 6}))
            .isEqualTo(new int[]{2, 5});
        assertThat(middleWay.middleWay(new int[]{7, 7, 7}, new int[]{3, 8, 0}))
            .isEqualTo(new int[]{7, 8});
        assertThat(middleWay.middleWay(new int[]{5, 2, 9}, new int[]{1, 4, 5}))
            .isEqualTo(new int[]{2, 4});
        assertThat(middleWay.middleWay(new int[]{1, 9, 7}, new int[]{4, 8, 8}))
            .isEqualTo(new int[]{9, 8});
        assertThat(middleWay.middleWay(new int[]{1, 2, 3}, new int[]{3, 1, 4}))
            .isEqualTo(new int[]{2, 1});
        assertThat(middleWay.middleWay(new int[]{1, 2, 3}, new int[]{4, 1, 1}))
            .isEqualTo(new int[]{2, 1});
    }

}
