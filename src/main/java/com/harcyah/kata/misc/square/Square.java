package com.harcyah.kata.misc.square;

import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;

public class Square {

	protected Vector2D a;
	protected Vector2D b;
	protected Vector2D c;
	protected Vector2D d;

	public Square(Vector2D a, Vector2D b, Vector2D c, Vector2D d) {
		Preconditions.checkArgument(!a.equals(b));
		Preconditions.checkArgument(!a.equals(c));
		Preconditions.checkArgument(!a.equals(d));
		Preconditions.checkArgument(!b.equals(c));
		Preconditions.checkArgument(!b.equals(d));
		Preconditions.checkArgument(!c.equals(d));
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	public Vector2D getA() {
		return a;
	}

	public Vector2D getB() {
		return b;
	}

	public Vector2D getC() {
		return c;
	}

	public Vector2D getD() {
		return d;
	}

	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this)
			.add("a", a)
			.add("b", b)
			.add("c", c)
			.add("d", d)
			.toString();
	}

}
