package com.harcyah.kata.codingbat.array1.front11;

public class Front11 {

    public int[] front11(int[] a, int[] b) {
        if (a.length == 0) {
            if (b.length == 0) {
                return new int[0];
            } else {
                return new int[]{b[0]};
            }
        } else {
            if (b.length == 0) {
                return new int[]{a[0]};
            } else {
                return new int[]{a[0], b[0]};
            }
        }
    }

}
