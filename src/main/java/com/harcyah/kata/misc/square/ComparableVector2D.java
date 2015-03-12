package com.harcyah.kata.misc.square;

import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;

import com.google.common.collect.ComparisonChain;

public class ComparableVector2D implements Comparable<ComparableVector2D> {

	protected Vector2D vector2d;

	public ComparableVector2D(Vector2D vector2d) {
		this.vector2d = vector2d;
	}

	@Override
	public int compareTo(ComparableVector2D other) {
		return ComparisonChain.start()
			.compare(this.vector2d.getX(), other.vector2d.getX())
			.compare(this.vector2d.getY(), other.vector2d.getY())
			.result();
	}

}
