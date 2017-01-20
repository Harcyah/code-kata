package com.harcyah.kata.reddit.easy_2016_03_28;

import java.util.List;

public class GarageDoor {

    protected State state = State.CLOSED;

    public void process(List<Event> events) {
        for (Event event : events) {
            System.out.println("Door: " + state.name());
            System.out.println("> " + event.getName() + ".");
            event.apply(this);
        }
    }

}
