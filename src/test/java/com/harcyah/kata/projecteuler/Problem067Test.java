package com.harcyah.kata.projecteuler;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static com.harcyah.kata.ResourceLoader.loadLines;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem067Test {

    @Test
    public void testProblem067() throws IOException {
        int[][] triangle = new int[100][];
        List<String> lines = loadLines("/com/harcyah/kata/projecteuler/projecteuler_067.txt");
        for (int i = 0; i < lines.size(); i++) {
            String[] tokens = lines.get(i).split(" ");
            triangle[i] = new int[tokens.length];
            for (int j = 0; j < tokens.length; j++) {
                triangle[i][j] = Integer.parseInt(tokens[j]);
            }
        }

        Problem067 sut = new Problem067();
        assertEquals(7273, sut.getMaximumSumPath(triangle));
    }

}
