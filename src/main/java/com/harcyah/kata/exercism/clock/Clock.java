package com.harcyah.kata.exercism.clock;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Clock {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("HH:mm");

    private LocalTime time;

    public Clock(int hours, int minutes) {
        this.time = LocalTime.of(0, 0).plusHours(hours).plusMinutes(minutes);
    }

    @Override
    public String toString() {
        return this.time.format(FORMATTER);
    }

    public void add(int minutes) {
        this.time = this.time.plusMinutes(minutes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Clock that = (Clock) o;

        return Objects.equals(this.toString(), that.toString());
    }

    @Override
    public int hashCode() {
        return time.hashCode();
    }

}
