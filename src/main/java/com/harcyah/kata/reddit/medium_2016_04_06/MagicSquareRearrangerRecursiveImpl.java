package com.harcyah.kata.reddit.medium_2016_04_06;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.apache.commons.lang3.ArrayUtils;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.harcyah.kata.reddit.easy_2016_04_04.MagicSquareAny;

public class MagicSquareRearrangerRecursiveImpl implements MagicSquareRearranger {

	private static final List<Integer[]> EMPTY = Lists.newArrayList();

	@Override
	public List<Integer[]> getSolutions(Integer[][] square) {
		int target = MagicSquareAny.computeMagicConstant(square.length);
		List<Integer[]> solutions = Lists.newArrayList();
		for (int i = 0; i < square.length; i++) {
			Set<Integer> remaining = IntStream
				.range(0, square.length)
				.boxed()
				.collect(Collectors.toSet());
			remaining.remove(i);
			int left = target - square[i][0];
			int right = target - square[i][square.length - 1];
			Integer[] current = new Integer[square.length];
			current[0] = i;
			solutions.addAll(runOn(1, square, current, remaining, left, right));
		}
		return solutions;
	}

	private List<Integer[]> runOn(int index, Integer[][] square, Integer[] current, Set<Integer> remaining, int left, int right) {

		// Leaf case
		if (remaining.isEmpty()) {
			if ((left == 0) && (right == 0)) {
				List<Integer[]> solutions = Lists.newArrayList();
				solutions.add(current);
				return solutions;
			} else {
				return EMPTY;
			}
		} else {
			// Left diagonal overflow
			if (left < 0) {
				return EMPTY;
			}

			// Right diagonal overflow
			if (right < 0) {
				return EMPTY;
			}

			List<Integer[]> solutions = Lists.newArrayList();
			for (Integer r : remaining) {

				// Skip this branch if solution already contains this value
				if (ArrayUtils.indexOf(current, r) >= 0) {
					return EMPTY;
				}

				Integer[] row = square[r];
				int thisLeft = left - row[index];
				int thisRight = right - row[row.length - 1 - index];
				Set<Integer> thisRemaining = Sets.newHashSet(remaining);
				thisRemaining.remove(r);
				Integer[] thisCurrent = Arrays.copyOf(current, current.length);
				thisCurrent[index] = r;
				solutions.addAll(runOn(index + 1, square, thisCurrent, thisRemaining, thisLeft, thisRight));
			}
			return solutions;
		}
	}

}
