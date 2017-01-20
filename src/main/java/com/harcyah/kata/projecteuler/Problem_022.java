package com.harcyah.kata.projecteuler;

import java.io.IOException;
import java.util.List;

public class Problem_022 {

    public long getNamesScores(List<String> names) throws IOException {
        long sum = 0;
        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            int value = getValueOf(name);
            int rank = i + 1;
            sum += rank * value;
        }
        return sum;
    }

    protected int getValueOf(String name) {
        int sum = 0;
        for (Character c : name.toCharArray()) {
            sum += (((int) c - (int) 'A') + 1);
        }
        return sum;
    }

}
