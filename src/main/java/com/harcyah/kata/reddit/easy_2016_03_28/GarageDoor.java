package com.harcyah.kata.reddit.easy_2016_03_28;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class GarageDoor {

    private State state = State.CLOSED;

    public void process(List<Event> events) {
        for (Event event : events) {
            event.apply(this);
        }
    }

}
