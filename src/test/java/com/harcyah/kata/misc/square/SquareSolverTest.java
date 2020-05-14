package com.harcyah.kata.misc.square;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;
import java.util.List;
import java.util.TreeSet;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

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

        assertFalse(squares.isEmpty());
        Square square = squares.get(0);
        assertNotNull(square);
        assertEquals(a, square.getA());
        assertEquals(b, square.getC());
        assertEquals(c, square.getB());
        assertEquals(d, square.getD());
    }

    @Test
    public void testSimpleCaseSuccess() {
        Point a = new Point(-2, 1);
        Point b = new Point(-1, -2);
        Point c = new Point(2, -1);
        Point d = new Point(1, 2);
        List<Point> points = Lists.newArrayList(a, b, c, d);

        List<Square> squares = solver.findSquares(Sets.newTreeSet(points));

        assertFalse(squares.isEmpty());
        Square square = squares.get(0);
        assertNotNull(square);
        assertEquals(a, square.getA());
        assertEquals(b, square.getB());
        assertEquals(c, square.getD());
        assertEquals(d, square.getC());
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
    @Ignore
    public void testWithLaurentDataset() throws IOException {
        Reader reader = new Reader();
        TreeSet<Point> points = reader.read();

        List<Square> squares = solver.findSquares(points);

        assertThat(squares).hasSize(112);
    }

}
