package com.harcyah.kata.reddit.hard_2016_02_13;

import com.harcyah.kata.reddit.hard_2016_02_13.commands.PutCharCommand;
import com.harcyah.kata.reddit.hard_2016_02_13.commands.SpecialCommands;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.List;

public class ParserTest {

	Parser parser = new Parser();

	@Test
	public void testParseEmptyInputs() throws Exception {
		List<Command> commands = parser.parse("");
		Assertions.assertThat(commands).isEmpty();
	}

	@Test
	public void testParseTwoCommands() throws Exception {
		List<Command> commands = parser.parse("^h^c");
		Assertions.assertThat(commands).hasSize(2);
		Assertions.assertThat(commands.get(0)).isEqualTo(SpecialCommands.MOVE_TO_HEAD);
		Assertions.assertThat(commands.get(1)).isEqualTo(SpecialCommands.CLEAR);
	}

	@Test
	public void testParseWithPutCharCommands() throws Exception {
		List<Command> commands = parser.parse("^h^c^iDDD");
		Assertions.assertThat(commands).hasSize(6);
		Assertions.assertThat(commands.get(0)).isEqualTo(SpecialCommands.MOVE_TO_HEAD);
		Assertions.assertThat(commands.get(1)).isEqualTo(SpecialCommands.CLEAR);
		Assertions.assertThat(commands.get(2)).isEqualTo(SpecialCommands.MODE_INSERT);
		for (int i = 3; i < 6; i++) {
			Command command = commands.get(i);
			Assertions.assertThat(command).isInstanceOf(PutCharCommand.class);
			PutCharCommand pcc = (PutCharCommand) command;
			Assertions.assertThat(pcc.getCharacter()).isEqualTo('D');
		}
	}

	@Test
	public void testCanParseExample1() throws Exception {
		List<Command> commands = parser.parse(Examples.EXAMPLE_1);
		Assertions.assertThat(commands).isNotEmpty();
		Assertions.assertThat(commands).filteredOn(x -> x.equals(SpecialCommands.MOVE_ONE_ROW_DOWN)).hasSize(4);
		Assertions.assertThat(commands.get(commands.size() - 1)).isInstanceOf(PutCharCommand.class);
	}

	@Test
	public void testCanParseExample2() throws Exception {
		List<Command> commands = parser.parse(Examples.EXAMPLE_2);
		Assertions.assertThat(commands).isNotEmpty();
		Assertions.assertThat(commands).filteredOn(x -> x.equals(SpecialCommands.MOVE_ONE_ROW_DOWN)).hasSize(9);
		Assertions.assertThat(commands.get(commands.size() - 1)).isInstanceOf(PutCharCommand.class);
	}

}
