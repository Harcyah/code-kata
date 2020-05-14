package com.harcyah.kata.exercism.rectangles;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RectangleCounter {

    private static final char CORNER = '+';

    public int countRectangles(String[] source) {
        if (source.length < 2) {
            return 0;
        }

        char[][] grid = new char[source.length][];
        for (int i = 0; i < source.length; i++) {
            grid[i] = source[i].toCharArray();
        }

        Set<Point> points = new HashSet<>();
        for (int y = 0; y < source.length; y++) {
            char[] line = grid[y];
            for (int x = 0; x < line.length; x++) {
                if (line[x] == CORNER) {
                    points.add(new Point(x, y));
                }
            }
        }

        // Let's say that a rectangle's points are named:
        // A-------B
        // |       |
        // C-------D
        Set<Rectangle> rectangles = new HashSet<>();
        for (Point topLeft : points) {
            List<Point> possibleBs = points.stream()
                .filter(x -> x != topLeft)
                .filter(x -> x.getY() == topLeft.getY())
                .filter(x -> x.getX() > topLeft.getX())
                .collect(Collectors.toList());

            List<Point> possibleCs = points.stream()
                .filter(x -> x != topLeft)
                .filter(x -> x.getX() == topLeft.getX())
                .filter(x -> x.getY() > topLeft.getY())
                .collect(Collectors.toList());

            for (Point b : possibleBs) {
                for (Point c : possibleCs) {
                    Point d = new Point(b.getX(), c.getY());
                    if (points.contains(d)) {
                        if (horizontalLine(grid, topLeft, b) && verticalLine(grid, topLeft, c) && verticalLine(grid, b, d) && horizontalLine(grid, c, d)) {
                            rectangles.add(new Rectangle(topLeft, b, c, d));
                        }
                    }
                }
            }
        }

        return rectangles.size();
    }

    private boolean verticalLine(char[][] grid, Point min, Point max) {
        for (int i = min.getY(); i < max.getY(); i++) {
            if (grid[i][min.getX()] != CORNER && grid[i][min.getX()] != '|') {
                return false;
            }
        }
        return true;
    }

    private boolean horizontalLine(char[][] grid, Point min, Point max) {
        for (int i = min.getX(); i < max.getX(); i++) {
            if (grid[min.getY()][i] != CORNER && grid[min.getY()][i] != '-') {
                return false;
            }
        }
        return true;
    }

}
