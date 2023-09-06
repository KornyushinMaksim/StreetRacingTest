package org.maks.model.car;

import org.maks.model.parts.Parts;

public class Wheel extends Parts {

    private int index;

    public Wheel() {
        super("yokohama", 800);
        this.index = 10;
    }

    public Wheel(String name, int cash) {
        super(name, cash);
        this.index = 10;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public float resParts() {
        float res = this.index / wear;
        return res;
    }

    @Override
    public String toString() {
        return "\n\n while name = " + name +
                "\n cash = " + cash +
                "\n wear = " + wear +
                "\n index = " + index;
    }
}
