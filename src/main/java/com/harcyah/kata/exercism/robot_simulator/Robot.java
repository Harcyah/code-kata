package com.harcyah.kata.exercism.robot_simulator;

final class Robot {

    private GridPosition gridPosition;
    private Orientation orientation;

    public Robot(GridPosition gridPosition, Orientation orientation) {
        this.gridPosition = gridPosition;
        this.orientation = orientation;
    }

    public GridPosition getGridPosition() {
        return gridPosition;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public void turnRight() {
        this.orientation = orientation.toRight();
    }

    public void turnLeft() {
        this.orientation = orientation.toLeft();
    }

    public void advance() {
        this.gridPosition = orientation.advance(gridPosition);
    }

    public void simulate(String orders) {
        for (char c : orders.toCharArray()) {
            switch (c) {
                case 'A':
                    advance();
                    break;
                case 'R':
                    turnRight();
                    break;
                case 'L':
                    turnLeft();
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        }
    }
}
