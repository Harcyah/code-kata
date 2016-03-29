package com.harcyah.kata.reddit.easy_2016_03_28;

import java.util.List;

public class GarageDoorOpening {

	enum State implements ButtonHandler {
		CLOSED {

			@Override
			public void onButton(GarageDoorOpening door) {
				door.state = OPENING;
			}

			@Override
			public void onCycleComplete(GarageDoorOpening door) {
				throw new UnsupportedOperationException();
			}

		},
		CLOSING {

			@Override
			public void onButton(GarageDoorOpening door) {
				door.state = STOPPED_WHILE_CLOSING;
			}

			@Override
			public void onCycleComplete(GarageDoorOpening door) {
				door.state = CLOSED;
			}

		},
		STOPPED_WHILE_CLOSING {

			@Override
			public void onButton(GarageDoorOpening door) {
				door.state = OPENING;
			}

			@Override
			public void onCycleComplete(GarageDoorOpening door) {
				throw new UnsupportedOperationException();
			}

		},
		OPEN {

			@Override
			public void onButton(GarageDoorOpening door) {
				door.state = OPEN;
			}

			@Override
			public void onCycleComplete(GarageDoorOpening door) {
				throw new UnsupportedOperationException();
			}

		},
		OPENING {

			@Override
			public void onButton(GarageDoorOpening door) {
				door.state = STOPPED_WHILE_OPENING;
			}

			@Override
			public void onCycleComplete(GarageDoorOpening door) {
				door.state = OPEN;
			}

		},
		STOPPED_WHILE_OPENING {

			@Override
			public void onButton(GarageDoorOpening door) {
				door.state = State.CLOSING;
			}

			@Override
			public void onCycleComplete(GarageDoorOpening door) {
				throw new UnsupportedOperationException();
			}

		}
	};

	protected State state = State.CLOSED;

	public void process(List<Event> events) {
		for (Event event : events) {
			event.apply(this);
		}
	}

	public void onButton() {
		state.onButton(this);
	}

	public void onCycleComplete() {
		state.onCycleComplete(this);
	}

}
