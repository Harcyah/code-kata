package com.harcyah.kata.projecteuler;

import com.google.common.collect.Lists;

import java.util.List;

public class Problem024 {

    public String getLexicographicPermutations(int nth) {
        List<Integer> remainders = toFactorialRepresentation(nth - 1);
        List<Character> lex = Lists.newArrayList('0', '1', '2', '3', '4', '5', '6', '7', '8', '9');
        StringBuilder out = new StringBuilder();
        for (int remainder : remainders) {
            char c = lex.get(remainder);
            lex.remove(remainder);
            out.append(c);
        }
        return out.toString();
    }

    public List<Integer> toFactorialRepresentation(int base10) {
        List<Integer> remainders = Lists.newArrayList();
        int f = 1;
        int q = base10;
        int r = 0;
        do {
            int t = q;
            q = q / f;
            r = t % f;
            f++;
            remainders.add(0, r);
        } while (q != 0);
        return remainders;
    }

}
