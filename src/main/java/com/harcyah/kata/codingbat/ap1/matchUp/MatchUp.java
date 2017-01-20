package com.harcyah.kata.codingbat.ap1.matchUp;

public class MatchUp {

    public int matchUp(String[] a, String[] b) {
        int times = 0;
        for (int i = 0; i < a.length; i++) {
            times += compare(a[i], b[i]);
        }
        return times;
    }

    public int compare(String a, String b) {
        if (a.equals(""))
            return 0;
        if (b.equals(""))
            return 0;
        return a.charAt(0) == b.charAt(0) ? 1 : 0;
    }

}
