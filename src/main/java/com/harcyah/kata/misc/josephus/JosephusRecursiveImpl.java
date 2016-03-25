package com.harcyah.kata.misc.josephus;

public class JosephusRecursiveImpl implements Josephus {

	@Override
	public int getLastManStanding(int people, int step) {
		return people == 1 ? 0 : (getLastManStanding(people - 1, step) + step) % people;
	}

}
