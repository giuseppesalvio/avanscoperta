package com.fincons.tamagotchi.command.pattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FeedingTamagotchiTest {
    @Test
    void aggiungi_il_mangiare_alla_sazzieta(){

        Tamagotchi tamagotchi = new Tamagotchi(50,50,50,50);

        Feed feed = new Feed();

        feed.exec(tamagotchi);

        assertEquals(45, tamagotchi.getHungriness());
        assertEquals(55, tamagotchi.getFullness());
        assertEquals(50, tamagotchi.getHappiness());
        assertEquals(50, tamagotchi.getTiredness());
    }

    @Test
    void aggiungi_il_mangiare_alla_sazzieta(){

        Tamagotchi tamagotchi = new Tamagotchi(50,50,50,50);

        Play play = new Play();

        play.exec(tamagotchi);

        assertEquals(50, tamagotchi.getHungriness());
        assertEquals(50, tamagotchi.getFullness());
        assertEquals(55, tamagotchi.getHappiness());
        assertEquals(55, tamagotchi.getTiredness());
    }
}
