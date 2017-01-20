package com.harcyah.kata.codingbat.recursion1.factorial;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class FactorialTest {

    @Test
    public void testFactorial() {
        Factorial factorial = new Factorial();
        Assertions.assertThat(factorial.factorial(1)).isEqualTo(1);
        Assertions.assertThat(factorial.factorial(2)).isEqualTo(2);
        Assertions.assertThat(factorial.factorial(3)).isEqualTo(6);
        Assertions.assertThat(factorial.factorial(4)).isEqualTo(24);
        Assertions.assertThat(factorial.factorial(5)).isEqualTo(120);
        Assertions.assertThat(factorial.factorial(6)).isEqualTo(720);
        Assertions.assertThat(factorial.factorial(7)).isEqualTo(5040);
        Assertions.assertThat(factorial.factorial(8)).isEqualTo(40320);
        Assertions.assertThat(factorial.factorial(12)).isEqualTo(479001600);
    }

}
