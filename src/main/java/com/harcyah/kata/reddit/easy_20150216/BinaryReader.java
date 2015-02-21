package com.harcyah.kata.reddit.easy_20150216;

public class BinaryReader {

	public String read(String binary) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < binary.length(); i += 8) {
			String letter = binary.substring(i, i + 8);
			int integer = Integer.parseInt(letter, 2);
			sb.append((char) integer);
		}
		return sb.toString();
	}

}
