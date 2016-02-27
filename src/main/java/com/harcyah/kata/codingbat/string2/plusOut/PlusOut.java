package com.harcyah.kata.codingbat.string2.plusOut;

public class PlusOut {

	public String plusOut(String source, String word) {
		StringBuffer out = new StringBuffer();
		for (int i = 0; i < source.length(); i++) {
			String rem = source.substring(i);
			if (rem.startsWith(word)) {
				out.append(word);
				i += word.length() - 1;
			} else {
				out.append('+');
			}
		}
		return out.toString();
	}

}
