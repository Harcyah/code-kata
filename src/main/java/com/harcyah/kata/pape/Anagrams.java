package com.harcyah.kata.pape;

import java.util.Arrays;

// http://www.home.hs-karlsruhe.de/~pach0003/informatik_1/aufgaben/en/arrays.html#anagram
public class Anagrams {

	public boolean isAnagram(String a, String b) {
		char[] charsA = getClean(a);
		char[] charsB = getClean(b);
		Arrays.sort(charsA);
		Arrays.sort(charsB);
		return Arrays.equals(charsA, charsB);
	}

	private char[] getClean(String source) {
		StringBuffer sba = new StringBuffer();
		for (int i = 0; i < source.length(); i++) {
			char c = source.charAt(i);
			if (Character.isAlphabetic(c)) {
				sba.append(Character.toLowerCase(c));
			}
		}

		char[] chars = sba.toString().toCharArray();
		Arrays.sort(chars);
		return chars;
	}

}
