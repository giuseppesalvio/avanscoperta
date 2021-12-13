package com.fincons.tamagotchi;

import org.junit.jupiter.api.Test;

import static com.fincons.tamagotchi.Tamagotchi.MAX_STAT;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FeedingTamagotchi {

    @Test
    void when_feeding_tamagotchi_then_hungriness_decrease() {

        Tamagotchi tamagotchi = new Tamagotchi(50, 50);

        tamagotchi.feed(5);

        assertEquals(45, tamagotchi.getHungriness());
    }

    @Test
    void when_feeding_tamagotchi_then_fullness_increase() {

        Tamagotchi tamagotchi = new Tamagotchi(50,50);

        tamagotchi.feed(10);

        assertEquals(60, tamagotchi.getFullness());
    }

    @Test
    void when_feeding_tamagotchi_over_max_fullness_then_fullness_stay_at_max_value() {

        Tamagotchi tamagotchi = new Tamagotchi(50,99);

        tamagotchi.feed(5);

        assertEquals(MAX_STAT, tamagotchi.getFullness());
        assertEquals(45, tamagotchi.getHungriness());
    }

    @Test
    void when_feeding_tamagotchi_belove_min_hungriness_then_hungriness_stay_at_min_value() {

        Tamagotchi tamagotchi = new Tamagotchi(4,50);

        tamagotchi.feed(5);

        assertEquals(55, tamagotchi.getFullness());
        assertEquals(1, tamagotchi.getHungriness());
    }

}
