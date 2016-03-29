package com.harcyah.kata.reddit.easy_2016_03_28;

import com.google.common.collect.ImmutableList;
import com.harcyah.kata.reddit.easy_2016_03_28.GarageDoorOpening.State;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.List;

public class GarageDoorOpeningTest {

	@Test
	public void testGarageDoorOpening() {
		List<Event> events = ImmutableList.of(
			new EventButton(),
			new EventCycleComplete(),
			new EventButton(),
			new EventButton(),
			new EventButton(),
			new EventButton(),
			new EventButton(),
			new EventCycleComplete());

		GarageDoorOpening door = new GarageDoorOpening();
		door.process(events);
		Assertions.assertThat(door.state).isEqualTo(State.CLOSED);
	}

}
