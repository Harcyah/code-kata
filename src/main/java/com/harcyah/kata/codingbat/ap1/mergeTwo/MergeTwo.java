package com.harcyah.kata.codingbat.ap1.mergeTwo;

public class MergeTwo {

    public String[] mergeTwo(String[] a, String[] b, int n) {
        String[] out = new String[n];
        int i = 0;
        int indexA = 0;
        int indexB = 0;
        do {
            String strA = a[indexA];
            String strB = b[indexB];
            if (strA.compareTo(strB) < 0) {
                i += putIfNoDuplicate(i, out, strA);
                indexA++;
            } else {
                i += putIfNoDuplicate(i, out, strB);
                indexB++;
            }
        } while (out[n - 1] == null);
        return out;
    }

    private int putIfNoDuplicate(int i, String[] target, String str) {
        if ((i == 0) || !target[i - 1].equals(str)) {
            target[i] = str;
            return 1;
        } else {
            return 0;
        }
    }

}
