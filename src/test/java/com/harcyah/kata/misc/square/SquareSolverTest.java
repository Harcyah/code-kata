package com.harcyah.kata.misc.square;

import java.io.IOException;
import java.util.List;

import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.junit.Assert;
import org.junit.Test;

import com.google.common.collect.Lists;

public class SquareSolverTest {

	protected SquareSolver solver = new SquareSolver();

	@Test
	public void testExerciseExample() {
		Vector2D a = new Vector2D(-1, -1);
		Vector2D b = new Vector2D(2, 1);
		Vector2D c = new Vector2D(4, -2);
		Vector2D d = new Vector2D(1, -4);
		List<Vector2D> points = Lists.newArrayList(a, b, c, d);
		List<Square> squares = solver.findSquares(points);
		Assert.assertFalse(squares.isEmpty());
	}

	@Test
	public void testObviousCaseSuccess() {
		Vector2D a = new Vector2D(-1, -1);
		Vector2D b = new Vector2D(1, -1);
		Vector2D c = new Vector2D(-1, 1);
		Vector2D d = new Vector2D(1, 1);
		List<Vector2D> points = Lists.newArrayList(a, b, c, d);

		List<Square> squares = solver.findSquares(points);

		Assert.assertFalse(squares.isEmpty());
		Square square = squares.get(0);
		Assert.assertNotNull(square);
		Assert.assertEquals(a, square.a);
		Assert.assertEquals(b, square.b);
		Assert.assertEquals(c, square.c);
		Assert.assertEquals(d, square.d);
	}

	@Test
	public void testSimpleCaseSuccess() {
		Vector2D a = new Vector2D(-2, 1);
		Vector2D b = new Vector2D(-1, -2);
		Vector2D c = new Vector2D(2, -1);
		Vector2D d = new Vector2D(1, 2);
		List<Vector2D> points = Lists.newArrayList(a, b, c, d);

		List<Square> squares = solver.findSquares(points);

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
		Vector2D a = new Vector2D(-1, -1);
		Vector2D b = new Vector2D(1, -1);
		Vector2D c = new Vector2D(-1, 1);
		Vector2D d = new Vector2D(1, 10);
		List<Vector2D> points = Lists.newArrayList(a, b, c, d);

		List<Square> squares = solver.findSquares(points);

		Assert.assertTrue(squares.isEmpty());
	}

	@Test
	public void testWithLaurentDataset() throws IOException {
		Reader reader = new Reader();
		List<Vector2D> points = reader.read();

		List<Square> squares = solver.findSquares(points);

		Assert.assertFalse(squares.isEmpty());
	}

}
