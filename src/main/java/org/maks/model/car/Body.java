package org.maks.model.car;

import org.maks.model.parts.Parts;

public class Body extends Parts {
    private int massa;

    public Body() {
        super("sedan", 16000);
        this.massa = 1600;
    }

    public Body(String name, int cash, int massa) {
        super(name, cash);
        this.massa = massa;
    }

    public int getMassa() {
        return massa;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }

    @Override
    public float resParts() {
        float res = this.massa / 10;
        return res ;
    }

    @Override
    public String toString() {
        return "\n\n body name = " + name +
                "\n cash = " + cash +
                "\n wear = " + wear +
                "\n massa = " + massa;
    }
}
