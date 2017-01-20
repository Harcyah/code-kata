package com.harcyah.kata.codingbat.recursion1.fibonacci;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class FibonacciTest {

    @Test
    public void testFibonacci() {
        Fibonacci fibonacci = new Fibonacci();
        Assertions.assertThat(fibonacci.fibonacci(0)).isEqualTo(0);
        Assertions.assertThat(fibonacci.fibonacci(1)).isEqualTo(1);
        Assertions.assertThat(fibonacci.fibonacci(2)).isEqualTo(1);
        Assertions.assertThat(fibonacci.fibonacci(3)).isEqualTo(2);
        Assertions.assertThat(fibonacci.fibonacci(4)).isEqualTo(3);
        Assertions.assertThat(fibonacci.fibonacci(5)).isEqualTo(5);
        Assertions.assertThat(fibonacci.fibonacci(6)).isEqualTo(8);
        Assertions.assertThat(fibonacci.fibonacci(7)).isEqualTo(13);
    }

}
