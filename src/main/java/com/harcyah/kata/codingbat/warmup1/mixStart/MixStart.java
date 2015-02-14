package com.harcyah.kata.codingbat.warmup1.mixStart;

public class MixStart {

	public boolean mixStart(String str) {
		return str.length() >= 3 && str.charAt(1) == 'i' && str.charAt(2) == 'x';
	}

}