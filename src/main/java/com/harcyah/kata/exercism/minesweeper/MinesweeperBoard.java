package com.harcyah.kata.exercism.minesweeper;

import java.util.ArrayList;
import java.util.List;

public final class MinesweeperBoard {

    private static final int MINE_INT = -999;
    private static final int VOID_INT = 0;

    private static final char MINE_CHAR = '*';
    private static final char VOID_CHAR = ' ';

    private final int rows;
    private final int cols;

    private final int[][] board;

    public MinesweeperBoard(List<String> inputBoard) {
        if (inputBoard == null) {
            throw new IllegalArgumentException("Input board may not be null.");
        }

        if (inputBoard.isEmpty()) {
            this.rows = 0;
            this.cols = 0;
            this.board = new int[rows][cols];
        } else {
            this.rows = inputBoard.size();
            this.cols = inputBoard.get(0).length();
            this.board = new int[rows][cols];

            if (!inputBoard.stream().allMatch(x -> x.length() == this.cols)) {
                throw new IllegalArgumentException("Input board rows must all have the same number of columns.");
            }

            for (int row = 0; row < rows; row++) {
                String line = inputBoard.get(row);
                for (int col = 0; col < line.length(); col++) {
                    Character c = line.charAt(col);
                    if (c.equals(MINE_CHAR)) {
                        board[row][col] = MINE_INT;
                    } else if (c.equals(VOID_CHAR)) {
                        board[row][col] = VOID_INT;
                    } else {
                        throw new IllegalArgumentException("Input board can only contain the characters ' ' and '*'.");
                    }
                }
            }

            for (int row = 0; row < rows; row++) {
                for (int col = 0; col < cols; col++) {
                    if (this.board[row][col] == MINE_INT) {
                        continue;
                    }

                    this.board[row][col] = get(row - 1, col - 1) +
                            get(row - 1, col) +
                            get(row - 1, col + 1) +
                            get(row, col - 1) +
                            get(row, col + 1) +
                            get(row + 1, col - 1) +
                            get(row + 1, col) +
                            get(row + 1, col + 1);
                }
            }
        }
    }

    private int get(int row, int col) {
        try {
            int cell = this.board[row][col];
            return (cell == MINE_INT) ? 1 : 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            return 0;
        }
    }

    public List<String> getAnnotatedRepresentation() {
        List<String> representation = new ArrayList<>();
        for (int row = 0; row < rows; row++) {
            StringBuilder sb = new StringBuilder();
            for (int col = 0; col < cols; col++) {
                int mines = board[row][col];
                if (mines == MINE_INT) {
                    sb.append(MINE_CHAR);
                } else if (mines == VOID_INT) {
                    sb.append(VOID_CHAR);
                } else {
                    sb.append(mines);
                }

            }
            representation.add(sb.toString());
        }
        return representation;
    }

}