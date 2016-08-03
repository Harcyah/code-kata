package com.harcyah.kata.exercism.pig_latin;

import java.util.ArrayList;
import java.util.List;

public class PigLatin {

	private static final List<String> VOWELS = new ArrayList<>();
	private static final List<String> SPECIAL_CONSONANTS = new ArrayList<>();

	static {
		VOWELS.add("a");
		VOWELS.add("e");
		VOWELS.add("i");
		VOWELS.add("o");
		VOWELS.add("u");
		VOWELS.add("yt");
		VOWELS.add("xr");
		SPECIAL_CONSONANTS.add("sch");
		SPECIAL_CONSONANTS.add("ch");
		SPECIAL_CONSONANTS.add("thr");
		SPECIAL_CONSONANTS.add("th");
		SPECIAL_CONSONANTS.add("squ");
		SPECIAL_CONSONANTS.add("qu");
	}

	public static String translate(String sentence) {
		String[] words = sentence.split(" ");
		String[] translated = new String[words.length];
		for (int i = 0; i < words.length; i++) {
			translated[i] = translateWord(words[i]);
		}
		return String.join(" ", translated);
	}

	protected static String translateWord(String word) {
		String translated;

		if (startsWithVowel(word)) {
			translated = word + "ay";
		} else {
			String prefix = getStartingConsonant(word);
			translated = word.substring(prefix.length()) + prefix + "ay";
		}
		return translated;
	}

	protected static boolean startsWithVowel(String word) {
		for (String vowel : VOWELS) {
			if (word.startsWith(vowel)) {
				return true;
			}
		}
		return false;
	}

	protected static String getStartingConsonant(String word) {
		for (String special : SPECIAL_CONSONANTS) {
			if (word.startsWith(special)) {
				return special;
			}
		}
		return word.substring(0, 1);
	}

}