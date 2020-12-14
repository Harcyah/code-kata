package com.harcyah.kata.codingbat.logic1.blueTicket;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BlueTicketTest {

    @Test
    public void testBlueTicket() {
        BlueTicket blueTicket = new BlueTicket();
        assertThat(blueTicket.blueTicket(9, 1, 0)).isEqualTo(10);
        assertThat(blueTicket.blueTicket(9, 2, 0)).isEqualTo(0);
        assertThat(blueTicket.blueTicket(6, 1, 4)).isEqualTo(10);
        assertThat(blueTicket.blueTicket(6, 1, 5)).isEqualTo(0);
        assertThat(blueTicket.blueTicket(10, 0, 0)).isEqualTo(10);
        assertThat(blueTicket.blueTicket(15, 0, 5)).isEqualTo(5);
        assertThat(blueTicket.blueTicket(5, 15, 5)).isEqualTo(10);
        assertThat(blueTicket.blueTicket(4, 11, 1)).isEqualTo(5);
        assertThat(blueTicket.blueTicket(13, 2, 3)).isEqualTo(5);
        assertThat(blueTicket.blueTicket(8, 4, 3)).isEqualTo(0);
        assertThat(blueTicket.blueTicket(8, 4, 2)).isEqualTo(10);
        assertThat(blueTicket.blueTicket(8, 4, 1)).isEqualTo(0);
    }

}
