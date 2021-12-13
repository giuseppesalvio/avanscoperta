package com.fincons.tamagotchi;

import java.util.Objects;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Tamagotchi {

    public static final int MAX_STAT = 100;
    public static final int MIN_STAT = 1;
    private int hungriness;
    private int fullness;

    public Tamagotchi(int hungriness, int fullness) {
        this.hungriness = hungriness;
        this.fullness = fullness;
    }

    protected void feed(int foodQuantity) {
        this.fullness = min(fullnessIncrement(foodQuantity), MAX_STAT);
        this.hungriness = max(hungrinessDecrease(foodQuantity), MIN_STAT);
    }

    private int hungrinessDecrease(int foodQuantity) {
        return this.hungriness - foodQuantity;
    }

    private int fullnessIncrement(int foodQuantity) {
        return this.fullness + foodQuantity;
    }

    int getFullness() {
        return fullness;
    }

    int getHungriness() {
        return hungriness;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tamagotchi that = (Tamagotchi) o;
        return hungriness == that.hungriness && fullness == that.fullness;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hungriness, fullness);
    }
}
