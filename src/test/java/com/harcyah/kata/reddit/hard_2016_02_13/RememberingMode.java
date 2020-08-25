package com.harcyah.kata.reddit.hard_2016_02_13;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class RememberingMode implements Mode {

    private final List<Character> characters = new ArrayList<>();

    @Override
    public void putChar(Terminal terminal, char c) {
        characters.add(c);
    }

}
