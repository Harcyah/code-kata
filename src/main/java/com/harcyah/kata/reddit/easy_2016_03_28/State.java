package com.harcyah.kata.reddit.easy_2016_03_28;

public enum State implements EventHandler {

    CLOSED {
        @Override
        public void onButton(GarageDoor door) {
            door.setState(OPENING);
        }

        @Override
        public void onCycleComplete(GarageDoor door) {
            throw new UnsupportedOperationException();
        }

    },

    CLOSING {
        @Override
        public void onButton(GarageDoor door) {
            door.setState(STOPPED_WHILE_CLOSING);
        }

        @Override
        public void onCycleComplete(GarageDoor door) {
            door.setState(CLOSED);
        }

    },

    STOPPED_WHILE_CLOSING {
        @Override
        public void onButton(GarageDoor door) {
            door.setState(OPENING);
        }

        @Override
        public void onCycleComplete(GarageDoor door) {
            throw new UnsupportedOperationException();
        }

    },

    OPEN {
        @Override
        public void onButton(GarageDoor door) {
            door.setState(CLOSING);
        }

        @Override
        public void onCycleComplete(GarageDoor door) {
            throw new UnsupportedOperationException();
        }

    },

    OPENING {
        @Override
        public void onButton(GarageDoor door) {
            door.setState(STOPPED_WHILE_OPENING);
        }

        @Override
        public void onCycleComplete(GarageDoor door) {
            door.setState(OPEN);
        }

    },

    STOPPED_WHILE_OPENING {
        @Override
        public void onButton(GarageDoor door) {
            door.setState(State.CLOSING);
        }

        @Override
        public void onCycleComplete(GarageDoor door) {
            throw new UnsupportedOperationException();
        }

    }

}
