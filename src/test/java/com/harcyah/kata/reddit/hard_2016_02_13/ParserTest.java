package com.harcyah.kata.reddit.hard_2016_02_13;

import com.harcyah.kata.reddit.hard_2016_02_13.commands.PutCharCommand;
import com.harcyah.kata.reddit.hard_2016_02_13.commands.SpecialCommands;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ParserTest {

    private final Parser parser = new Parser();

    @Test
    public void testParseEmptyInputs() {
        List<Command> commands = parser.parse("");
        assertThat(commands).isEmpty();
    }

    @Test
    public void testParseTwoCommands() {
        List<Command> commands = parser.parse("^h^c");
        assertThat(commands).hasSize(2);
        assertThat(commands.get(0)).isEqualTo(SpecialCommands.MOVE_TO_HEAD);
        assertThat(commands.get(1)).isEqualTo(SpecialCommands.CLEAR);
    }

    @Test
    public void testParseWithPutCharCommands() {
        List<Command> commands = parser.parse("^h^c^iDDD");
        assertThat(commands).hasSize(6);
        assertThat(commands.get(0)).isEqualTo(SpecialCommands.MOVE_TO_HEAD);
        assertThat(commands.get(1)).isEqualTo(SpecialCommands.CLEAR);
        assertThat(commands.get(2)).isEqualTo(SpecialCommands.MODE_INSERT);
        for (int i = 3; i < 6; i++) {
            Command command = commands.get(i);
            assertThat(command).isInstanceOf(PutCharCommand.class);
            PutCharCommand pcc = (PutCharCommand) command;
            assertThat(pcc.getCharacter()).isEqualTo('D');
        }
    }

    @Test
    public void testCanParseExample1() {
        List<Command> commands = parser.parse(Examples.EXAMPLE_1);
        assertThat(commands).isNotEmpty();
        assertThat(commands).filteredOn(x -> x.equals(SpecialCommands.MOVE_ONE_ROW_DOWN)).hasSize(4);
        assertThat(commands.get(commands.size() - 1)).isInstanceOf(PutCharCommand.class);
    }

    @Test
    public void testCanParseExample2() {
        List<Command> commands = parser.parse(Examples.EXAMPLE_2);
        assertThat(commands).isNotEmpty();
        assertThat(commands).filteredOn(x -> x.equals(SpecialCommands.MOVE_ONE_ROW_DOWN)).hasSize(9);
        assertThat(commands.get(commands.size() - 1)).isInstanceOf(PutCharCommand.class);
    }

}
