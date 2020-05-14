package com.harcyah.kata.reddit.medium_2016_02_17;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class ReversiTest {

    @Test
    public void testGetPossibleMovesSample1() throws Exception {
        Reversi reversi = new Reversi("sample1");
        Set<Square> moves = reversi.getPossibleMoves();
        assertThat(moves)
            .hasSize(4)
            .contains(
                new Square(3, 2),
                new Square(2, 3),
                new Square(5, 4),
                new Square(4, 5));
        render(reversi, moves);
    }

    @Test
    public void testGetPossibleMovesSample2() throws Exception {
        Reversi reversi = new Reversi("sample2");
        Set<Square> moves = reversi.getPossibleMoves();
        render(reversi, moves);
        assertThat(moves).hasSize(11);
    }

    @Test
    public void testGetPossibleMovesSample3() throws Exception {
        Reversi reversi = new Reversi("sample3");
        Set<Square> moves = reversi.getPossibleMoves();
        render(reversi, moves);
        assertThat(moves).hasSize(12);
    }

    private String render(Reversi reversi, Set<Square> moves) {
        StringBuilder builder = new StringBuilder();
        builder.append(System.lineSeparator());
        builder.append(" ");
        for (int i = 0; i < Board.SIZE; i++) {
            builder.append(i);
        }
        builder.append(System.lineSeparator());
        for (int i = 0; i < Board.SIZE; i++) {
            builder.append(i);
            for (int j = 0; j < Board.SIZE; j++) {
                if (moves.contains(new Square(i, j))) {
                    builder.append("*");
                } else {
                    Chip chip = reversi.board.cells[i][j];
                    builder.append(chip == null ? "-" : chip.name());
                }
            }
            builder.append(System.lineSeparator());
        }
        builder.append(System.lineSeparator());
        return builder.toString();
    }

}
