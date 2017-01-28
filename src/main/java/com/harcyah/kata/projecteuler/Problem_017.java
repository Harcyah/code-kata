package com.harcyah.kata.projecteuler;

public class Problem_017 {

	public long countLettersOfSumBetween(int a, int b) {
		long count = 0;
		for (int i = a; i <= b; i++) {
			count += getLengthOfEnglishLiteral(i);
		}
		return count;
	}

	protected long getLengthOfEnglishLiteral(int value) {
		String literal = getEnglishLiteralOf(value);
		literal = literal.replaceAll(" ", "");
		literal = literal.replaceAll("-", "");
		return literal.length();
	}

	public String getEnglishLiteralOf(int number) {
		StringBuffer out = new StringBuffer();

		if (number == 0) {
			return "zero";
		}
		if (number == 1000) {
			return "one thousand";
		}

		int hundreds = number / 100;
		int tenths = number % 100;

		if (hundreds > 0) {
			out.append(getEnglishLiteralForHundreds(hundreds));

			if (tenths > 0) {
				out.append(" and ");
			}
		}

		if (tenths > 0) {
			out.append(getEnglishLiteralForNumberUnder100(tenths));
		}

		return out.toString();
	}

	private String getEnglishLiteralForHundreds(int number) {
		return getEnglishLiteralForUnits(number) + " hundred";
	}

	private String getEnglishLiteralForUnits(int number) {
		switch (number) {
		case 1:
			return "one";
		case 2:
			return "two";
		case 3:
			return "three";
		case 4:
			return "four";
		case 5:
			return "five";
		case 6:
			return "six";
		case 7:
			return "seven";
		case 8:
			return "eight";
		case 9:
			return "nine";
		default:
			throw new IllegalArgumentException();
		}
	}

	private String getEnglishLiteralForNumberUnder100(int number) {
		switch (number) {
		case 10:
			return "ten";
		case 11:
			return "eleven";
		case 12:
			return "twelve";
		case 13:
			return "thirteen";
		case 14:
			return "fourteen";
		case 15:
			return "fifteen";
		case 16:
			return "sixteen";
		case 17:
			return "seventeen";
		case 18:
			return "eighteen";
		case 19:
			return "nineteen";
		default:
			StringBuffer out = new StringBuffer();
			int tenths = number / 10;
			int units = number % 10;

			if (tenths > 0) {
				out.append(getEnglishLiteralForMultipleOfTen(tenths));

				if (units > 0) {
					out.append("-");
				}
			}

			if (units > 0) {
				out.append(getEnglishLiteralForUnits(units));
			}

			return out.toString();
		}
	}

	private String getEnglishLiteralForMultipleOfTen(int number) {
		switch (number) {
		case 2:
			return "twenty";
		case 3:
			return "thirty";
		case 4:
			return "forty";
		case 5:
			return "fifty";
		case 6:
			return "sixty";
		case 7:
			return "seventy";
		case 8:
			return "eighty";
		case 9:
			return "ninety";
		default:
			throw new IllegalArgumentException();
		}
	}

	/*
	 * private String getEnglishLiteralForNumberAboveTen(int number) {
	 *
	 * default: int multiple = number / 10; int unit = number % 10; return
	 * getEnglishLiteralForMultipleOfTen(multiple) + (unit > 0 ? "-" +
	 * getEnglishLiteralForUnits(unit) : ""); } }
	 *
	 */
}
