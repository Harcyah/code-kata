package com.harcyah.kata.codingbat.array1.commonEnd;

public class CommonEnd {

    public boolean commonEnd(int[] a, int[] b) {
        return (a[0] == b[0]) || (a[a.length - 1] == b[b.length - 1]);
    }

}
