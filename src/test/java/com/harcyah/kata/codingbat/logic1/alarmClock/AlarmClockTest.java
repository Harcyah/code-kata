package com.harcyah.kata.codingbat.logic1.alarmClock;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class AlarmClockTest {

	@Test
	public void testAlarmClock() {
		AlarmClock alarmClock = new AlarmClock();
		Assertions.assertThat(alarmClock.alarmClock(1, false)).isEqualTo("7:00");
		Assertions.assertThat(alarmClock.alarmClock(5, false)).isEqualTo("7:00");
		Assertions.assertThat(alarmClock.alarmClock(0, false)).isEqualTo("10:00");
		Assertions.assertThat(alarmClock.alarmClock(6, false)).isEqualTo("10:00");
		Assertions.assertThat(alarmClock.alarmClock(0, true)).isEqualTo("off");
		Assertions.assertThat(alarmClock.alarmClock(6, true)).isEqualTo("off");
		Assertions.assertThat(alarmClock.alarmClock(1, true)).isEqualTo("10:00");
		Assertions.assertThat(alarmClock.alarmClock(3, true)).isEqualTo("10:00");
		Assertions.assertThat(alarmClock.alarmClock(5, true)).isEqualTo("10:00");
	}

}
