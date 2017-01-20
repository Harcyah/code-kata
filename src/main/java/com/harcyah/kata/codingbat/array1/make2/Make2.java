package com.harcyah.kata.codingbat.array1.make2;

public class Make2 {

    public int[] make2(int[] a, int[] b) {
        int index = 0;
        int[] out = new int[2];
        for (int i = 0; i < a.length; i++) {
            out[index] = a[i];
            index++;
            if (index == out.length) {
                return out;
            }
        }
        for (int i = 0; i < b.length; i++) {
            out[index] = b[i];
            index++;
            if (index == out.length) {
                return out;
            }
        }
        return out;
    }

}
