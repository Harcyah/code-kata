package com.harcyah.kata.codingbat.logic1.redTicket;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class RedTicketTest {

    @Test
    public void testRedTicket() {
        RedTicket redTicket = new RedTicket();
        Assertions.assertThat(redTicket.redTicket(2, 2, 2)).isEqualTo(10);
        Assertions.assertThat(redTicket.redTicket(2, 2, 1)).isEqualTo(0);
        Assertions.assertThat(redTicket.redTicket(0, 0, 0)).isEqualTo(5);
        Assertions.assertThat(redTicket.redTicket(2, 0, 0)).isEqualTo(1);
        Assertions.assertThat(redTicket.redTicket(1, 1, 1)).isEqualTo(5);
        Assertions.assertThat(redTicket.redTicket(1, 2, 1)).isEqualTo(0);
        Assertions.assertThat(redTicket.redTicket(1, 2, 0)).isEqualTo(1);
        Assertions.assertThat(redTicket.redTicket(0, 2, 2)).isEqualTo(1);
        Assertions.assertThat(redTicket.redTicket(1, 2, 2)).isEqualTo(1);
        Assertions.assertThat(redTicket.redTicket(0, 2, 0)).isEqualTo(0);
        Assertions.assertThat(redTicket.redTicket(1, 1, 2)).isEqualTo(0);
    }

}
