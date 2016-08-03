package com.harcyah.kata.exercism.luhn;

public class Luhn {

	protected long value;
	protected int[] addends;
	protected int checksum = 0;

	public Luhn(long value) {
		int digits = (int) Math.log10(value) + 1;
		this.value = value;
		this.addends = new int[digits];
		for (int i = 0; i < digits; i++) {
			int index = digits - i - 1;
			int digit = getDigit(value, index);
			if (i % 2 == 1) {
				int doubledDigit = digit * 2;
				addends[index] = doubledDigit > 10 ? doubledDigit - 9 : doubledDigit;
			} else {
				addends[index] = digit;
			}
			checksum += addends[index];
		}
	}

	public static int getDigit(long number, int digit) {
		// Could have used some math black magic
		return Character.getNumericValue(String.valueOf(number).charAt(digit));
	}

	public boolean isValid() {
		return checksum % 10 == 0;
	}

	public long getCheckDigit() {
		return value % 10;
	}

	public int[] getAddends() {
		return addends;
	}

	public int getCheckSum() {
		return checksum;
	}

	public static long create(long value) {
		for (int i = 0; i < 10; i++) {
			long test = value * 10 + i;
			if (new Luhn(test).isValid()) {
				return test;
			}
		}
		throw new UnsupportedOperationException();
	}

}