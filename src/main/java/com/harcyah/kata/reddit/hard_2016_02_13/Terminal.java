package com.harcyah.kata.reddit.hard_2016_02_13;

import java.util.Arrays;

public class Terminal {

    protected static final int SIZE = 10;
    protected static final char DEFAULT_VALUE = ' ';

    protected int col;
    protected int row;
    protected Mode mode;

    protected char[][] buffer;

    public Terminal() {
        col = 0;
        row = 0;
        mode = Modes.INSERT;
        clear();
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public void clear() {
        fill(DEFAULT_VALUE);
    }

    public void fill(char c) {
        buffer = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            Arrays.fill(buffer[i], c);
        }
    }

    public void moveTo(int col, int row) {
        this.col = col;
        this.row = row;
    }

    public void moveToBeginningOfLine() {
        col = 0;
    }

    public void moveOneColRight() {
        col = Math.min(SIZE - 1, col + 1);
    }

    public void moveOneColLeft() {
        col = Math.max(0, col - 1);
    }

    public void moveOneRowDown() {
        row = Math.min(SIZE - 1, row + 1);
    }

    public void moveOneRowUp() {
        row = Math.max(0, row - 1);
    }

    public void eraseRight() {
        Arrays.fill(buffer[row], col, SIZE, DEFAULT_VALUE);
    }

    public void setModeInsert() {
        mode = Modes.INSERT;
    }

    public void setModeOverwrite() {
        mode = Modes.OVERWRITE;
    }

    public void putChar(char c) {
        mode.putChar(this, c);
    }

    protected void putCharAtCurrentPosition(char c) {
        buffer[row][col] = c;
    }

    public void shiftRight() {
        for (int i = SIZE - 1; i >= col; i--) {
            buffer[row][i] = buffer[row][Math.max(0, i - 1)];
        }
    }

    @Override
    public String toString() {
        return toString(System.lineSeparator(), " ");
    }

    public String toString(String rowSeparator, String colSeparator) {
        StringBuffer out = new StringBuffer();
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                out.append(buffer[row][col]);
                out.append(colSeparator);
            }
            out.append(rowSeparator);
        }
        return out.toString();
    }

}
