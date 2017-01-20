package com.harcyah.kata.reddit.medium_2016_02_17;

public class Board {

    protected static final int SIZE = 8;

    protected Chip[][] cells = new Chip[SIZE][SIZE];

    public Chip getChipAt(int col, int row) {
        return cells[col][row];
    }

    public Chip getChipAt(Square square) {
        return cells[square.col][square.row];
    }

    public void setCellAt(int col, int row, Chip chip) {
        cells[col][row] = chip;
    }

    public boolean hasSquare(Square square) {
        return (square.col >= 0) && (square.col < SIZE) && (square.row >= 0) && (square.row < SIZE);
    }

}
