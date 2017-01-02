package com.harcyah.kata.exercism.robot_simulator;

public interface MovementHandler {

    Orientation toRight();

    Orientation toLeft();

    GridPosition advance(GridPosition original);

}
