package com.harcyah.kata.projecteuler;

import org.joda.time.DateTime;

public class Problem_019 {

	public int countDays(int dayOfWeek, DateTime start, DateTime end) {
		int days = 0;
		DateTime now = start;
		while (now.isBefore(end)) {
			if (now.getDayOfWeek() == dayOfWeek) {
				days++;
			}
			now = now.plusMonths(1);
		}
		return days;
	}

}
