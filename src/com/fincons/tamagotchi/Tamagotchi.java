package com.fincons.tamagotchi;

import java.util.Objects;

public class Tamagotchi {

    private int hungriness;
    private int fullness;

    public Tamagotchi(int hungriness, int fullness) {
        this.hungriness = hungriness;
        this.fullness = fullness;
    }

    protected void feed(int foodQuantity) {
        this.fullness = this.fullness + 5;
        if (this.fullness > 100) {
            this.fullness = 100;
        }
        this.hungriness = this.hungriness - 5;
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
