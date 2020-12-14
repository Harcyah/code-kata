package com.harcyah.kata.codingbat.logic1.alarmClock;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AlarmClockTest {

    @Test
    public void testAlarmClock() {
        AlarmClock alarmClock = new AlarmClock();
        assertThat(alarmClock.alarmClock(1, false)).isEqualTo("7:00");
        assertThat(alarmClock.alarmClock(5, false)).isEqualTo("7:00");
        assertThat(alarmClock.alarmClock(0, false)).isEqualTo("10:00");
        assertThat(alarmClock.alarmClock(6, false)).isEqualTo("10:00");
        assertThat(alarmClock.alarmClock(0, true)).isEqualTo("off");
        assertThat(alarmClock.alarmClock(6, true)).isEqualTo("off");
        assertThat(alarmClock.alarmClock(1, true)).isEqualTo("10:00");
        assertThat(alarmClock.alarmClock(3, true)).isEqualTo("10:00");
        assertThat(alarmClock.alarmClock(5, true)).isEqualTo("10:00");
    }

}
