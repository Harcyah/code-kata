package com.harcyah.kata.codingbat.logic1.fizzString;

public class FizzString {

	public String fizzString(String str) {
		boolean sf = str.charAt(0) == 'f';
		boolean eb = str.charAt(str.length() - 1) == 'b';
		if (sf) {
			if (eb) {
				return "FizzBuzz";
			} else {
				return "Fizz";
			}
		} else {
			if (eb) {
				return "Buzz";
			} else {
				return str;
			}
		}
	}

}
