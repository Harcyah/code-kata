package com.harcyah.kata.codingbat.recursion1.changeXY;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class ChangeXYTest {

    @Test
    public void testChangeXY() {
        ChangeXY changeXY = new ChangeXY();
        Assertions.assertThat(changeXY.changeXY("codex")).isEqualTo("codey");
        Assertions.assertThat(changeXY.changeXY("xxhixx")).isEqualTo("yyhiyy");
        Assertions.assertThat(changeXY.changeXY("xhixhix")).isEqualTo("yhiyhiy");
        Assertions.assertThat(changeXY.changeXY("hiy")).isEqualTo("hiy");
        Assertions.assertThat(changeXY.changeXY("h")).isEqualTo("h");
        Assertions.assertThat(changeXY.changeXY("x")).isEqualTo("y");
        Assertions.assertThat(changeXY.changeXY("")).isEqualTo("");
        Assertions.assertThat(changeXY.changeXY("xxx")).isEqualTo("yyy");
        Assertions.assertThat(changeXY.changeXY("yyhxyi")).isEqualTo("yyhyyi");
        Assertions.assertThat(changeXY.changeXY("hihi")).isEqualTo("hihi");
    }

}
