package com.harcyah.kata.codingbat.logic1.greenTicket;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class GreenTicketTest {

    @Test
    public void testGreenTicket() {
        GreenTicket greenTicket = new GreenTicket();
        Assertions.assertThat(greenTicket.greenTicket(1, 2, 3)).isEqualTo(0);
        Assertions.assertThat(greenTicket.greenTicket(2, 2, 2)).isEqualTo(20);
        Assertions.assertThat(greenTicket.greenTicket(1, 1, 2)).isEqualTo(10);
        Assertions.assertThat(greenTicket.greenTicket(2, 1, 1)).isEqualTo(10);
        Assertions.assertThat(greenTicket.greenTicket(1, 2, 1)).isEqualTo(10);
        Assertions.assertThat(greenTicket.greenTicket(3, 2, 1)).isEqualTo(0);
        Assertions.assertThat(greenTicket.greenTicket(0, 0, 0)).isEqualTo(20);
        Assertions.assertThat(greenTicket.greenTicket(2, 0, 0)).isEqualTo(10);
        Assertions.assertThat(greenTicket.greenTicket(0, 9, 10)).isEqualTo(0);
        Assertions.assertThat(greenTicket.greenTicket(0, 10, 0)).isEqualTo(10);
        Assertions.assertThat(greenTicket.greenTicket(9, 9, 9)).isEqualTo(20);
        Assertions.assertThat(greenTicket.greenTicket(9, 0, 9)).isEqualTo(10);
    }

}
