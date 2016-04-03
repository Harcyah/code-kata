package com.harcyah.kata.reddit.hard_2016_02_13.commands;

import com.harcyah.kata.reddit.hard_2016_02_13.Command;
import com.harcyah.kata.reddit.hard_2016_02_13.Terminal;

public class PutCharCommand implements Command {

	protected char character;

	public PutCharCommand(char character) {
		this.character = character;
	}

	public char getCharacter() {
		return character;
	}

	@Override
	public String getInput() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void apply(Terminal terminal) {
		terminal.putChar(character);
	}

}
