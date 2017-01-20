package com.harcyah.kata.misc.school_attendance;

public enum Gender {

    FEMALE,
    MALE;

    public static Gender from(String value) {
        switch (value) {
            case "m":
            case "M":
            case "Male":
                return MALE;
            case "f":
            case "F":
            case "Female":
                return FEMALE;
            default:
                throw new IllegalArgumentException(value + " is unsupported");
        }
    }
}
