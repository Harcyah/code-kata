package com.harcyah.kata.exercism.acronym;


public class Acronym {

	public static String generate(String original) {
		StringBuffer out = new StringBuffer();

		// Split words by spaces and hyphens
		String[] tokens = original.split(" |-");
		for (String token : tokens) {

			// Always take the first char
			out.append(token.charAt(0));

			// Run through token's chars, and gather all uppercase followed by a lowercase
			for (int i=1; i<token.length() - 1; i++) {
				if (Character.isUpperCase(token.charAt(i)) && Character.isLowerCase(token.charAt(i+1))) {
					out.append(token.charAt(i));
				}
			}
		}

		return out.toString().toUpperCase();
	}

}
