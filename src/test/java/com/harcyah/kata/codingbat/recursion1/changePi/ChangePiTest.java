package com.harcyah.kata.codingbat.recursion1.changePi;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class ChangePiTest {

    @Test
    public void testChangePi() {
        ChangePi changePi = new ChangePi();
        Assertions.assertThat(changePi.changePi("xpix")).isEqualTo("x3.14x");
        Assertions.assertThat(changePi.changePi("pipi")).isEqualTo("3.143.14");
        Assertions.assertThat(changePi.changePi("pip")).isEqualTo("3.14p");
        Assertions.assertThat(changePi.changePi("pi")).isEqualTo("3.14");
        Assertions.assertThat(changePi.changePi("hip")).isEqualTo("hip");
        Assertions.assertThat(changePi.changePi("p")).isEqualTo("p");
        Assertions.assertThat(changePi.changePi("x")).isEqualTo("x");
        Assertions.assertThat(changePi.changePi("")).isEqualTo("");
        Assertions.assertThat(changePi.changePi("pixx")).isEqualTo("3.14xx");
        Assertions.assertThat(changePi.changePi("xyzzy")).isEqualTo("xyzzy");
    }

}
