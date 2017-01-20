package com.harcyah.kata.pape;

// http://www.home.hs-karlsruhe.de/~pach0003/informatik_1/aufgaben/en/flowcontrol.html#multiplication_table
public class MultiplicationTable {

    public int[][] get(int start, int end) {
        int range = (end - start) + 1;
        int[][] table = new int[range][];
        for (int i = 0; i < range; i++) {
            table[i] = new int[range];
            for (int j = 0; j < range; j++) {
                table[i][j] = (i + start) * (j + start);
            }
        }
        return table;
    }

}
