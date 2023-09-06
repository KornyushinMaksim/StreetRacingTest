package org.maks.model.car;

import org.maks.model.parts.Parts;

public class Engine extends Parts {
    private int power;

    public Engine() {
        super("1ft-gt", 4500);
        this.power = 203;
    }

    public Engine(String name, int cash, int power) {
        super(name, cash);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public float resParts() {
        float res = 0;
        res = this.power / wear;
        return res;
    }

    @Override
    public String toString() {
        return "\n\n engine name = " + name +
                "\n cash = " + cash +
                "\n wear = " + wear +
                "\n power = " + power;
    }
}
