package com.harcyah.kata.codingbat.warmup2.last2;

public class Last2 {

    public int last2(String str) {
        if (str.length() < 4) {
            return 0;
        }
        String suffix = str.substring(str.length() - 2);
        int times = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (suffix.equals(str.substring(i, i + 2))) {
                times++;
            }
        }
        return times;
    }

}
