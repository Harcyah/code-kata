package com.harcyah.kata.codingbat.functional1;

import java.util.List;
import java.util.stream.Collectors;

public class MoreY {

    public List<String> moreY(List<String> strings) {
        return strings.stream().map(x -> "y" + x + "y").collect(Collectors.toList());
    }

}
