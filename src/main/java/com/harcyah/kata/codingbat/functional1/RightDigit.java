package com.harcyah.kata.codingbat.functional1;

import java.util.List;
import java.util.stream.Collectors;

public class RightDigit {

    public List<Integer> rightDigit(List<Integer> nums) {
        return nums.stream().map(x -> x % 10).collect(Collectors.toList());
    }

}
