package com.harcyah.kata.reddit.easy_2016_02_22;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayingWithLightSwitchesTest {

    protected PlayingWithLightSwitches switches = new PlayingWithLightSwitches();

    @Test
    public void testBasicExample() {
        assertEquals(7, switches.apply(10, List.of(new Range[]{
            new Range(3, 6),
            new Range(0, 4),
            new Range(7, 3),
            new Range(9, 9)})));
    }

    @Test
    public void testChallengeExample() {
        assertEquals(423, switches.apply(1000, List.of(
            new Range(616, 293),
            new Range(344, 942),
            new Range(27, 524),
            new Range(716, 291),
            new Range(860, 284),
            new Range(74, 928),
            new Range(970, 594),
            new Range(832, 772),
            new Range(343, 301),
            new Range(194, 882),
            new Range(948, 912),
            new Range(533, 654),
            new Range(242, 792),
            new Range(408, 34),
            new Range(162, 249),
            new Range(852, 693),
            new Range(526, 365),
            new Range(869, 303),
            new Range(7, 992),
            new Range(200, 487),
            new Range(961, 885),
            new Range(678, 828),
            new Range(441, 152),
            new Range(394, 453)
        )));
    }

    @Test
    public void testFattyBoomBoomExample() throws IOException {
        assertEquals(2500245, switches.applyFrom(getClass().getResourceAsStream("lots_of_switches.txt")));
    }

}
