package org.maks.model.car;

import org.maks.model.parts.Parts;

public class Transmissoin extends Parts {
    private int index;

    public Transmissoin() {
        super("subaru", 1300, 1);
        this.index = 1;
    }

    public Transmissoin(String name, int cash, int wear, int index) {
        super(name, cash, wear);
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
