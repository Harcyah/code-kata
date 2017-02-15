package com.harcyah.kata.exercism.matrix;

public class Matrix {

    private final int[][] cols;
    private final int[][] rows;

    public Matrix(String source) {
        String[] lines = source.split("\n");

        // Transform into rows
        this.rows = new int[lines.length][];
        for (int i=0; i<lines.length; i++) {
            String[] tokens = lines[i].split("\\s");
            this.rows[i] = new int[tokens.length];
            for (int j=0; j<tokens.length; j++) {
                this.rows[i][j] = Integer.parseInt(tokens[j]);
            }
        }

        // Transform into lines
        this.cols = new int[this.rows[0].length][];
        for (int i=0; i<this.rows[0].length; i++) {
            this.cols[i] = new int[lines.length];
            for (int j=0; j<lines.length; j++) {
                this.cols[i][j] = this.rows[j][i];
            }
        }
    }

    public int getRowsCount() {
        return rows.length;
    }

    public int getColumnsCount() {
        return cols.length;
    }

    public int[] getRow(int i) {
        return rows[i];
    }

    public int[] getColumn(int i) {
        return cols[i];
    }
}
