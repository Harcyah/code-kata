package com.harcyah.kata.reddit.hard_2016_02_13.commands;

import com.harcyah.kata.reddit.hard_2016_02_13.Command;
import com.harcyah.kata.reddit.hard_2016_02_13.Terminal;

public class MoveToCommand implements Command {

	protected int col;
	protected int row;

	public MoveToCommand(int col, int row) {
		this.col = col;
		this.row = row;
	}

	@Override
	public String getInput() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void apply(Terminal terminal) {
		terminal.moveTo(col, row);
	}

}
