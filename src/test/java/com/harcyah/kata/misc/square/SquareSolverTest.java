package com.harcyah.kata.misc.square;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.List;
import java.util.TreeSet;

import static org.assertj.core.api.Assertions.assertThat;

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

        assertThat(squares).isNotEmpty();
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
        Assert.assertEquals(a, square.getA());
        Assert.assertEquals(b, square.getC());
        Assert.assertEquals(c, square.getB());
        Assert.assertEquals(d, square.getD());
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
        Assert.assertEquals(a, square.getA());
        Assert.assertEquals(b, square.getB());
        Assert.assertEquals(c, square.getD());
        Assert.assertEquals(d, square.getC());
    }

    @Test
    public void testObviousCaseFailure() {
        Point a = new Point(-1, -1);
        Point b = new Point(1, -1);
        Point c = new Point(-1, 1);
        Point d = new Point(1, 10);
        List<Point> points = Lists.newArrayList(a, b, c, d);

        List<Square> squares = solver.findSquares(Sets.newTreeSet(points));

        assertThat(squares).isEmpty();
    }

    @Test
    public void testWithLaurentDataset() throws IOException {
        Reader reader = new Reader();
        TreeSet<Point> points = reader.read();

        List<Square> squares = solver.findSquares(points);

        assertThat(squares).hasSize(112);
    }

}
