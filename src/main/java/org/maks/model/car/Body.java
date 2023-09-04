package org.maks.model.car;

import org.maks.model.parts.Parts;

public class Body extends Parts {
    private int massa;

    public Body (){
        super("sedan", 16000, 1);
        this.massa = 1600;
    }

    public Body(String name, int cash, int wear, int massa) {
        super(name, cash, wear);
        this.massa = massa;
    }

    public int getMassa() {
        return massa;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nmassa=" + massa;
    }
}
