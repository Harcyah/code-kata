package com.harcyah.kata.reddit.easy_2016_04_18;

public class ShannonEntropy {

	private static final double LOG_2 = Math.log(2);

	public double compute(String source) {
		int[] frequencies = new int[256];
		for (char c : source.toCharArray()) {
			frequencies[c]++;
		}

		double length = source.length();
		double sum = 0;

		for (int i = 0; i < frequencies.length; i++) {
			if (frequencies[i] > 0) {
				double frequency = frequencies[i] / length;
				sum += (frequency * log2(frequency));
			}
		}
		return -1 * sum;
	}

	public static double log2(double a) {
		return Math.log(a) / LOG_2;
	}

}
