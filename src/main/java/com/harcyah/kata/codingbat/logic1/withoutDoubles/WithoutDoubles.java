package com.harcyah.kata.codingbat.logic1.withoutDoubles;

public class WithoutDoubles {

    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if (noDoubles && die1 == die2) {
            die1 = die1 % 6 + 1;
        }
        return die1 + die2;
    }

}
