package com.harcyah.kata.misc.square;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;

import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class SquareSolver {

    public List<Square> findSquares(TreeSet<Point> points) {
        Preconditions.checkArgument(points.size() >= 4);
        List<Square> squares = Lists.newArrayList();
        Iterator<Point> iterator = points.iterator();
        Point a = iterator.next();
        while (a != null) {
            for (Point b : points) {
                if (a.equals(b)) {
                    continue;
                }

                Point ab = new Point(b.getX() - a.getX(), b.getY() - a.getY());

                Point normalA = new Point(ab.getY(), -ab.getX());
                testAndAdd(a, b, normalA, points, squares);

                Point normalB = new Point(-ab.getY(), ab.getX());
                testAndAdd(a, b, normalB, points, squares);
            }

            iterator.remove();
            a = iterator.hasNext() ? iterator.next() : null;
        }

        return squares;
    }

    protected void testAndAdd(Point a, Point b, Point normal, TreeSet<Point> points, List<Square> output) {
        Point c = new Point(a, normal);
        if (points.contains(c)) {
            Point d = new Point(b, normal);
            if (points.contains(d)) {
                output.add(new Square(a, b, c, d));
            }
        }
    }

}
