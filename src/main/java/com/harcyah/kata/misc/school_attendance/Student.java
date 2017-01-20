package com.harcyah.kata.misc.school_attendance;

import java.awt.*;
import java.util.Date;

public class Student {

    private final String firstName;
    private final String middleInitial;
    private final String lastName;
    private final Gender gender;
    private final Color favoriteColor;
    private final Date dateOfBirth;

    public Student(String firstName, String middleInitial, String lastName, Gender gender, Color favoriteColor, Date dateOfBirth) {
        this.firstName = firstName;
        this.middleInitial = middleInitial;
        this.lastName = lastName;
        this.gender = gender;
        this.favoriteColor = favoriteColor;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleInitial() {
        return middleInitial;
    }

    public String getLastName() {
        return lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public Color getFavoriteColor() {
        return favoriteColor;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }
}
