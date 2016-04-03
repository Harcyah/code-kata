package com.harcyah.kata.reddit.hard_2016_02_13;

import java.util.List;

public class Interpretor {

	public void process(Terminal terminal, String input) {
		Parser parser = new Parser();
		List<Command> commands = parser.parse(input);
		for (Command command : commands) {
			command.apply(terminal);
		}
	}

}
