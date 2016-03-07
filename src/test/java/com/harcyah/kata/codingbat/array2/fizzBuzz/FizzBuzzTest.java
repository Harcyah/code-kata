package com.harcyah.kata.codingbat.array2.fizzBuzz;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void testFizzBuzz() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		Assertions.assertThat(fizzBuzz.fizzBuzz(1, 6)).isEqualTo(new String[] {"1", "2", "Fizz", "4", "Buzz"});
		Assertions.assertThat(fizzBuzz.fizzBuzz(1, 8)).isEqualTo(new String[] {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7"});
		Assertions.assertThat(fizzBuzz.fizzBuzz(1, 11)).isEqualTo(new String[] {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"});
		Assertions.assertThat(fizzBuzz.fizzBuzz(1, 16)).isEqualTo(new String[] {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"});
		Assertions.assertThat(fizzBuzz.fizzBuzz(1, 4)).isEqualTo(new String[] {"1", "2", "Fizz"});
		Assertions.assertThat(fizzBuzz.fizzBuzz(1, 2)).isEqualTo(new String[] {"1"});
		Assertions.assertThat(fizzBuzz.fizzBuzz(50, 56)).isEqualTo(new String[] {"Buzz", "Fizz", "52", "53", "Fizz", "Buzz"});
		Assertions.assertThat(fizzBuzz.fizzBuzz(15, 17)).isEqualTo(new String[] {"FizzBuzz", "16"});
		Assertions.assertThat(fizzBuzz.fizzBuzz(30, 36)).isEqualTo(new String[] {"FizzBuzz", "31", "32", "Fizz", "34", "Buzz"});
		Assertions.assertThat(fizzBuzz.fizzBuzz(1000, 1006)).isEqualTo(new String[] {"Buzz", "1001", "Fizz", "1003", "1004", "FizzBuzz"});
		Assertions.assertThat(fizzBuzz.fizzBuzz(99, 102)).isEqualTo(new String[] {"Fizz", "Buzz", "101"});
		Assertions.assertThat(fizzBuzz.fizzBuzz(14, 20)).isEqualTo(new String[] {"14", "FizzBuzz", "16", "17", "Fizz", "19"});
	}

}


