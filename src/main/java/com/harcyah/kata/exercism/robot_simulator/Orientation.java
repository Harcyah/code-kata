package com.harcyah.kata.exercism.robot_simulator;

import com.harcyah.kata.exercism.robot_simulator.MovementHandler;

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
            return new GridPosition(original.x, original.y + 1);
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
            return new GridPosition(original.x + 1, original.y);
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
            return new GridPosition(original.x, original.y - 1);
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
            return new GridPosition(original.x - 1, original.y);
        }
    };


}

