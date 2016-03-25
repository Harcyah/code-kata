package com.harcyah.kata.misc.josephus;

public class Josephus {

	public static int getKeepAlivePositionFor(int people, int step) {
		return people == 1 ? 0 : (getKeepAlivePositionFor(people - 1, step) + step) % people;
	}

}
