package com.harcyah.kata.codingbat.string3.notReplace;

public class NotReplace {

	private final String IN = "is";
	private final String OUT = " not";

	public String notReplace(String source) {
		StringBuffer sb = new StringBuffer(source);
		for (int i = 0; i < sb.length(); i++) {
			if (previousCharIsNotLetter(sb, i) && currentPatternIsIs(sb, i) && nextCharIsNotLetter(sb, i)) {
				sb.insert(i + 2, OUT);
				i += OUT.length();
			}
		}
		return sb.toString();
	}

	private boolean currentPatternIsIs(StringBuffer sb, int i) {
		return sb.substring(i, i + 2).equals(IN);
	}

	private boolean previousCharIsNotLetter(StringBuffer sb, int i) {
		if ((i - 1) < 0) {
			return true;
		}

		return !Character.isLetter(sb.charAt(i - 1));
	}

	private boolean nextCharIsNotLetter(StringBuffer sb, int i) {
		if ((i + 2) >= sb.length()) {
			return true;
		}

		return !Character.isLetter(sb.charAt(i + 2));
	}

}
