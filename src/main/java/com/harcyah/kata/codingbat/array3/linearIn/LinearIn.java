package com.harcyah.kata.codingbat.array3.linearIn;

public class LinearIn {

    public boolean linearIn(int[] outer, int[] inner) {
        if (inner.length == 0) {
            return true;
        }

        int outerIterator = 0;
        for (int i = 0; i < inner.length; i++) {
            int value = inner[i];

            // Is this value in outer, between i and outer.length ?
            boolean found = false;
            for (; (outerIterator < outer.length) && !found; outerIterator++) {
                if (outer[outerIterator] == value) {
                    found = true;
                }
            }

            if (found == false) {
                return false;
            }
        }
        return true;
    }

}
