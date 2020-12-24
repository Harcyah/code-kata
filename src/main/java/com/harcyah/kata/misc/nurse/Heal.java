package com.harcyah.kata.misc.nurse;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Heal {

    DEUBLE_TOILETTE(45, 2090),
    TOILETTE(30, 1045),
    PANS_SIMPLE(15, 880),
    PANS_DIFF(30, 1500),
    SOUS_CUT(10, 700),
    PRISE_SANG(10, 780);

    private final int duration;
    private final int cost;

}
