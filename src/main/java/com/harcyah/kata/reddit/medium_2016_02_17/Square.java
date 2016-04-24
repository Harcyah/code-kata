package com.harcyah.kata.reddit.medium_2016_02_17;

import com.google.common.base.Objects;

public class Square {

	protected int col;
	protected int row;

	public Square(int col, int row) {
		this.col = col;
		this.row = row;
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(col, row);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Square other = (Square) obj;
		if (col != other.col) {
			return false;
		}
		if (row != other.row) {
			return false;
		}
		return true;
	}

	public boolean isLegal() {
		return (col >= 0) && (col < Board.SIZE) && (row >= 0) && (row < Board.SIZE);
	}

	@Override
	public String toString() {
		return "Col: " + col + ", Row: " + row;
	}

}
