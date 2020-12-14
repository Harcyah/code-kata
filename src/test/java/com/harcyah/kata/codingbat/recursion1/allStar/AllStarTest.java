package com.harcyah.kata.codingbat.recursion1.allStar;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AllStarTest {

    @Test
    public void testAllStar() {
        AllStar allStar = new AllStar();
        assertThat(allStar.allStar("hello")).isEqualTo("h*e*l*l*o");
        assertThat(allStar.allStar("abc")).isEqualTo("a*b*c");
        assertThat(allStar.allStar("ab")).isEqualTo("a*b");
        assertThat(allStar.allStar("a")).isEqualTo("a");
        assertThat(allStar.allStar("")).isEqualTo("");
        assertThat(allStar.allStar("3.14")).isEqualTo("3*.*1*4");
        assertThat(allStar.allStar("Chocolate")).isEqualTo("C*h*o*c*o*l*a*t*e");
        assertThat(allStar.allStar("1234")).isEqualTo("1*2*3*4");
    }

}
