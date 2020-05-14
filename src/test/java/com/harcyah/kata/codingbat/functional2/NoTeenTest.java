package com.harcyah.kata.codingbat.functional2;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class NoTeenTest {

    @Test
    public void testNoTeen() {
        NoTeen noTeen = new NoTeen();
        assertThat(noTeen.noTeen(List.of(12, 13, 19, 20)))
            .containsExactly(12, 20);
        assertThat(noTeen.noTeen(List.of(1, 14, 1)))
            .containsExactly(1, 1);
        assertThat(noTeen.noTeen(List.of(15)))
            .containsExactly();
        assertThat(noTeen.noTeen(List.of(-15)))
            .containsExactly(-15);
        assertThat(noTeen.noTeen(List.of()))
            .containsExactly();
        assertThat(noTeen.noTeen(List.of(0, 1, 2, -3)))
            .containsExactly(0, 1, 2, -3);
        assertThat(noTeen.noTeen(List.of(15, 17, 19, 21, 19)))
            .containsExactly(21);
        assertThat(noTeen.noTeen(List.of(-16, 2, 15, 3, 16, 25)))
            .containsExactly(-16, 2, 3, 25);
    }

}
