package com.harcyah.kata.codingbat.ap1.commonTwo;

public class CommonTwo {

    public int commonTwo(String[] a, String[] b) {
        int count = 0;

        int indexA = 0;
        int indexB = 0;
        while ((indexA < a.length) && (indexB < b.length)) {
            String strA = a[indexA];
            String strB = b[indexB];
            if (strA.equals(strB)) {
                count++;
                indexA = scroll(a, indexA, strA);
                indexB = scroll(b, indexB, strB);
            } else {
                if (strA.compareTo(strB) < 0) {
                    indexA = scroll(a, indexA, strA);
                } else {
                    indexB = scroll(b, indexB, strB);
                }
            }
        }

        return count;
    }

    protected int scroll(String[] source, int start, String current) {
        int next = start + 1;
        while ((next < source.length) && source[next].equals(current)) {
            next++;
        }
        return next;
    }

}
