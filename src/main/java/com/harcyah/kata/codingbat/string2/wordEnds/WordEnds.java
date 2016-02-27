package com.harcyah.kata.codingbat.string2.wordEnds;

public class WordEnds {

	public String wordEnds(String source, String word) {
		StringBuffer out = new StringBuffer();
		int length = word.length();
		int start = 0;
		int index;
		while ((index = source.indexOf(word, start)) != -1) {
			int indexBefore = index - 1;
			int indexAfter = index + length;
			if (indexBefore >= 0) {
				out.append(source.charAt(indexBefore));
			}
			if (indexAfter < source.length()) {
				out.append(source.charAt(indexAfter));
			}
			start = index + length;
		}
		System.out.println();
		return out.toString();
	}

}
