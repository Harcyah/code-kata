package com.harcyah.kata.codingbat.recursion1.changeXY;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ChangeXyTest {

    @Test
    public void testChangeXy() {
        ChangeXY sut = new ChangeXY();
        assertThat(sut.changeXY("codex")).isEqualTo("codey");
        assertThat(sut.changeXY("xxhixx")).isEqualTo("yyhiyy");
        assertThat(sut.changeXY("xhixhix")).isEqualTo("yhiyhiy");
        assertThat(sut.changeXY("hiy")).isEqualTo("hiy");
        assertThat(sut.changeXY("h")).isEqualTo("h");
        assertThat(sut.changeXY("x")).isEqualTo("y");
        assertThat(sut.changeXY("")).isEqualTo("");
        assertThat(sut.changeXY("xxx")).isEqualTo("yyy");
        assertThat(sut.changeXY("yyhxyi")).isEqualTo("yyhyyi");
        assertThat(sut.changeXY("hihi")).isEqualTo("hihi");
    }

}
