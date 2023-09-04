package org.maks.model.car;

import org.maks.model.parts.Parts;

public class Suspension extends Parts {
    private int hard;

    public Suspension(){
        super("jic", 2200, 1);
        this.hard = 2;
    }

    public Suspension(String name, int cash, int wear, int hard) {
        super(name, cash, wear);
        this.hard = hard;
    }

    public int getHard() {
        return hard;
    }

    public void setHard(int hard) {
        this.hard = hard;
    }
}
