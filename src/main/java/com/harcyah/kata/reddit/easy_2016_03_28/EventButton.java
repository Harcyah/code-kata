package com.harcyah.kata.reddit.easy_2016_03_28;

public class EventButton implements Event {

    @Override
    public void apply(GarageDoor door) {
        door.state.onButton(door);
    }

    @Override
    public String getName() {
        return "Button clicked";
    }

}
