package com.harcyah.kata.exercism.roman_numerals;

public class RomanNumeral {

	protected StringBuffer roman = new StringBuffer();

	private static final char[] ONES = new char[] { 'I', 'X', 'C', 'M' };
	private static final char[] FIVES = new char[] { 'V', 'L', 'D' };

	public RomanNumeral(int input) {
		if (input > 3000) {
			throw new IllegalArgumentException();
		}

		int rank = 0;
		String number = String.valueOf(input);
		for (int i = number.length() - 1; i >= 0; i--) {
			char numeral = number.charAt(i);
			int value = Integer.valueOf("" + numeral);
			roman.insert(0, getRomanForValue(value, rank));
			rank++;
		}
	}

	private String getRomanForValue(int value, int rank) {
		switch (value) {
		case 0:
		case 1:
		case 2:
		case 3:
			return repeat(ONES[rank], value);
		case 4:
			return "" + ONES[rank] + FIVES[rank];
		case 5:
			return "" + FIVES[rank];
		case 6:
		case 7:
		case 8:
			return FIVES[rank] + repeat(ONES[rank], value - 5);
		case 9:
			return "" + ONES[rank] + ONES[rank + 1];
		default:
			return "";
		}
	}

	private String repeat(char c, int value) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < value; i++) {
			sb.append(c);
		}
		return sb.toString();
	}

	public String getRomanNumeral() {
		return roman.toString();
	}

}