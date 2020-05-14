package com.harcyah.kata.codingbat.array1.makePi;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MakePiTest {

    @Test
    public void testMakePi() {
        MakePi makePi = new MakePi();
        assertThat(makePi.makePi()).isEqualTo(new int[]{3, 1, 4});
    }

}
