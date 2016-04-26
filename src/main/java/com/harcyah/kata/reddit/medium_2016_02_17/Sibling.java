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

	private int colShift;
	private int rowShift;

	private Sibling(int colShift, int rowShift) {
		this.colShift = colShift;
		this.rowShift = rowShift;
	}

	protected Square getNeighbour(int col, int row, int rank) {
		return new Square(col + (this.colShift * rank), row + (this.rowShift * rank));
	}

	public boolean canPut(Chip player, Chip opponent, int col, int row, Board board) {

		// First neighbour must be an opponent one
		int rank = 1;
		Square neighbour = getNeighbour(col, row, rank);
		if ((board.hasSquare(neighbour) == false) || (board.getChipAt(neighbour) != opponent)) {
			return false;
		}

		// Search on given line
		while (board.hasSquare(neighbour = getNeighbour(col, row, rank++))) {
			Chip chip = board.getChipAt(neighbour);

			// Empty slot
			if (chip == null) {
				return false;
			}

			// Slot with player chip : OK !
			if (chip.equals(player)) {
				return true;
			}
		}

		// Position does not exist on board
		return false;
	}

}
