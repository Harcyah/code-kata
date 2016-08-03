package com.harcyah.kata.exercism.gigasecond;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Gigasecond {

	private static final LocalTime DEFAULT_TIME = LocalTime.MIDNIGHT;

	protected LocalDateTime dob;

	public Gigasecond(LocalDate date) {
		this.dob = LocalDateTime.of(date, DEFAULT_TIME);
	}

	public Gigasecond(LocalDateTime dob) {
		this.dob = dob;
	}

	public LocalDateTime getDate() {
		return dob.plusSeconds(1000000000);
	}

}