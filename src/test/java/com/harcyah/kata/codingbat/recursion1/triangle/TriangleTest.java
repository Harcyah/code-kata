package com.harcyah.kata.codingbat.recursion1.triangle;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class TriangleTest {

	@Test
	public void testTriangle() {
		Triangle triangle = new Triangle();
		Assertions.assertThat(triangle.triangle(0)).isEqualTo(0);
		Assertions.assertThat(triangle.triangle(1)).isEqualTo(1);
		Assertions.assertThat(triangle.triangle(2)).isEqualTo(3);
		Assertions.assertThat(triangle.triangle(3)).isEqualTo(6);
		Assertions.assertThat(triangle.triangle(4)).isEqualTo(10);
		Assertions.assertThat(triangle.triangle(5)).isEqualTo(15);
		Assertions.assertThat(triangle.triangle(6)).isEqualTo(21);
		Assertions.assertThat(triangle.triangle(7)).isEqualTo(28);
	}

}
