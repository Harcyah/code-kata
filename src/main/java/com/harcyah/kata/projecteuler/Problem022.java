package com.harcyah.kata.projecteuler;

import java.util.List;

public class Problem022 {

    public long getNamesScores(List<String> names) {
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
