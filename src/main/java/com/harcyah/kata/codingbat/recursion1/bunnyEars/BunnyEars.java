package com.harcyah.kata.codingbat.recursion1.bunnyEars;

public class BunnyEars {

    public int bunnyEars(int bunnies) {
        return (bunnies == 0) ? 0 : 2 + bunnyEars(bunnies - 1);
    }

}
