package com.harcyah.kata.codingbat.logic1.sortaSum;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SortaSumTest {

    @Test
    public void testSortaSum() {
        SortaSum sortaSum = new SortaSum();
        assertThat(sortaSum.sortaSum(3, 4)).isEqualTo(7);
        assertThat(sortaSum.sortaSum(9, 4)).isEqualTo(20);
        assertThat(sortaSum.sortaSum(10, 11)).isEqualTo(21);
        assertThat(sortaSum.sortaSum(12, -3)).isEqualTo(9);
        assertThat(sortaSum.sortaSum(-3, 12)).isEqualTo(9);
        assertThat(sortaSum.sortaSum(4, 5)).isEqualTo(9);
        assertThat(sortaSum.sortaSum(4, 6)).isEqualTo(20);
        assertThat(sortaSum.sortaSum(14, 7)).isEqualTo(21);
        assertThat(sortaSum.sortaSum(14, 6)).isEqualTo(20);
    }

}
