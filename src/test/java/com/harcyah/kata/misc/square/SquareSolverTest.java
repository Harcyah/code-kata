package com.harcyah.kata.misc.square;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.List;
import java.util.TreeSet;

public class SquareSolverTest {

	protected SquareSolver solver = new SquareSolver();

	@Test
	public void testExerciseExample() {
		Point a = new Point(-1, -1);
		Point b = new Point(2, 1);
		Point c = new Point(4, -2);
		Point d = new Point(1, -4);
		List<Point> points = Lists.newArrayList(a, b, c, d);
		List<Square> squares = solver.findSquares(Sets.newTreeSet(points));
		Assert.assertFalse(squares.isEmpty());
	}

	@Test
	public void testObviousCaseSuccess() {
		Point a = new Point(-1, -1);
		Point b = new Point(1, -1);
		Point c = new Point(-1, 1);
		Point d = new Point(1, 1);
		List<Point> points = Lists.newArrayList(a, b, c, d);

		List<Square> squares = solver.findSquares(Sets.newTreeSet(points));

		Assert.assertFalse(squares.isEmpty());
		Square square = squares.get(0);
		Assert.assertNotNull(square);
		Assert.assertEquals(a, square.a);
		Assert.assertEquals(b, square.c);
		Assert.assertEquals(c, square.b);
		Assert.assertEquals(d, square.d);
	}

	@Test
	public void testSimpleCaseSuccess() {
		Point a = new Point(-2, 1);
		Point b = new Point(-1, -2);
		Point c = new Point(2, -1);
		Point d = new Point(1, 2);
		List<Point> points = Lists.newArrayList(a, b, c, d);

		List<Square> squares = solver.findSquares(Sets.newTreeSet(points));

		Assert.assertFalse(squares.isEmpty());
		Square square = squares.get(0);
		Assert.assertNotNull(square);
		Assert.assertEquals(a, square.a);
		Assert.assertEquals(b, square.b);
		Assert.assertEquals(c, square.d);
		Assert.assertEquals(d, square.c);
	}

	@Test
	public void testObviousCaseFailure() {
		Point a = new Point(-1, -1);
		Point b = new Point(1, -1);
		Point c = new Point(-1, 1);
		Point d = new Point(1, 10);
		List<Point> points = Lists.newArrayList(a, b, c, d);

		List<Square> squares = solver.findSquares(Sets.newTreeSet(points));

		Assert.assertTrue(squares.isEmpty());
	}

	@Test
	public void testWithLaurentDataset() throws IOException {
		Reader reader = new Reader();
		TreeSet<Point> points = reader.read();

		List<Square> squares = solver.findSquares(points);

		Assert.assertFalse(squares.isEmpty());
	}

}
