package com.harcyah.kata.codingbat.string1.makeOutWord;

public class MakeOutWord {

	public String makeOutWord(String out, String word) {
		return out.substring(0, 2) + word + out.substring(2, 4);
	}

}
