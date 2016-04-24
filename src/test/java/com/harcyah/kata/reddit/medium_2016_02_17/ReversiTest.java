package com.harcyah.kata.reddit.medium_2016_02_17;

import java.util.Set;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class ReversiTest {

	@Test
	public void testGetPossibleMovesSample1() throws Exception {
		Reversi reversi = new Reversi("sample1");
		Set<Square> moves = reversi.getPossibleMoves();
		Assertions.assertThat(moves)
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
		Assertions.assertThat(moves).hasSize(11);
	}

	@Test
	public void testGetPossibleMovesSample3() throws Exception {
		Reversi reversi = new Reversi("sample3");
		Set<Square> moves = reversi.getPossibleMoves();
		render(reversi, moves);
		Assertions.assertThat(moves).hasSize(12);
	}

	private void render(Reversi reversi, Set<Square> moves) {
		System.out.println();
		System.out.print(" ");
		for (int i = 0; i < Board.SIZE; i++) {
			System.out.print(i);
		}
		System.out.println();
		for (int i = 0; i < Board.SIZE; i++) {
			System.out.print(i);
			for (int j = 0; j < Board.SIZE; j++) {
				if (moves.contains(new Square(i, j))) {
					System.out.print("*");
				} else {
					Chip chip = reversi.board.cells[i][j];
					System.out.print(chip == null ? "-" : chip.name());
				}
			}
			System.out.println();
		}
		System.out.println();
	}

}
