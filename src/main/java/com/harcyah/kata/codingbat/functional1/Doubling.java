package com.harcyah.kata.codingbat.functional1;

import java.util.List;
import java.util.stream.Collectors;

public class Doubling {

    public List<Integer> doubling(List<Integer> nums) {
        return nums.stream().map(x -> x * 2).collect(Collectors.toList());
    }

}
