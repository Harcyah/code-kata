package com.harcyah.kata.exercism.triangle;

public class Triangle {

	protected double a;
	protected double b;
	protected double c;

	public Triangle(double a, double b, double c) throws TriangleException {
		if (a <= 0 || b <= 0 || c <= 0) {
			throw new TriangleException();
		}
		if (a + b <= c) {
			throw new TriangleException();
		}
		if (a + c <= b) {
			throw new TriangleException();
		}
		if (b + c <= a) {
			throw new TriangleException();
		}

		this.a = a;
		this.b = b;
		this.c = c;
	}

	public TriangleKind getKind() {
		if (a == b && b == c) {
			return TriangleKind.EQUILATERAL;
		}
		if (a == b || b == c || a == c) {
			return TriangleKind.ISOSCELES;
		}
		return TriangleKind.SCALENE;
	}

}