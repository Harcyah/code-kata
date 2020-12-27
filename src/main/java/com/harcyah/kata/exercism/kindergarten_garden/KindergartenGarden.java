package com.harcyah.kata.exercism.kindergarten_garden;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class KindergartenGarden {

    private final String topRow;
    private final String bottowRow;
    private final String[] students;

    public KindergartenGarden(String garden, String[] students) {
        this.topRow = garden.substring(0, garden.indexOf('\n'));
        this.bottowRow = garden.substring(garden.indexOf('\n') + 1);
        this.students = Stream.of(students).sorted().toArray(String[]::new);
    }

    public KindergartenGarden(String garden) {
        this.topRow = garden.substring(0, garden.indexOf('\n'));
        this.bottowRow = garden.substring(garden.indexOf('\n') + 1);
        this.students = new String[] {
            "Alice", "Bob", "Charlie",
            "David", "Eve", "Fred",
            "Ginny", "Harriet", "Ileana",
            "Joseph", "Kincaid", "Larry"
        };
    }

    public List<Plant> getPlantsOfStudent(String student) {
        int index = Arrays.binarySearch(this.students, student);
        Character[] plants = new Character[4];
        plants[0] = topRow.charAt(index * 2);
        plants[1] = topRow.charAt(index * 2 + 1);
        plants[2] = bottowRow.charAt(index * 2);
        plants[3] = bottowRow.charAt(index * 2 + 1);
        return Stream.of(plants).map(Plant::getPlant).collect(Collectors.toList());
    }

}
