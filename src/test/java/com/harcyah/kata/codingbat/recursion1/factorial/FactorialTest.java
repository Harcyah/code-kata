package com.harcyah.kata.codingbat.recursion1.factorial;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FactorialTest {

    @Test
    public void testFactorial() {
        Factorial factorial = new Factorial();
        assertThat(factorial.factorial(1)).isEqualTo(1);
        assertThat(factorial.factorial(2)).isEqualTo(2);
        assertThat(factorial.factorial(3)).isEqualTo(6);
        assertThat(factorial.factorial(4)).isEqualTo(24);
        assertThat(factorial.factorial(5)).isEqualTo(120);
        assertThat(factorial.factorial(6)).isEqualTo(720);
        assertThat(factorial.factorial(7)).isEqualTo(5040);
        assertThat(factorial.factorial(8)).isEqualTo(40320);
        assertThat(factorial.factorial(12)).isEqualTo(479001600);
    }

}
