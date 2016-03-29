package com.harcyah.kata.reddit.easy_2016_03_28;

public class EventCycleComplete implements Event {

	@Override
	public void apply(GarageDoorOpening door) {
		door.onCycleComplete();
	}

}
