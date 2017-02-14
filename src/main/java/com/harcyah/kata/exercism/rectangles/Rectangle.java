package com.harcyah.kata.exercism.rectangles;

class Rectangle {

    private final Point a;
    private final Point b;
    private final Point c;
    private final Point d;

    Rectangle(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rectangle rectangle = (Rectangle) o;

        if (!a.equals(rectangle.a)) return false;
        if (!b.equals(rectangle.b)) return false;
        if (!c.equals(rectangle.c)) return false;
        return d.equals(rectangle.d);
    }

    @Override
    public int hashCode() {
        int result = a.hashCode();
        result = 31 * result + b.hashCode();
        result = 31 * result + c.hashCode();
        result = 31 * result + d.hashCode();
        return result;
    }
}
