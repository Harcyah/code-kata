package com.harcyah.kata.codingbat.array3.seriesUp;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SeriesUpTest {

    @Test
    public void testSeriesUp() {
        SeriesUp seriesUp = new SeriesUp();
        Assertions.assertThat(seriesUp.seriesUp(3)).isEqualTo(new int[]{
                1,
                1, 2,
                1, 2, 3});
        Assertions.assertThat(seriesUp.seriesUp(4)).isEqualTo(new int[]{
                1,
                1, 2,
                1, 2, 3,
                1, 2, 3, 4});
        Assertions.assertThat(seriesUp.seriesUp(2)).isEqualTo(new int[]{
                1,
                1, 2});
        Assertions.assertThat(seriesUp.seriesUp(1)).isEqualTo(new int[]{
                1});
        Assertions.assertThat(seriesUp.seriesUp(0)).isEqualTo(new int[]{});
        Assertions.assertThat(seriesUp.seriesUp(6)).isEqualTo(new int[]{
                1,
                1, 2,
                1, 2, 3,
                1, 2, 3, 4,
                1, 2, 3, 4, 5,
                1, 2, 3, 4, 5, 6});
    }

}
