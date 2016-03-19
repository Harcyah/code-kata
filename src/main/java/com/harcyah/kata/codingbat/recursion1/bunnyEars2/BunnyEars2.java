package com.harcyah.kata.codingbat.recursion1.bunnyEars2;

public class BunnyEars2 {

	public int bunnyEars2(int bunnies) {
		if (bunnies == 0) {
			return 0;
		}
		return (bunnies % 2) == 0 ? 3 + bunnyEars2(bunnies - 1) : 2 + bunnyEars2(bunnies - 1);
	}

}
