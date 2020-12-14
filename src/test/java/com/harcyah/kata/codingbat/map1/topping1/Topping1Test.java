package com.harcyah.kata.codingbat.map1.topping1;

import com.harcyah.kata.codingbat.MapBuilder;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class Topping1Test {

    @Test
    public void testTopping1() {
        Topping1 topping1 = new Topping1();
        assertThat(topping1.topping1(MapBuilder.build("ice cream", "peanuts")))
            .isEqualTo(Map.of("bread", "butter", "ice cream", "cherry"));
        assertThat(topping1.topping1(MapBuilder.build()))
            .isEqualTo(Map.of("bread", "butter"));
        assertThat(topping1.topping1(MapBuilder.build("pancake", "syrup")))
            .isEqualTo(Map.of("bread", "butter", "pancake", "syrup"));
        assertThat(topping1.topping1(MapBuilder.build("bread", "dirt", "ice cream", "strawberries")))
            .isEqualTo(Map.of("bread", "butter", "ice cream", "cherry"));
        assertThat(topping1.topping1(MapBuilder.build("salad", "oil", "bread", "jam", "ice cream", "strawberries")))
            .isEqualTo(Map.of("salad", "oil", "bread", "butter", "ice cream", "cherry"));
    }

}
