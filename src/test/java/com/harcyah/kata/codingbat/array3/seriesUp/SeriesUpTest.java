package com.harcyah.kata.codingbat.array3.seriesUp;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SeriesUpTest {

    @Test
    public void testSeriesUp() {
        SeriesUp seriesUp = new SeriesUp();

        assertThat(seriesUp.seriesUp(3))
            .isEqualTo(new int[]{
                1,
                1, 2,
                1, 2, 3});

        assertThat(seriesUp.seriesUp(4))
            .isEqualTo(new int[]{
                1,
                1, 2,
                1, 2, 3,
                1, 2, 3, 4});

        assertThat(seriesUp.seriesUp(2))
            .isEqualTo(new int[]{
                1,
                1, 2});
        assertThat(seriesUp.seriesUp(1))
            .isEqualTo(new int[]{
                1});
        assertThat(seriesUp.seriesUp(0))
            .isEqualTo(new int[]{});

        assertThat(seriesUp.seriesUp(6))
            .isEqualTo(new int[]{
                1,
                1, 2,
                1, 2, 3,
                1, 2, 3, 4,
                1, 2, 3, 4, 5,
                1, 2, 3, 4, 5, 6});
    }

}
