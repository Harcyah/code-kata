package com.harcyah.kata.reddit.medium_2016_04_06;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.harcyah.kata.reddit.easy_2016_04_04.MagicSquareAny;

public class MagicSquareRearranger {

	public List<List<Integer>> getSolutions(Integer[][] square) {
		int target = MagicSquareAny.computeMagicConstant(square.length);
		List<List<Integer>> solutions = Lists.newArrayList();
		for (int i = 0; i < square.length; i++) {
			Set<Integer> remaining = IntStream
				.range(0, square.length)
				.boxed()
				.collect(Collectors.toSet());
			remaining.remove(i);
			int leftSum = square[i][0];
			int rightSum = square[i][square.length - 1];
			List<Integer> current = Lists.newArrayList(i);
			solutions.addAll(runOn(square, current, remaining, leftSum, rightSum, target));
		}
		return solutions;
	}

	private List<List<Integer>> runOn(Integer[][] square, List<Integer> current, Set<Integer> remaining, int leftSum, int rightSum, int target) {
		List<List<Integer>> solutions = Lists.newArrayList();

		// Left diagonal overflow
		if ((leftSum > target) && (remaining.size() > 0)) {
			return solutions;
		}

		// Right diagonal overflow
		if ((rightSum > target) && (remaining.size() > 0)) {
			return solutions;
		}

		if (remaining.isEmpty()) {
			boolean leftSuccess = leftSum == target;
			boolean rightSuccess = rightSum == target;
			if (leftSuccess && rightSuccess) {
				solutions.add(current);
				return solutions;
			} else {
				return solutions;
			}
		} else {
			int index = current.size();
			Iterator<Integer> iterator = remaining.iterator();
			while (iterator.hasNext()) {
				Integer x = iterator.next();
				Integer[] row = square[x];

				int thisLeftSum = leftSum + row[index];
				int thisRightSum = rightSum + row[row.length - 1 - index];
				Set<Integer> thisRemaining = Sets.newHashSet(remaining);
				thisRemaining.remove(x);
				List<Integer> thisCurrent = new ArrayList<>(current);
				thisCurrent.add(x);
				solutions.addAll(runOn(square, thisCurrent, thisRemaining, thisLeftSum, thisRightSum, target));
			}
			return solutions;
		}
	}

}
