package com.harcyah.kata.pape;

// http://www.home.hs-karlsruhe.de/~pach0003/informatik_1/aufgaben/en/flowcontrol.html#sort_three_numbers
public class ThreeNumbersSort {

	public void sort(int[] values) {
		if (values[0] > values[1]) {
			int temp = values[0];
			values[0] = values[1];
			values[1] = temp;
		}
		if (values[0] > values[2]) {
			int temp = values[0];
			values[0] = values[2];
			values[2] = temp;
		}
		if (values[1] > values[2]) {
			int temp = values[1];
			values[1] = values[2];
			values[2] = temp;
		}
	}

}
