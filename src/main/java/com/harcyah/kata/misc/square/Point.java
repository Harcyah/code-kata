package com.harcyah.kata.misc.square;

import com.google.common.collect.ComparisonChain;

public class Point implements Comparable<Point> {

    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point u1, Point u2) {
        this.x = u1.x + u2.x;
        this.y = u1.y + u2.y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Point other = (Point) obj;
        if (x != other.x) {
            return false;
        }
        if (y != other.y) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Point o) {
        return ComparisonChain.start().compare(this.x, o.x).compare(this.y, o.y).result();
    }

}
