package com.harcyah.kata.reddit.easy_2016_03_28;

public enum State implements EventHandler {

	CLOSED {

		@Override
		public void onButton(GarageDoor door) {
			door.state = OPENING;
		}

		@Override
		public void onCycleComplete(GarageDoor door) {
			throw new UnsupportedOperationException();
		}

	},

	CLOSING {

		@Override
		public void onButton(GarageDoor door) {
			door.state = STOPPED_WHILE_CLOSING;
		}

		@Override
		public void onCycleComplete(GarageDoor door) {
			door.state = CLOSED;
		}

	},

	STOPPED_WHILE_CLOSING {

		@Override
		public void onButton(GarageDoor door) {
			door.state = OPENING;
		}

		@Override
		public void onCycleComplete(GarageDoor door) {
			throw new UnsupportedOperationException();
		}

	},

	OPEN {

		@Override
		public void onButton(GarageDoor door) {
			door.state = CLOSING;
		}

		@Override
		public void onCycleComplete(GarageDoor door) {
			throw new UnsupportedOperationException();
		}

	},

	OPENING {

		@Override
		public void onButton(GarageDoor door) {
			door.state = STOPPED_WHILE_OPENING;
		}

		@Override
		public void onCycleComplete(GarageDoor door) {
			door.state = OPEN;
		}

	},

	STOPPED_WHILE_OPENING {

		@Override
		public void onButton(GarageDoor door) {
			door.state = State.CLOSING;
		}

		@Override
		public void onCycleComplete(GarageDoor door) {
			throw new UnsupportedOperationException();
		}

	}
}
