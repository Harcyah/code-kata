package com.harcyah.kata.misc.square;

import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;

public class SquareSolver {

	public List<Square> findSquares(List<Vector2D> points) {
		Preconditions.checkArgument(points.size() >= 4);

		// Fast-searchable vector2d set
		TreeSet<ComparableVector2D> haystack = new TreeSet<ComparableVector2D>();
		for (Vector2D vector2d : points) {
			haystack.add(new ComparableVector2D(vector2d));
		}

		// Returns
		List<Square> squares = Lists.newArrayList();

		Iterator<Vector2D> iterator = points.iterator();
		Vector2D a = iterator.next();
		while (a != null) {
			for (Vector2D b : points) {
				if (a.equals(b)) {
					continue;
				}

				Vector2D ab = new Vector2D(b.getX() - a.getX(), b.getY() - a.getY());

				Vector2D normalA = new Vector2D(ab.getY(), -ab.getX());
				testAndAdd(a, b, normalA, haystack, squares);

				Vector2D normalB = new Vector2D(-ab.getY(), ab.getX());
				testAndAdd(a, b, normalB, haystack, squares);
			}

			iterator.remove();
			a = iterator.hasNext() ? iterator.next() : null;
		}

		return squares;
	}

	protected void testAndAdd(Vector2D a, Vector2D b, Vector2D normal, TreeSet<ComparableVector2D> haystack, List<Square> output) {
		Vector2D c = new Vector2D(1, a, 1, normal);
		Vector2D d = new Vector2D(1, b, 1, normal);
		ComparableVector2D cvc = new ComparableVector2D(c);
		ComparableVector2D cvd = new ComparableVector2D(d);
		if (haystack.contains(cvc) && haystack.contains(cvd)) {
			output.add(new Square(a, b, c, d));
		}
	}

}
