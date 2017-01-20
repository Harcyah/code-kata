package com.harcyah.kata.codingbat.ap1.sumHeights2;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SumHeights2Test {

    @Test
    public void testSumHeights2() {
        SumHeights2 sumHeights2 = new SumHeights2();
        Assertions.assertThat(sumHeights2.sumHeights2(new int[]{5, 3, 6, 7, 2}, 2, 4)).isEqualTo(7);
        Assertions.assertThat(sumHeights2.sumHeights2(new int[]{5, 3, 6, 7, 2}, 0, 1)).isEqualTo(2);
        Assertions.assertThat(sumHeights2.sumHeights2(new int[]{5, 3, 6, 7, 2}, 0, 4)).isEqualTo(15);
        Assertions.assertThat(sumHeights2.sumHeights2(new int[]{5, 3, 6, 7, 2}, 1, 1)).isEqualTo(0);
        Assertions.assertThat(sumHeights2.sumHeights2(new int[]{1, 2, 3, 4, 5, 4, 3, 2, 10}, 0, 3)).isEqualTo(6);
        Assertions.assertThat(sumHeights2.sumHeights2(new int[]{1, 2, 3, 4, 5, 4, 3, 2, 10}, 4, 8)).isEqualTo(19);
        Assertions.assertThat(sumHeights2.sumHeights2(new int[]{1, 2, 3, 4, 5, 4, 3, 2, 10}, 7, 8)).isEqualTo(16);
        Assertions.assertThat(sumHeights2.sumHeights2(new int[]{1, 2, 3, 4, 5, 4, 3, 2, 10}, 8, 8)).isEqualTo(0);
        Assertions.assertThat(sumHeights2.sumHeights2(new int[]{1, 2, 3, 4, 5, 4, 3, 2, 10}, 2, 2)).isEqualTo(0);
        Assertions.assertThat(sumHeights2.sumHeights2(new int[]{1, 2, 3, 4, 5, 4, 3, 2, 10}, 3, 6)).isEqualTo(4);
        Assertions.assertThat(sumHeights2.sumHeights2(new int[]{10, 8, 7, 7, 7, 6, 7}, 1, 4)).isEqualTo(1);
        Assertions.assertThat(sumHeights2.sumHeights2(new int[]{10, 8, 7, 7, 7, 6, 7}, 1, 5)).isEqualTo(2);
    }

}
