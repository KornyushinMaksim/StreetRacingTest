package org.maks.model.car;

import org.maks.model.parts.Parts;

public class Suspension extends Parts {
    private int hard;

    public Suspension() {
        super("jic", 2200);
        this.hard = 10;
    }

    public Suspension(String name, int cash) {
        super(name, cash);
        this.hard = 10;
    }

    public int getHard() {
        return hard;
    }

    public void setHard(int hard) {
        this.hard = hard;
    }

    @Override
    public float resParts() {
        float res = this.hard / wear;
        return res;
    }

    @Override
    public String toString() {
        return "\n\n suspension name = " + name +
                "\n cash = " + cash +
                "\n wear = " + wear +
                "\n hard = " + hard;
    }
}
