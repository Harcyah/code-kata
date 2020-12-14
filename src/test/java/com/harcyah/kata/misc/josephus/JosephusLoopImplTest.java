package com.harcyah.kata.misc.josephus;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class JosephusLoopImplTest {

    protected JosephusLoopImpl josephus = new JosephusLoopImpl();

    @Test
    public void testWith5PeopleAndStep3() {
        assertThat(josephus.getLastManStanding(5, 3)).isEqualTo(3);
    }

    @Test
    public void testWith10PeopleAndStep4() {
        assertThat(josephus.getLastManStanding(10, 4)).isEqualTo(4);
    }

    @Test
    public void testWith100PeopleAndStep2() {
        assertThat(josephus.getLastManStanding(100, 2)).isEqualTo(72);
    }

}
