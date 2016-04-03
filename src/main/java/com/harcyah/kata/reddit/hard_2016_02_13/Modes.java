package com.harcyah.kata.reddit.hard_2016_02_13;

public enum Modes implements Mode {

	INSERT {

		@Override
		public void putChar(Terminal terminal, char c) {
			terminal.shiftRight();
			terminal.putCharAtCurrentPosition(c);
		}

	},
	OVERWRITE {

		@Override
		public void putChar(Terminal terminal, char c) {
			terminal.putCharAtCurrentPosition(c);
		}

	}

}
