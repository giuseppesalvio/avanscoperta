package com.fincons.tamagotchi;

import org.junit.jupiter.api.Test;

import static com.fincons.tamagotchi.TamagotchiAAAAA.MAX_STAT;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FeedingTamagotchiTest {

    @Test
    void when_feeding_tamagotchi_then_hungriness_decrease() {

        TamagotchiAAAAA tamagotchiAAAAA = new TamagotchiAAAAA(50, 50);

        tamagotchiAAAAA.feed(5);

        assertEquals(45, tamagotchiAAAAA.getHungriness());
    }

    @Test
    void when_feeding_tamagotchi_then_fullness_increase() {

        TamagotchiAAAAA tamagotchiAAAAA = new TamagotchiAAAAA(50,50);

        tamagotchiAAAAA.feed(10);

        assertEquals(60, tamagotchiAAAAA.getFullness());
    }

    @Test
    void when_feeding_tamagotchi_over_max_fullness_then_fullness_stay_at_max_value() {

        TamagotchiAAAAA tamagotchiAAAAA = new TamagotchiAAAAA(50,99);

        tamagotchiAAAAA.feed(5);

        assertEquals(MAX_STAT, tamagotchiAAAAA.getFullness());
        assertEquals(45, tamagotchiAAAAA.getHungriness());
    }

    @Test
    void when_feeding_tamagotchi_belove_min_hungriness_then_hungriness_stay_at_min_value() {

        TamagotchiAAAAA tamagotchiAAAAA = new TamagotchiAAAAA(4,50);

        tamagotchiAAAAA.feed(5);

        assertEquals(55, tamagotchiAAAAA.getFullness());
        assertEquals(1, tamagotchiAAAAA.getHungriness());
    }

}
