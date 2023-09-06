package org.maks.model.car;

import org.maks.model.parts.Parts;

public class Transmissoin extends Parts {
    private int index;

    public Transmissoin() {
        super("subaru", 1300);
        this.index = 10;
    }

    public Transmissoin(String name, int cash) {
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
        return "\n\n transmition name = " + name +
                "\n cash = " + cash +
                "\n wear = " + wear +
                "\n index = " + index;
    }
}
