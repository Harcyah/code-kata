package com.harcyah.kata.reddit.hard_2016_02_13;

import java.util.List;
import java.util.Map;

import org.assertj.core.util.Lists;

import com.google.common.collect.Maps;
import com.harcyah.kata.reddit.hard_2016_02_13.commands.MoveToCommand;
import com.harcyah.kata.reddit.hard_2016_02_13.commands.PutCharCommand;
import com.harcyah.kata.reddit.hard_2016_02_13.commands.SpecialCommands;

public class Parser {

	public List<Command> parse(String input) {
		Map<String, SpecialCommands> specials = Maps.newHashMap();
		for (SpecialCommands command : SpecialCommands.values()) {
			specials.put(command.getInput(), command);
		}

		List<Command> commands = Lists.newArrayList();
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (c == '^') {
				String twoCharsCommand = input.substring(i, i + 2);
				SpecialCommands special = specials.get(twoCharsCommand);
				if (special != null) {
					commands.add(special);
					i += 1;
				} else {
					char a = input.charAt(i + 1);
					char b = input.charAt(i + 2);
					int row = Character.getNumericValue(a);
					int col = Character.getNumericValue(b);
					commands.add(new MoveToCommand(col, row));
					i += 2;
				}
			} else {
				commands.add(new PutCharCommand(c));
			}
		}
		return commands;
	}

}
