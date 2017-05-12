package com.harcyah.kata.codingbat.functional2;

import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class NoTeenTest {

    @Test
    public void testNoTeen() {
        NoTeen noTeen = new NoTeen();
        assertThat(noTeen.noTeen(Arrays.asList(12, 13, 19, 20))).containsExactly(12, 20);
        assertThat(noTeen.noTeen(Arrays.asList(1, 14, 1))).containsExactly(1, 1);
        assertThat(noTeen.noTeen(Arrays.asList(15))).containsExactly();
        assertThat(noTeen.noTeen(Arrays.asList(-15))).containsExactly(-15);
        assertThat(noTeen.noTeen(Arrays.asList())).containsExactly();
        assertThat(noTeen.noTeen(Arrays.asList(0, 1, 2, -3))).containsExactly(0, 1, 2, -3);
        assertThat(noTeen.noTeen(Arrays.asList(15, 17, 19, 21, 19))).containsExactly(21);
        assertThat(noTeen.noTeen(Arrays.asList(-16, 2, 15, 3, 16, 25))).containsExactly(-16, 2, 3, 25);
    }

}
