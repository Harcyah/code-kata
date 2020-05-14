package com.harcyah.kata.misc.school_attendance;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.awt.Color;
import java.util.Date;

@Getter
@AllArgsConstructor
public class Student {

    private final String firstName;
    private final String middleInitial;
    private final String lastName;
    private final Gender gender;
    private final Color favoriteColor;
    private final Date dateOfBirth;

}
