package com.harcyah.kata.exercism.space_age;

public class SpaceAge {

    private static final long SECONDS_IN_YEAR = 31557600L;

    private static final double Earth_ORBITAL_PERIOD = 1.0 * SECONDS_IN_YEAR;
    private static final double Mercury_ORBITAL_PERIOD = 0.2408467 * SECONDS_IN_YEAR;
    private static final double Venus_ORBITAL_PERIOD = 0.61519726 * SECONDS_IN_YEAR;
    private static final double Mars_ORBITAL_PERIOD = 1.8808158 * SECONDS_IN_YEAR;
    private static final double Jupiter_ORBITAL_PERIOD = 11.862615 * SECONDS_IN_YEAR;
    private static final double Saturn_ORBITAL_PERIOD = 29.447498 * SECONDS_IN_YEAR;
    private static final double Uranus_ORBITAL_PERIOD = 84.016846 * SECONDS_IN_YEAR;
    private static final double Neptune_ORBITAL_PERIOD = 164.79132 * SECONDS_IN_YEAR;

    private long seconds;

    public SpaceAge(long seconds) {
        this.seconds = seconds;
    }

    public long getSeconds() {
        return seconds;
    }

    public double onEarth() {
        return seconds / Earth_ORBITAL_PERIOD;
    }

    public double onSaturn() {
        return seconds / Saturn_ORBITAL_PERIOD;
    }

    public double onJupiter() {
        return seconds / Jupiter_ORBITAL_PERIOD;
    }

    public double onMars() {
        return seconds / Mars_ORBITAL_PERIOD;
    }

    public double onUranus() {
        return seconds / Uranus_ORBITAL_PERIOD;
    }

    public double onVenus() {
        return seconds / Venus_ORBITAL_PERIOD;
    }

    public double onMercury() {
        return seconds / Mercury_ORBITAL_PERIOD;
    }

    public double onNeptune() {
        return seconds / Neptune_ORBITAL_PERIOD;
    }

}