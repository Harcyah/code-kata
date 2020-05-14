package com.harcyah.kata.projecteuler;

import org.junit.Test;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

public class Problem019Test {

    @Test
    public void testCountDays() {
        Problem019 problem = new Problem019();
        LocalDateTime start = LocalDateTime.of(1901, 1, 1, 0, 0);
        LocalDateTime end = LocalDateTime.of(2000, 12, 31, 23, 59);
        int sundaysInTwentiethCentury = problem.countDays(DayOfWeek.SUNDAY, start, end);
        assertThat(sundaysInTwentiethCentury).isEqualTo(171);
    }

}
