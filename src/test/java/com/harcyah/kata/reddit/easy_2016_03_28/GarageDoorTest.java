package com.harcyah.kata.reddit.easy_2016_03_28;

import com.google.common.collect.ImmutableList;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.List;

public class GarageDoorTest {

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

		GarageDoor door = new GarageDoor();
		door.process(events);
		Assertions.assertThat(door.state).isEqualTo(State.CLOSED);
	}

}
