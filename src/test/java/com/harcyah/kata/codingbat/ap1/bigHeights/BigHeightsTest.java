package com.harcyah.kata.codingbat.ap1.bigHeights;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class BigHeightsTest {

    @Test
    public void testBigHeights() {
        BigHeights bigHeights = new BigHeights();
        Assertions.assertThat(bigHeights.bigHeights(new int[]{5, 3, 6, 7, 2}, 2, 4)).isEqualTo(1);
        Assertions.assertThat(bigHeights.bigHeights(new int[]{5, 3, 6, 7, 2}, 0, 1)).isEqualTo(0);
        Assertions.assertThat(bigHeights.bigHeights(new int[]{5, 3, 6, 7, 2}, 0, 4)).isEqualTo(1);
        Assertions.assertThat(bigHeights.bigHeights(new int[]{5, 3, 6, 7, 3}, 0, 4)).isEqualTo(0);
        Assertions.assertThat(bigHeights.bigHeights(new int[]{5, 3, 6, 7, 2}, 1, 1)).isEqualTo(0);
        Assertions.assertThat(bigHeights.bigHeights(new int[]{5, 13, 6, 7, 2}, 1, 2)).isEqualTo(1);
        Assertions.assertThat(bigHeights.bigHeights(new int[]{5, 13, 6, 7, 2}, 0, 2)).isEqualTo(2);
        Assertions.assertThat(bigHeights.bigHeights(new int[]{5, 13, 6, 7, 2}, 1, 4)).isEqualTo(2);
        Assertions.assertThat(bigHeights.bigHeights(new int[]{5, 13, 6, 7, 2}, 0, 4)).isEqualTo(3);
        Assertions.assertThat(bigHeights.bigHeights(new int[]{5, 13, 6, 7, 2}, 0, 3)).isEqualTo(2);
        Assertions.assertThat(bigHeights.bigHeights(new int[]{1, 2, 3, 4, 5, 4, 3, 2, 10}, 0, 3)).isEqualTo(0);
        Assertions.assertThat(bigHeights.bigHeights(new int[]{1, 2, 3, 4, 5, 4, 3, 2, 10}, 4, 8)).isEqualTo(1);
        Assertions.assertThat(bigHeights.bigHeights(new int[]{1, 2, 3, 14, 5, 4, 3, 2, 10}, 0, 3)).isEqualTo(1);
        Assertions.assertThat(bigHeights.bigHeights(new int[]{1, 2, 3, 14, 5, 4, 3, 2, 10}, 7, 8)).isEqualTo(1);
        Assertions.assertThat(bigHeights.bigHeights(new int[]{1, 2, 3, 14, 5, 4, 3, 2, 10}, 3, 8)).isEqualTo(2);
        Assertions.assertThat(bigHeights.bigHeights(new int[]{1, 2, 3, 14, 5, 4, 3, 2, 10}, 2, 8)).isEqualTo(3);
    }

}
