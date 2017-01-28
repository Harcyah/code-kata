package com.harcyah.kata.reddit.easy_2016_03_28;

import java.util.List;

public class GarageDoor {

	protected State state = State.CLOSED;

	public void process(List<Event> events) {
		for (Event event : events) {
			event.apply(this);
		}
	}

}
