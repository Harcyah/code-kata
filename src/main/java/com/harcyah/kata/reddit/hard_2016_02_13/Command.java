package com.harcyah.kata.reddit.hard_2016_02_13;

public interface Command {

	String getInput();

	void apply(Terminal terminal);

}
