package com.harcyah.kata.reddit.medium_2016_04_06;

import com.google.common.collect.Lists;
import com.harcyah.kata.reddit.easy_2016_04_04.MagicSquareAny;
import org.paukov.combinatorics.Factory;
import org.paukov.combinatorics.Generator;
import org.paukov.combinatorics.ICombinatoricsVector;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MagicSquareRearrangerCombinatoricsImpl implements MagicSquareRearranger {

    @Override
    public List<Integer[]> getSolutions(Integer[][] square) {
        int target = MagicSquareAny.computeMagicConstant(square.length);
        List<Integer[]> solutions = Lists.newArrayList();
        Set<Integer> elements = IntStream.range(0, square.length).boxed().collect(Collectors.toSet());
        ICombinatoricsVector<Integer> vector = Factory.createVector(elements);
        Generator<Integer> generator = Factory.createPermutationGenerator(vector);
        generator.forEach(permutation -> {
            if (isMagicSquare(square, permutation, target)) {
                solutions.add(toIntegerArray(permutation));
            }
        });
        return solutions;
    }

    private Integer[] toIntegerArray(ICombinatoricsVector<Integer> permutation) {
        List<Integer> vector = permutation.getVector();
        Integer[] array = new Integer[vector.size()];
        vector.toArray(array);
        return array;
    }

    private boolean isMagicSquare(Integer[][] square, ICombinatoricsVector<Integer> permutation, int target) {
        int left = 0;
        int leftIndex = 0;
        int right = 0;
        int rightIndex = square.length - 1;
        for (int rowIndex : permutation.getVector()) {
            Integer[] row = square[rowIndex];
            left += row[leftIndex];
            right += row[rightIndex];
            if (left > target) {
                return false;
            }
            if (right > target) {
                return false;
            }
            leftIndex++;
            rightIndex--;
        }
        return (left == target) && (right == target);
    }

}
