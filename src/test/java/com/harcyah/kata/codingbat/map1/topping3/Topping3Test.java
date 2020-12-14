package com.harcyah.kata.codingbat.map1.topping3;

import com.harcyah.kata.codingbat.MapBuilder;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class Topping3Test {

    @Test
    public void testTopping3() {
        Topping3 topping3 = new Topping3();
        assertThat(topping3.topping3(MapBuilder.build("potato", "ketchup")))
            .isEqualTo(Map.of("fries", "ketchup", "potato", "ketchup"));
        assertThat(topping3.topping3(MapBuilder.build("potato", "butter")))
            .isEqualTo(Map.of("fries", "butter", "potato", "butter"));
        assertThat(topping3.topping3(MapBuilder.build("salad", "oil", "potato", "ketchup")))
            .isEqualTo(Map.of("salad", "oil", "fries", "ketchup", "spinach", "oil", "potato", "ketchup"));
        assertThat(topping3.topping3(MapBuilder.build("salad", "oil", "potato", "ketchup", "toast", "butter")))
            .isEqualTo(Map.of("salad", "oil", "fries", "ketchup", "spinach", "oil", "potato", "ketchup", "toast", "butter"));
        assertThat(topping3.topping3(MapBuilder.build()))
            .isEqualTo(Map.of());
        assertThat(topping3.topping3(MapBuilder.build("salad", "pepper", "fries", "salt")))
            .isEqualTo(Map.of("salad", "pepper", "fries", "salt", "spinach", "pepper"));
    }

}
