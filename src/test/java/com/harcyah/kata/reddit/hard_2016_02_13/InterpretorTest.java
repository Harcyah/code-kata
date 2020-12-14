package com.harcyah.kata.reddit.hard_2016_02_13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InterpretorTest {

    @Test
    public void testRedditInputOne() {
        // Given
        Terminal terminal = new Terminal();
        Interpretor interpretor = new Interpretor();

        // When
        interpretor.process(terminal, Examples.EXAMPLE_1);

        // Then
        assertEquals(Examples.RESULTS_1, terminal.toString("", ""));
    }

    @Test
    public void testRedditInputTwo() {
        // Given
        Terminal terminal = new Terminal();
        Interpretor interpretor = new Interpretor();

        // When
        interpretor.process(terminal, Examples.EXAMPLE_2);

        // Then
        assertEquals(Examples.RESULTS_2, terminal.toString("", ""));
    }

}
