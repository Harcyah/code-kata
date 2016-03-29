package com.harcyah.kata.reddit.easy_2016_03_28;

public class EventButton implements Event {

	@Override
	public void apply(GarageDoorOpening door) {
		door.onButton();
	}

}
