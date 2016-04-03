package com.harcyah.kata.reddit.hard_2016_02_13;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class TerminalTest {

	protected Terminal terminal;

	@Before
	public void setUp() {
		terminal = new Terminal();
	}

	@Test
	public void testConstructor() {
		Assert.assertEquals(0, terminal.col);
		Assert.assertEquals(0, terminal.row);
		Assert.assertEquals(Modes.INSERT, terminal.mode);
	}

	@Test
	public void testMoveTo() {
		terminal.moveTo(5, 8);
		Assert.assertEquals(5, terminal.col);
		Assert.assertEquals(8, terminal.row);
	}

	@Test
	public void testMoveToBeginningOfLine() {
		terminal.moveTo(5, 8);
		terminal.moveToBeginningOfLine();
		Assert.assertEquals(0, terminal.col);
		Assert.assertEquals(8, terminal.row);
	}

	@Test
	public void testMoveOneColRight() {
		terminal.moveTo(5, 8);
		terminal.moveOneColRight();
		Assert.assertEquals(6, terminal.col);
		Assert.assertEquals(8, terminal.row);

		terminal.moveOneColRight();
		terminal.moveOneColRight();
		terminal.moveOneColRight();
		terminal.moveOneColRight();
		terminal.moveOneColRight();
		Assert.assertEquals(9, terminal.col);
		Assert.assertEquals(8, terminal.row);
	}

	@Test
	public void testMoveOneColLeft() {
		terminal.moveTo(5, 8);
		terminal.moveOneColLeft();
		Assert.assertEquals(4, terminal.col);
		Assert.assertEquals(8, terminal.row);

		terminal.moveOneColLeft();
		terminal.moveOneColLeft();
		terminal.moveOneColLeft();
		terminal.moveOneColLeft();
		terminal.moveOneColLeft();
		Assert.assertEquals(0, terminal.col);
		Assert.assertEquals(8, terminal.row);
	}

	@Test
	public void testMoveOneRowDown() {
		terminal.moveTo(8, 5);
		terminal.moveOneRowDown();
		Assert.assertEquals(8, terminal.col);
		Assert.assertEquals(6, terminal.row);

		terminal.moveOneRowDown();
		terminal.moveOneRowDown();
		terminal.moveOneRowDown();
		terminal.moveOneRowDown();
		terminal.moveOneRowDown();
		Assert.assertEquals(8, terminal.col);
		Assert.assertEquals(9, terminal.row);
	}

	@Test
	public void testMoveOneRowUp() {
		terminal.moveTo(8, 5);
		terminal.moveOneRowUp();
		Assert.assertEquals(8, terminal.col);
		Assert.assertEquals(4, terminal.row);

		terminal.moveOneRowUp();
		terminal.moveOneRowUp();
		terminal.moveOneRowUp();
		terminal.moveOneRowUp();
		terminal.moveOneRowUp();
		Assert.assertEquals(8, terminal.col);
		Assert.assertEquals(0, terminal.row);
	}

	@Test
	public void testEraseRight() throws Exception {
		terminal.buffer[0] = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j' };
		terminal.col = 5;
		terminal.eraseRight();
		Assertions.assertThat(terminal.buffer[0]).isEqualTo(new char[] { 'a', 'b', 'c', 'd', 'e', ' ', ' ', ' ', ' ', ' ' });
	}

	@Test
	public void testSetModeInsert() throws Exception {
		terminal.setModeInsert();
		Assert.assertEquals(Modes.INSERT, terminal.mode);
	}

	@Test
	public void testSetModeOverwrite() throws Exception {
		terminal.setModeOverwrite();
		Assert.assertEquals(Modes.OVERWRITE, terminal.mode);
	}

	@Test
	public void testPutCharDependsOnCurrentMode() throws Exception {
		Mode mode = Mockito.mock(Mode.class);
		terminal.mode = mode;
		terminal.putChar('c');
		Mockito.verify(mode).putChar(terminal, 'c');
	}

	@Test
	public void testPutCharAtCurrentPosition() throws Exception {
		terminal.moveTo(1, 2);
		terminal.putCharAtCurrentPosition('z');
		Assert.assertEquals('z', terminal.buffer[1][2]);
	}

	@Test
	public void testShiftRight() throws Exception {
		terminal.fill('*');
		terminal.row = 0;
		terminal.col = 5;
		terminal.buffer[terminal.row] = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j' };
		terminal.shiftRight();
		Assertions.assertThat(terminal.buffer[0]).isEqualTo(new char[] { 'a', 'b', 'c', 'd', 'e', 'e', 'f', 'g', 'h', 'i' });
	}

}
