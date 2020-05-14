package com.harcyah.kata.reddit.easy_2016_03_28;

import com.google.common.collect.ImmutableList;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class GarageDoorTest {

    @Test
    public void testGarageDoorOpening() {
        List<Event> events = ImmutableList.of(
                new EventButton(),
                new EventCycleComplete(),
                new EventButton(),
                new EventButton(),
                new EventButton(),
                new EventButton(),
                new EventButton(),
                new EventCycleComplete());

        GarageDoor door = new GarageDoor();
        door.process(events);
        assertThat(door.getState()).isEqualTo(State.CLOSED);
    }

}
