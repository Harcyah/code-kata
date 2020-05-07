package com.harcyah.kata.projecteuler;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class Problem_019 {

    public int countDays(DayOfWeek dayOfWeek, LocalDateTime start, LocalDateTime end) {
        int days = 0;
        LocalDateTime now = start;
        while (now.isBefore(end)) {
            if (now.getDayOfWeek() == dayOfWeek) {
                days++;
            }
            now = now.plusMonths(1);
        }
        return days;
    }

}
