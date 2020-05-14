package com.harcyah.kata.codingbat.recursion1.fibonacci;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FibonacciTest {

    @Test
    public void testFibonacci() {
        Fibonacci fibonacci = new Fibonacci();
        assertThat(fibonacci.fibonacci(0)).isEqualTo(0);
        assertThat(fibonacci.fibonacci(1)).isEqualTo(1);
        assertThat(fibonacci.fibonacci(2)).isEqualTo(1);
        assertThat(fibonacci.fibonacci(3)).isEqualTo(2);
        assertThat(fibonacci.fibonacci(4)).isEqualTo(3);
        assertThat(fibonacci.fibonacci(5)).isEqualTo(5);
        assertThat(fibonacci.fibonacci(6)).isEqualTo(8);
        assertThat(fibonacci.fibonacci(7)).isEqualTo(13);
    }

}
