package com.harcyah.kata.misc.square;

import com.google.common.base.Preconditions;

public class Square {

    private final Point a;
    private final Point b;
    private final Point c;
    private final Point d;

    public Square(Point a, Point b, Point c, Point d) {
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

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    public Point getC() {
        return c;
    }

    public Point getD() {
        return d;
    }

}
