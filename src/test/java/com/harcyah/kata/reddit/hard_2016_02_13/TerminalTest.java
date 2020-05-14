package com.harcyah.kata.reddit.hard_2016_02_13;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

public class TerminalTest {

    protected Terminal terminal;

    @Before
    public void setUp() {
        terminal = new Terminal();
    }

    @Test
    public void testConstructor() {
        assertEquals(0, terminal.col);
        assertEquals(0, terminal.row);
        assertEquals(Modes.INSERT, terminal.mode);
    }

    @Test
    public void testMoveTo() {
        terminal.moveTo(5, 8);
        assertEquals(5, terminal.col);
        assertEquals(8, terminal.row);
    }

    @Test
    public void testMoveToBeginningOfLine() {
        terminal.moveTo(5, 8);
        terminal.moveToBeginningOfLine();
        assertEquals(0, terminal.col);
        assertEquals(8, terminal.row);
    }

    @Test
    public void testMoveOneColRight() {
        terminal.moveTo(5, 8);
        terminal.moveOneColRight();
        assertEquals(6, terminal.col);
        assertEquals(8, terminal.row);

        terminal.moveOneColRight();
        terminal.moveOneColRight();
        terminal.moveOneColRight();
        terminal.moveOneColRight();
        terminal.moveOneColRight();
        assertEquals(9, terminal.col);
        assertEquals(8, terminal.row);
    }

    @Test
    public void testMoveOneColLeft() {
        terminal.moveTo(5, 8);
        terminal.moveOneColLeft();
        assertEquals(4, terminal.col);
        assertEquals(8, terminal.row);

        terminal.moveOneColLeft();
        terminal.moveOneColLeft();
        terminal.moveOneColLeft();
        terminal.moveOneColLeft();
        terminal.moveOneColLeft();
        assertEquals(0, terminal.col);
        assertEquals(8, terminal.row);
    }

    @Test
    public void testMoveOneRowDown() {
        terminal.moveTo(8, 5);
        terminal.moveOneRowDown();
        assertEquals(8, terminal.col);
        assertEquals(6, terminal.row);

        terminal.moveOneRowDown();
        terminal.moveOneRowDown();
        terminal.moveOneRowDown();
        terminal.moveOneRowDown();
        terminal.moveOneRowDown();
        assertEquals(8, terminal.col);
        assertEquals(9, terminal.row);
    }

    @Test
    public void testMoveOneRowUp() {
        terminal.moveTo(8, 5);
        terminal.moveOneRowUp();
        assertEquals(8, terminal.col);
        assertEquals(4, terminal.row);

        terminal.moveOneRowUp();
        terminal.moveOneRowUp();
        terminal.moveOneRowUp();
        terminal.moveOneRowUp();
        terminal.moveOneRowUp();
        assertEquals(8, terminal.col);
        assertEquals(0, terminal.row);
    }

    @Test
    public void testEraseRight() throws Exception {
        terminal.buffer[0] = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        terminal.col = 5;
        terminal.eraseRight();
        assertThat(terminal.buffer[0]).isEqualTo(new char[]{'a', 'b', 'c', 'd', 'e', ' ', ' ', ' ', ' ', ' '});
    }

    @Test
    public void testSetModeInsert() throws Exception {
        terminal.setModeInsert();
        assertEquals(Modes.INSERT, terminal.mode);
    }

    @Test
    public void testSetModeOverwrite() throws Exception {
        terminal.setModeOverwrite();
        assertEquals(Modes.OVERWRITE, terminal.mode);
    }

    @Test
    public void testPutCharDependsOnCurrentMode() throws Exception {
        Mode mode = Mockito.mock(Mode.class);
        terminal.mode = mode;
        terminal.putChar('c');
        Mockito.verify(mode).putChar(terminal, 'c');
    }

    @Test
    public void testPutCharInsert() throws Exception {
        terminal.mode = Modes.INSERT;

        // PutChar on empty line
        terminal.putChar('a');
        terminal.putChar('b');
        terminal.putChar('c');
        assertEquals(0, terminal.row);
        assertEquals(3, terminal.col);
        assertEquals("abc       ", new String(terminal.buffer[0]));

        // PutChar on non-empty line
        terminal.moveToBeginningOfLine();
        terminal.putChar('x');
        terminal.putChar('y');
        terminal.putChar('z');
        assertEquals(0, terminal.row);
        assertEquals(3, terminal.col);
        assertEquals("xyzabc    ", new String(terminal.buffer[0]));
    }

    @Test
    public void testPutCharOverwrite() throws Exception {
        terminal.mode = Modes.OVERWRITE;

        // PutChar on empty line
        terminal.putChar('a');
        terminal.putChar('b');
        terminal.putChar('c');
        assertEquals(0, terminal.row);
        assertEquals(3, terminal.col);
        assertEquals("abc       ", new String(terminal.buffer[0]));

        // PutChar on non-empty line
        terminal.moveToBeginningOfLine();
        terminal.putChar('x');
        terminal.putChar('y');
        terminal.putChar('z');
        assertEquals(0, terminal.row);
        assertEquals(3, terminal.col);
        assertEquals("xyz       ", new String(terminal.buffer[0]));
    }

    @Test
    public void testPutCharAtCurrentPosition() throws Exception {
        terminal.moveTo(1, 2);
        terminal.putCharAtCurrentPosition('z');
        assertEquals('z', terminal.buffer[2][1]);
    }

    @Test
    public void testShiftRight() throws Exception {
        terminal.fill('*');
        terminal.row = 0;
        terminal.col = 5;
        terminal.buffer[terminal.row] = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        terminal.shiftRight();
        assertThat(terminal.buffer[0]).isEqualTo(new char[]{'a', 'b', 'c', 'd', 'e', 'e', 'f', 'g', 'h', 'i'});
    }

}
