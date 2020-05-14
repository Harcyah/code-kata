package com.harcyah.kata.codingbat.ap1.sumHeights;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SumHeightsTest {

    @Test
    public void testSumHeights() {
        SumHeights sumHeights = new SumHeights();
        assertThat(sumHeights.sumHeights(new int[]{5, 3, 6, 7, 2}, 2, 4))
            .isEqualTo(6);
        assertThat(sumHeights.sumHeights(new int[]{5, 3, 6, 7, 2}, 0, 1))
            .isEqualTo(2);
        assertThat(sumHeights.sumHeights(new int[]{5, 3, 6, 7, 2}, 0, 4))
            .isEqualTo(11);
        assertThat(sumHeights.sumHeights(new int[]{5, 3, 6, 7, 2}, 1, 1))
            .isEqualTo(0);
        assertThat(sumHeights.sumHeights(new int[]{1, 2, 3, 4, 5, 4, 3, 2, 10}, 0, 3))
            .isEqualTo(3);
        assertThat(sumHeights.sumHeights(new int[]{1, 2, 3, 4, 5, 4, 3, 2, 10}, 4, 8))
            .isEqualTo(11);
        assertThat(sumHeights.sumHeights(new int[]{1, 2, 3, 4, 5, 4, 3, 2, 10}, 7, 8))
            .isEqualTo(8);
        assertThat(sumHeights.sumHeights(new int[]{1, 2, 3, 4, 5, 4, 3, 2, 10}, 8, 8))
            .isEqualTo(0);
        assertThat(sumHeights.sumHeights(new int[]{1, 2, 3, 4, 5, 4, 3, 2, 10}, 2, 2))
            .isEqualTo(0);
        assertThat(sumHeights.sumHeights(new int[]{1, 2, 3, 4, 5, 4, 3, 2, 10}, 3, 6))
            .isEqualTo(3);
        assertThat(sumHeights.sumHeights(new int[]{10, 8, 7, 7, 7, 6, 7}, 1, 4))
            .isEqualTo(1);
        assertThat(sumHeights.sumHeights(new int[]{10, 8, 7, 7, 7, 6, 7}, 1, 5))
            .isEqualTo(2);
    }

}
