package com.harcyah.kata.codingbat.recursion1.triangle;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TriangleTest {

    @Test
    public void testTriangle() {
        Triangle triangle = new Triangle();
        assertThat(triangle.triangle(0)).isEqualTo(0);
        assertThat(triangle.triangle(1)).isEqualTo(1);
        assertThat(triangle.triangle(2)).isEqualTo(3);
        assertThat(triangle.triangle(3)).isEqualTo(6);
        assertThat(triangle.triangle(4)).isEqualTo(10);
        assertThat(triangle.triangle(5)).isEqualTo(15);
        assertThat(triangle.triangle(6)).isEqualTo(21);
        assertThat(triangle.triangle(7)).isEqualTo(28);
    }

}
