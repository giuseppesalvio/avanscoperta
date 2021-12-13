package com.fincons.tamagotchi;

import org.junit.jupiter.api.Test;

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

        tamagotchi.feed(5);

        assertEquals(55, tamagotchi.getFullness());
    }

    @Test
    void when_feeding_tamagotchi_that_is_alreay_full_then_fullness_not_change() {

        Tamagotchi tamagotchi = new Tamagotchi(50,99);

        tamagotchi.feed(5);

        assertEquals(100, tamagotchi.getFullness());
    }
}
