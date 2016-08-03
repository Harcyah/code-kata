package com.harcyah.kata.exercism.atbash_cipher;

import java.util.Arrays;

public class Atbash {

	protected static final char[] ALPHABET = new char[] {
			'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
			'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
	};

	public static String encode(String input) {
		return format(decode(input));
	}

	private static String format(String bash) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < bash.length(); i++) {
			if (i > 0 && i % 5 == 0) {
				sb.append(" ");
			}
			sb.append(bash.charAt(i));
		}
		return sb.toString();
	}

	public static String decode(String input) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < input.length(); i++) {
			char s = Character.toLowerCase(input.charAt(i));
			if (Character.isDigit(s)) {
				sb.append(s);
			} else {
				int idx = Arrays.binarySearch(ALPHABET, s);
				if (idx >= 0) {
					char replacement = ALPHABET[26 - idx - 1];
					sb.append(replacement);
				}
			}
		}
		return sb.toString();
	}

}