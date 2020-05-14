package com.harcyah.kata.exercism.minesweeper;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public final class MinesweeperBoardTest {

    /*
     * See https://github.com/junit-team/junit4/wiki/Rules for information on
     * JUnit Rules in general and ExpectedExceptions in particular.
     */
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void testInputBoardWithNoRowsAndNoColumns() {
        final List<String> inputBoard = Collections.emptyList();
        final List<String> expectedAnnotatedRepresentation = Collections.emptyList();
        final List<String> actualAnnotatedRepresentation = new MinesweeperBoard(inputBoard).getAnnotatedRepresentation();

        assertEquals(expectedAnnotatedRepresentation, actualAnnotatedRepresentation);
    }

    @Test
    public void testInputBoardWithOneRowAndNoColumns() {
        final List<String> inputBoard = Collections.singletonList("");
        final List<String> expectedAnnotatedRepresentation = Collections.singletonList("");
        final List<String> actualAnnotatedRepresentation = new MinesweeperBoard(inputBoard).getAnnotatedRepresentation();

        assertEquals(expectedAnnotatedRepresentation, actualAnnotatedRepresentation);
    }

    @Test
    public void testInputBoardWithNoMines() {
        final List<String> inputBoard = List.of(
                "   ",
                "   ",
                "   ");

        final List<String> expectedAnnotatedRepresentation = List.of(
                "   ",
                "   ",
                "   ");

        final List<String> actualAnnotatedRepresentation = new MinesweeperBoard(inputBoard).getAnnotatedRepresentation();

        assertEquals(expectedAnnotatedRepresentation, actualAnnotatedRepresentation);
    }

    @Test
    public void testInputBoardWithOnlyMines() {
        final List<String> inputBoard = List.of(
                "***",
                "***",
                "***");

        final List<String> expectedAnnotatedRepresentation = List.of(
                "***",
                "***",
                "***");

        final List<String> actualAnnotatedRepresentation = new MinesweeperBoard(inputBoard).getAnnotatedRepresentation();

        assertEquals(expectedAnnotatedRepresentation, actualAnnotatedRepresentation);
    }

    @Test
    public void testInputBoardWithSingleMineAtCenter() {
        final List<String> inputBoard = List.of(
                "   ",
                " * ",
                "   ");

        final List<String> expectedAnnotatedRepresentation = List.of(
                "111",
                "1*1",
                "111");

        final List<String> actualAnnotatedRepresentation = new MinesweeperBoard(inputBoard).getAnnotatedRepresentation();

        assertEquals(expectedAnnotatedRepresentation, actualAnnotatedRepresentation);
    }

    @Test
    public void testInputBoardWithMinesAroundPerimeter() {
        final List<String> inputBoard = List.of(
                "***",
                "* *",
                "***");

        final List<String> expectedAnnotatedRepresentation = List.of(
                "***",
                "*8*",
                "***");

        final List<String> actualAnnotatedRepresentation = new MinesweeperBoard(inputBoard).getAnnotatedRepresentation();

        assertEquals(expectedAnnotatedRepresentation, actualAnnotatedRepresentation);
    }

    @Test
    public void testInputBoardWithSingleRowAndTwoMines() {
        final List<String> inputBoard = Collections.singletonList(
                " * * ");

        final List<String> expectedAnnotatedRepresentation = Collections.singletonList(
                "1*2*1");

        final List<String> actualAnnotatedRepresentation = new MinesweeperBoard(inputBoard).getAnnotatedRepresentation();

        assertEquals(expectedAnnotatedRepresentation, actualAnnotatedRepresentation);
    }

    @Test
    public void testInputBoardWithSingleRowAndTwoMinesAtEdges() {
        final List<String> inputBoard = Collections.singletonList(
                "*   *");

        final List<String> expectedAnnotatedRepresentation = Collections.singletonList(
                "*1 1*");

        final List<String> actualAnnotatedRepresentation = new MinesweeperBoard(inputBoard).getAnnotatedRepresentation();

        assertEquals(expectedAnnotatedRepresentation, actualAnnotatedRepresentation);
    }

    @Test
    public void testInputBoardWithSingleColumnAndTwoMines() {
        final List<String> inputBoard = List.of(
                " ",
                "*",
                " ",
                "*",
                " ");

        final List<String> expectedAnnotatedRepresentation = List.of(
                "1",
                "*",
                "2",
                "*",
                "1");

        final List<String> actualAnnotatedRepresentation = new MinesweeperBoard(inputBoard).getAnnotatedRepresentation();

        assertEquals(expectedAnnotatedRepresentation, actualAnnotatedRepresentation);
    }

    @Test
    public void testInputBoardWithSingleColumnAndTwoMinesAtEdges() {
        final List<String> inputBoard = List.of(
                "*",
                " ",
                " ",
                " ",
                "*");

        final List<String> expectedAnnotatedRepresentation = List.of(
                "*",
                "1",
                " ",
                "1",
                "*");

        final List<String> actualAnnotatedRepresentation = new MinesweeperBoard(inputBoard).getAnnotatedRepresentation();

        assertEquals(expectedAnnotatedRepresentation, actualAnnotatedRepresentation);
    }

    @Test
    public void testInputBoardWithMinesInCross() {
        final List<String> inputBoard = List.of(
                "  *  ",
                "  *  ",
                "*****",
                "  *  ",
                "  *  ");

        final List<String> expectedAnnotatedRepresentation = List.of(
                " 2*2 ",
                "25*52",
                "*****",
                "25*52",
                " 2*2 ");

        final List<String> actualAnnotatedRepresentation = new MinesweeperBoard(inputBoard).getAnnotatedRepresentation();

        assertEquals(expectedAnnotatedRepresentation, actualAnnotatedRepresentation);
    }

    @Test
    public void testLargeInputBoard() {
        final List<String> inputBoard = List.of(
                " *  * ",
                "  *   ",
                "    * ",
                "   * *",
                " *  * ",
                "      ");

        final List<String> expectedAnnotatedRepresentation = List.of(
                "1*22*1",
                "12*322",
                " 123*2",
                "112*4*",
                "1*22*2",
                "111111");

        final List<String> actualAnnotatedRepresentation = new MinesweeperBoard(inputBoard).getAnnotatedRepresentation();

        assertEquals(expectedAnnotatedRepresentation, actualAnnotatedRepresentation);
    }

    @Test
    public void testNullInputBoardIsRejected() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Input board may not be null.");

        new MinesweeperBoard(null);
    }

    @Test
    public void testInputBoardWithInvalidSymbolsIsRejected() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Input board can only contain the characters ' ' and '*'.");

        new MinesweeperBoard(Collections.singletonList(" * & "));
    }

    @Test
    public void testInputBoardWithInconsistentRowLengthsIsRejected() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Input board rows must all have the same number of columns.");

        new MinesweeperBoard(List.of(
                "*",
                "**",
                "* *",
                "*  *",
                "*   *"));
    }

}
