package com.harcyah.kata.reddit.medium_2016_02_17;

public enum Sibling {

	TOP(0, -1),
	BOTTOM(0, 1),
	RIGHT(1, 0),
	LEFT(-1, 0),
	TOP_RIGHT(1, -1),
	BOTTOM_RIGHT(1, 1),
	BOTTOM_LEFT(-1, 1),
	TOP_LEFT(-1, -1);

	private int col;
	private int row;

	private Sibling(int col, int row) {
		this.col = col;
		this.row = row;
	}

	protected Square getFirstLevelNeighbour(int col, int row) {
		return new Square(col + this.col, row + this.row);
	}

	protected Square getSecondLevelNeighbour(int col, int row) {
		return new Square(col + (this.col * 2), row + (this.row * 2));
	}

	public boolean canPut(Chip player, Chip opponent, int col, int row, Board board) {
		Square sibling1 = getFirstLevelNeighbour(col, row);
		if (board.hasSquare(sibling1) == false) {
			return false;
		}

		Square sibling2 = getSecondLevelNeighbour(col, row);
		if (board.hasSquare(sibling2) == false) {
			return false;
		}

		Chip chipOnSibling1 = board.getChipAt(sibling1);
		if (chipOnSibling1 != opponent) {
			return false;
		}

		Chip chipOnSibling2 = board.getChipAt(sibling2);
		if (chipOnSibling2 != player) {
			return false;
		}

		return true;
	}

}
