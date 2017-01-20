package com.harcyah.kata.reddit.easy_2016_03_28;

public class EventCycleComplete implements Event {

    @Override
    public void apply(GarageDoor door) {
        door.state.onCycleComplete(door);
    }

    @Override
    public String getName() {
        return "Cycle complete";
    }

}
