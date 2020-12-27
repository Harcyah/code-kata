package com.harcyah.kata.reddit.medium_2016_02_17;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

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
    }

    @Test
    public void testGetPossibleMovesSample2() throws Exception {
        Reversi reversi = new Reversi("sample2");
        Set<Square> moves = reversi.getPossibleMoves();
        assertThat(moves).hasSize(11);
    }

    @Test
    public void testGetPossibleMovesSample3() throws Exception {
        Reversi reversi = new Reversi("sample3");
        Set<Square> moves = reversi.getPossibleMoves();
        assertThat(moves).hasSize(12);
    }

}
