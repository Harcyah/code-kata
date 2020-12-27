package com.harcyah.kata.misc.school_attendance;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static com.harcyah.kata.ResourceLoader.loadLines;

public class SchoolAttendance {

    private final List<Student> students;

    public SchoolAttendance() throws IOException, ParseException {
        this.students = new ArrayList<>();
        this.students.addAll(read("comma.txt", new StudentsCommaParser()));
        this.students.addAll(read("pipe.txt", new StudentsPipeParser()));
        this.students.addAll(read("space.txt", new StudentsSpaceParser()));
    }

    public List<Student> read(String file, Parser parser) throws IOException, ParseException {
        List<String> lines = loadLines("/com/harcyah/kata/misc/school_attendance/" + file);
        List<Student> students = new ArrayList<>();
        for (String line : lines) {
            students.add(parser.parse(line));
        }
        return students;
    }

    public List<Student> getStudentsSortedByGenderAndLastNameAscending() {
        return students.stream()
            .sorted(Student::compareGenderAndLastName)
            .collect(Collectors.toList());
    }

    public List<Student> getStudentsSortedByBirthDateAscending() {
        return students.stream()
            .sorted(Student::compareDateOfBirth)
            .collect(Collectors.toList());
    }

    public List<Student> getStudentsSortedByLastNameAscending() {
        return students.stream()
            .sorted(Student::compareLastName)
            .collect(Collectors.toList());
    }

}
