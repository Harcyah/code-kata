package com.harcyah.kata.exercism.robot_simulator;

enum Orientation implements MovementHandler {

    NORTH {
        @Override
        public Orientation toRight() {
            return EAST;
        }

        @Override
        public Orientation toLeft() {
            return WEST;
        }

        @Override
        public GridPosition advance(GridPosition original) {
            return new GridPosition(original.getX(), original.getY() + 1);
        }
    },
    EAST {
        @Override
        public Orientation toRight() {
            return SOUTH;
        }

        @Override
        public Orientation toLeft() {
            return NORTH;
        }

        @Override
        public GridPosition advance(GridPosition original) {
            return new GridPosition(original.getX() + 1, original.getY());
        }
    },
    SOUTH {
        @Override
        public Orientation toRight() {
            return WEST;
        }

        @Override
        public Orientation toLeft() {
            return EAST;
        }

        @Override
        public GridPosition advance(GridPosition original) {
            return new GridPosition(original.getX(), original.getY() - 1);
        }
    },
    WEST {
        @Override
        public Orientation toRight() {
            return NORTH;
        }

        @Override
        public Orientation toLeft() {
            return SOUTH;
        }

        @Override
        public GridPosition advance(GridPosition original) {
            return new GridPosition(original.getX() - 1, original.getY());
        }
    }

}

