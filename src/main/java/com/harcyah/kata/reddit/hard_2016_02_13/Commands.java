package com.harcyah.kata.reddit.hard_2016_02_13;

public enum Commands implements Command {

	CLEAR {

		@Override
		public String getInput() {
			return "^c";
		}

		@Override
		public void apply(Terminal terminal) {
			terminal.clear();
		}

	},

	MOVE_TO_X_Y {

		@Override
		public String getInput() {
			return "^h";
		}

		@Override
		public void apply(Terminal terminal) {
			terminal.moveTo(0, 0);
		}

	},

	MOVE_TO_LINE_START {

		@Override
		public String getInput() {
			return "^b";
		}

		@Override
		public void apply(Terminal terminal) {
			terminal.moveToBeginningOfLine();
		}

	},

	MOVE_ONE_ROW_UP {

		@Override
		public String getInput() {
			return "^u";
		}

		@Override
		public void apply(Terminal terminal) {
			terminal.moveOneRowUp();
		}

	},

	MOVE_ONE_ROW_DOWN {

		@Override
		public String getInput() {
			return "^d";
		}

		@Override
		public void apply(Terminal terminal) {
			terminal.moveOneRowDown();
		}

	},

	MOVE_ONE_COL_LEFT {

		@Override
		public String getInput() {
			return "^l";
		}

		@Override
		public void apply(Terminal terminal) {
			terminal.moveOneColLeft();
		}

	},

	MOVE_ONE_COL_RIGHT {

		@Override
		public String getInput() {
			return "^r";
		}

		@Override
		public void apply(Terminal terminal) {
			terminal.moveOneColRight();
		}

	},

	ERASE_RIGHT {

		@Override
		public String getInput() {
			return "^e";
		}

		@Override
		public void apply(Terminal terminal) {
			terminal.eraseRight();
		}

	},

	MODE_INSERT {

		@Override
		public String getInput() {
			return "^i";
		}

		@Override
		public void apply(Terminal terminal) {
			terminal.setModeInsert();
		}

	},

	MODE_OVERWRITE {

		@Override
		public String getInput() {
			return "^o";
		}

		@Override
		public void apply(Terminal terminal) {
			terminal.setModeOverwrite();
		}

	},

	WRITE_CIRCUMFLEX {

		@Override
		public String getInput() {
			return "^^";
		}

		@Override
		public void apply(Terminal terminal) {
			terminal.putChar('^');
		}

	}

}
