package com.harcyah.kata.misc.school_attendance;

import com.google.common.collect.ComparisonChain;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.awt.Color;
import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class Student {

    private final String firstName;
    private final String middleInitial;
    private final String lastName;
    private final Gender gender;
    private final Color favoriteColor;
    private final LocalDate dateOfBirth;

    public static int compareDateOfBirth(Student left, Student right) {
        return left.dateOfBirth.compareTo(right.dateOfBirth);
    }

    public static int compareLastName(Student left, Student right) {
        return left.lastName.compareTo(right.lastName);
    }

    public static int compareGenderAndLastName(Student left, Student right) {
        return ComparisonChain.start()
            .compare(left.gender, right.gender)
            .compare(left.lastName, right.lastName)
            .result();
    }

}
