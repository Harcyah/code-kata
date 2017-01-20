package com.harcyah.kata.codingbat.array1.makePi;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class MakePiTest {

    @Test
    public void testMakePi() {
        MakePi makePi = new MakePi();
        Assertions.assertThat(makePi.makePi()).isEqualTo(new int[]{3, 1, 4});
    }

}
