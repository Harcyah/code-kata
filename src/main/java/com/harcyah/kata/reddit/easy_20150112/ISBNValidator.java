package com.harcyah.kata.reddit.easy_20150112;

import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;

// http://www.reddit.com/r/dailyprogrammer/comments/2s7ezp/20150112_challenge_197_easy_isbn_validator/
public class ISBNValidator {

	public boolean isValid(String isbn) {
		String clean = StringUtils.remove(isbn, '-');

		if (!isValidFormat(clean)) {
			return false;
		}

		int index = 10;
		int sum = 0;
		for (int i = 0; i < clean.length(); i++) {
			String c = clean.substring(i, i + 1);
			if (c.equals("-")) {
				continue;
			}

			int value = c.equals("X") ? 10 : Integer.parseInt(c);
			sum += value * index;
			index--;
		}
		return sum % 11 == 0;
	}

	private boolean isValidFormat(String isbn) {
		return Pattern.compile("[\\dX]{10}").matcher(isbn).matches();
	}

}
