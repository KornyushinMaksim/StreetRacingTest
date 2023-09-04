package org.maks.model.car;

import org.maks.model.parts.Parts;

public class Wheel extends Parts {

    private int index;

    public Wheel() {
        super("yokohama", 800, 1);
        this.index = 1;
    }

    public Wheel(String name, int cash, int wear, int index) {
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
