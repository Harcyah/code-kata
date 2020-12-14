package com.harcyah.kata.codingbat.map1.topping2;

import com.harcyah.kata.codingbat.MapBuilder;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class Topping2Test {

    @Test
    public void testTopping2() {
        Topping2 topping2 = new Topping2();
        assertThat(topping2.topping2(MapBuilder.build("ice cream", "cherry")))
            .isEqualTo(Map.of("yogurt", "cherry", "ice cream", "cherry"));
        assertThat(topping2.topping2(MapBuilder.build("spinach", "dirt", "ice cream", "cherry")))
            .isEqualTo(Map.of("yogurt", "cherry", "spinach", "nuts", "ice cream", "cherry"));
        assertThat(topping2.topping2(MapBuilder.build("yogurt", "salt")))
            .isEqualTo(Map.of("yogurt", "salt"));
        assertThat(topping2.topping2(MapBuilder.build("yogurt", "salt", "bread", "butter")))
            .isEqualTo(Map.of("yogurt", "salt", "bread", "butter"));
        assertThat(topping2.topping2(MapBuilder.build()))
            .isEqualTo(Map.of());
        assertThat(topping2.topping2(MapBuilder.build("salad", "oil", "ice cream", "air")))
            .isEqualTo(Map.of("salad", "oil", "yogurt", "air", "ice cream", "air"));
    }

}
