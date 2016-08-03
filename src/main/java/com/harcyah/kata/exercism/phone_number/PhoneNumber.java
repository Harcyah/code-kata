package com.harcyah.kata.exercism.phone_number;

public class PhoneNumber {

	private static final String DEFAULT_NUMBER = "0000000000";
	private String number;

	public PhoneNumber(String number) {
		this.number = number.replaceAll("[^\\d]", "");
		if (this.number.length() < 10) {
			this.number = DEFAULT_NUMBER;
		}
		if (this.number.length() == 11) {
			if (this.number.startsWith("1")) {
				this.number = number.substring(1);
			} else {
				this.number = DEFAULT_NUMBER;
			}
		}
	}

	public String getNumber() {
		return number;
	}

	public String getAreaCode() {
		return number.substring(0, 3);
	}

	public String pretty() {
		return String.format("(%s) %s-%s",
				number.substring(0, 3),
				number.substring(3, 6),
				number.substring(6));
	}

}